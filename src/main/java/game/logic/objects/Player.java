package game.logic.objects;

import game.logic.objects.bullets.AbstractBulletFactory;

import java.awt.image.BufferedImage;

/**
 * Корабль игрока
 */
public class Player extends Ship{

    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int UP = 2;
    public static final int DOWN = 3;

    public Player(int x, int y, int hp, int speed, AbstractBulletFactory bulletFactory, BufferedImage image) {
        super(x, y, hp, speed, bulletFactory, image);
    }

    /**
     * Движение игрока в заданном направлении
     * @param direction направление
     */
    public void move(int direction) {
        switch (direction) {
            case LEFT : moveLeft();
                break;
            case RIGHT: moveRight();
                break;
            case UP: moveUp();
                break;
            case DOWN: moveDown();
                break;
        }
    }

    /**
     * @return Жив ли игрок в зависимости от его здоровья
     */
    public boolean isAlive() {
        return hp > 0;
    }

    protected void moveLeft() {
        this.x--;
    }

    protected void moveRight() {
        this.x++;
    }

    protected void moveUp() {
        this.y--;
    }

    protected void moveDown() {
        this.y++;
    }
}
