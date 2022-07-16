package game.logic.objects;

import game.logic.objects.bullets.AbstractBulletFactory;
import game.logic.objects.bullets.BaseBullet;

import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.List;

/**
 * Базовый класс всех кораблей (врагов и игрока)
 */
public class Ship extends DrawableObject{
    protected int hp;
    protected int speed;
    AbstractBulletFactory bulletFactory;
    List<ShootListener> listeners;
    GameObject target;

    public Ship(int x, int y, int hp, int speed, AbstractBulletFactory bulletFactory, BufferedImage image) {
        super(x, y, image);
        this.hp = hp;
        this.speed = speed;
        this.bulletFactory = bulletFactory;
        this.listeners = new LinkedList<ShootListener>();
    }

    /**
     * Создает новую пулю и оповещает всех слушателей о новом объекте на игровой сцене
     */
    public void shoot(){
        BaseBullet bullet = bulletFactory.createBullet(this, target);
        notifyAllListeners(bullet);
    }

    /**
     * Поворачивает объект в сторону указанного объекта
     * @param target объект в сторону которого необходимо повернуться
     */
    public void rotateTo(GameObject target) {

    }

    private void notifyAllListeners(BaseBullet bullet) {
        for (ShootListener listener: listeners) {
            listener.onShoot(bullet);
        }
    }
}
