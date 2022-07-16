package game.logic;

import game.logic.objects.enemys.AbstractEnemyFactory;
import game.logic.objects.enemys.BaseEnemyFactory;
import game.logic.objects.enemys.BaseEnemy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Класс уровня ответственный за генерацию и поведение уровня
 */
public class Level implements ILevel{
    private int maxAliveEnemies;
    private GameLogic logic;
    private List<AbstractEnemyFactory> enemyFactories;

    public Level(GameLogic logic, int maxAliveEnemies) {
        this.logic = logic;
        this.maxAliveEnemies = maxAliveEnemies;
        enemyFactories = new ArrayList<>();
        enemyFactories.add(new BaseEnemyFactory());
    }

    @Override
    public void checkTriggers(Set<BaseEnemy> enemies) {
        if(enemies.size() < maxAliveEnemies) {
            spawnEnemy();
        }
    }

    private void spawnEnemy() {
        logic.addEnemy(enemyFactories.get(0).createEnemy((int)(Math.random() * 900), (int)(Math.random() * 900)));
    }
}
