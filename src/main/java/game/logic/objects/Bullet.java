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
    }

    private void calculateSpeed(int targetX, int targetY){
//TODO::Расчет состовляющих скорости
//        speedX = (targetX - getX())/speed;
//        speedY = (targetY - getY())/speed;
    }


    public int getSpeed() {
        return speed;
    }

    public int getDamage() {
        return damage;
    }

    void move(){
        setX(getX() + speedX);
        setY(getY() + speedY);
    }
}
