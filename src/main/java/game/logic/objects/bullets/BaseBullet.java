package game.logic.objects.bullets;

import game.logic.objects.DrawableObject;
import game.logic.objects.GameObject;

import java.awt.image.BufferedImage;

/**
 * Класс пули
 */
public class BaseBullet extends DrawableObject {
    private int damage;
    private int speed;
    private int speedX;
    private int speedY;

    public BaseBullet(GameObject startPosition, GameObject targetPosition, int speed, int damage, BufferedImage image) {
        super(startPosition.getX(), startPosition.getY(), image);
        this.damage = damage;
        this.speed = speed;
        calculateSpeed(targetPosition.getX(), targetPosition.getY());
    }


    public int getSpeed() {
        return speed;
    }

    public int getDamage() {
        return damage;
    }

    /**
     * Движение пули в заданном направлении
     */
    public void move(){
        setX(getX() + speedX);
        setY(getY() + speedY);
    }

    private void calculateSpeed(int targetX, int targetY){

        int x = (targetX - getX())/speed;
        int y = (targetY - getY())/speed;
        int z = (int)Math.sqrt(x * x + y * y);

        speedY = speed * y / z;
        speedX = speed * x / z;
    }
}
