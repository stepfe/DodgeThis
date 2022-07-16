package game.logic.objects;

import game.logic.objects.bullets.BaseBullet;

/**
 * Слушатель выстрелов
 * Позволит добавлять пули которые порождают объекты в игровую сцену
 */
public interface ShootListener {
    /**
     * Реакция на выстреленную пулю
     * @param bullet новая пуля на игровой сцене
     */
    void onShoot(BaseBullet bullet);
}
