package game.logic.objects.bullets;

import game.logic.objects.GameObject;

public class Bullet extends GameObject {
    private int damage;
    private int speed;
    private int speedX;
    private int speedY;

    public Bullet(GameObject startPosition, GameObject targetPosition, int speed, int damage) {
        super(startPosition.getX(), startPosition.getY());
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
