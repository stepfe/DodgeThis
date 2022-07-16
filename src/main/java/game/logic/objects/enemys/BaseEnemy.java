package game.logic.objects.enemys;

import game.logic.objects.bullets.AbstractBulletFactory;
import game.logic.objects.Ship;

import java.awt.image.BufferedImage;

/**
 * Класс врага определяющий его поведение
 */
public class BaseEnemy extends Ship {

    public BaseEnemy(int x, int y, int hp, int speed, AbstractBulletFactory bulletFactory, BufferedImage image) {
        super(x, y, hp, speed, bulletFactory, image);
    }

    public void move(){
        //TODO логика врага
    }
}
