package game.logic.objects.enemys;

import game.logic.objects.bullets.AbstractBulletFactory;
import game.logic.objects.bullets.Bullet;
import game.logic.objects.Ship;
import game.logic.objects.bullets.NormalBulletFactory;

import java.awt.image.BufferedImage;

/**
 * Класс врага определяющий его поведение
 */
public class Enemy extends Ship {

    public Enemy(int x, int y, int hp, int speed, AbstractBulletFactory bulletFactory, BufferedImage image) {
        super(x, y, hp, speed, bulletFactory, image);
    }

    public void move(){
        //TODO логика врага
    }
}
