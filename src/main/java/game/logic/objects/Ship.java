package game.logic.objects;

import game.logic.objects.bullets.AbstractBulletFactory;
import game.logic.objects.bullets.Bullet;

import java.util.LinkedList;
import java.util.List;

public class Ship extends GameObject{
    protected int hp;
    protected int speed;
    AbstractBulletFactory bulletFactory;
    List<ShootListener> listeners;
    GameObject target;

    public Ship(int x, int y, int hp, int speed, AbstractBulletFactory bulletFactory) {
        super(x, y);
        this.hp = hp;
        this.speed = speed;
        this.bulletFactory = bulletFactory;
        this.listeners = new LinkedList<ShootListener>();
    }

    public void shoot(){
        Bullet bullet = bulletFactory.createBullet(this, target);
        for (ShootListener listener: listeners) {
            listener.onShoot(bullet);
        }
    }
}
