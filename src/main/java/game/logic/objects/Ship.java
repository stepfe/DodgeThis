package game.logic.objects;

import java.util.LinkedList;
import java.util.List;

public class Ship extends GameObject{
    protected int hp;
    protected int speed;
    Bullet bulletToShot;
    List<ShootListener> listeners;
    GameObject target;

    public Ship(int x, int y, int hp, int speed, Bullet bulletToShot) {
        super(x, y);
        this.hp = hp;
        this.speed = speed;
        this.bulletToShot = bulletToShot;
        this.listeners = new LinkedList<ShootListener>();
    }

    public void shoot(){
        //TODO разные типы пуль
        Bullet bullet = new Bullet(getX(), getY(), target.getX(), target.getY()
                , bulletToShot.getSpeed()
                , bulletToShot.getDamage());
        for (ShootListener listener: listeners) {
            listener.onShoot(bullet);
        }
    }
}
