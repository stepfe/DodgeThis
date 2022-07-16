package game.logic;

import game.logic.objects.DrawableObject;

import java.util.HashSet;
import java.util.Set;

/**
 * Фасад для взаимодействия игровой логики и остальных компонентов игры
 */
public class Game implements IGame {
    private Set<GamePaintListener> paintListeners;
    private GameLogic logic;
    private ILevel level;
    private final int gameStepDuration = 1000;

    public Game() {
        logic = new GameLogic();
        level = new Level(logic, 10);
        paintListeners = new HashSet<>();
    }

    public void start() {
        while (true) {
            try {
                Thread.sleep(gameStepDuration);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            logic.nextGameIteration();
            level.checkTriggers(logic.getAllEnemies());
            notifyAllPaintListeners();
        }
    }

    public void pause() {

    }

    public void save() {

    }

    public void load() {

    }

    public void addGamePaintListener(GamePaintListener gamePaintListener) {
        this.paintListeners.add(gamePaintListener);
    }

    private void notifyAllPaintListeners() {
        Set<DrawableObject> drawableObjects = logic.getAllDrawableObjects();

        for (GamePaintListener listener : paintListeners) {
            listener.onGameChanged(drawableObjects);
        }
    }
}
