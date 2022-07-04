package game.logic.objects.enemys;

import game.logic.objects.Bullet;
import game.logic.objects.Ship;

public class Enemy extends Ship {

    public Enemy(int x, int y, int hp, int speed, Bullet bulletToShot) {
        super(x, y, hp, speed, bulletToShot);
    }

    public void move(){
        //TODO логика врага
    }
}
