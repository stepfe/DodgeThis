package game.logic;

import game.logic.objects.DrawableObject;
import game.logic.objects.bullets.BaseBullet;
import game.logic.objects.Player;
import game.logic.objects.ShootListener;
import game.logic.objects.bullets.BaseBulletFactory;
import game.logic.objects.enemys.BaseEnemy;

import java.util.HashSet;
import java.util.Set;

/**
 * Игровая логика совмещающая в себе все игровые объекты и налаживающая их взаимодействие
 */
public class GameLogic implements ShootListener {

    private Player player;
    private Set<BaseEnemy> enemies;
    private Set<BaseBullet> bullets;
    private ImageLoader imageLoader;

    public GameLogic() {
        imageLoader = ImageLoader.getInstance();
        clearObjects();
        player = new Player(500, 500, 10, 5, new BaseBulletFactory(), imageLoader.getPlayerImage());
    }

    /**
     * Шаг игрового цикла
     */
    public void nextGameIteration() {
        moveBullets();
        moveEnemies();
    }

    /**
     * Добавление врага на игровую сцену
     * @param enemy новый враг
     */
    public void addEnemy(BaseEnemy enemy) {
        enemies.add(enemy);
    }

    @Override
    public void onShoot(BaseBullet bullet) {
        bullets.add(bullet);
    }

    /**
     * @return все враги на игровой сцене
     */
    public Set<BaseEnemy> getAllEnemies() {
        return enemies;
    }

    /**
     * @return все игровые объекты для рисования
     */
    public Set<DrawableObject> getAllDrawableObjects() {
        Set<DrawableObject> drawableObjects = new HashSet<>();

        drawableObjects.addAll(enemies);
        drawableObjects.addAll(bullets);
        drawableObjects.add(player);

        return drawableObjects;
    }

    private void moveEnemies(){
        for (BaseEnemy enemy : enemies) {
            enemy.move();
        }
    }

    private void moveBullets() {
        for (BaseBullet bullet : bullets) {
            bullet.move();
        }
    }

    private void clearObjects() {
        enemies = new HashSet<>();
        bullets = new HashSet<>();
    }
}
