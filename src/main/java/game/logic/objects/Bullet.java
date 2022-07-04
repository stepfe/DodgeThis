package game.logic.objects;

public class Bullet extends GameObject{
    private int damage;
    private int speed;
    private int speedX;
    private int speedY;

    public Bullet(int x, int y, int targetX, int targetY, int speed, int damage) {
        super(x, y);
        this.damage = damage;
        this.speed = speed;
        calculateSpeed(targetX, targetY);
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
