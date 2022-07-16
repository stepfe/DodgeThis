package game.logic.objects.enemys;

import game.logic.objects.bullets.Bullet;
import game.logic.objects.Ship;
import game.logic.objects.bullets.NormalBulletFactory;

public class Enemy extends Ship {

    public Enemy(int x, int y, int hp, int speed, NormalBulletFactory bulletFactory) {
        super(x, y, hp, speed, bulletFactory);
    }

    public void move(){
        //TODO логика врага
    }
}
