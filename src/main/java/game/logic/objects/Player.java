package game.logic.objects;

public class Player extends Ship{

    public Player(int x, int y, int hp, int speed, Bullet bulletToShot) {
        super(x, y, hp, speed, bulletToShot);
    }

    void move(String direction){
        //TODO Движение игрока
    }

    boolean isAlive(){
        return hp > 0;
    }
}
