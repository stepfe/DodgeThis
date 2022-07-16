package game.logic.objects;

import game.logic.objects.bullets.AbstractBulletFactory;

public class Player extends Ship{

    public static final String LEFT = "L";
    public static final String RIGHT = "R";
    public static final String UP = "U";
    public static final String DOWN = "D";

    public Player(int x, int y, int hp, int speed, AbstractBulletFactory bulletFactory) {
        super(x, y, hp, speed, bulletFactory);
    }

    public void move(String direction){
        //TODO Движение игрока
    }

    public boolean isAlive(){
        return hp > 0;
    }
}
