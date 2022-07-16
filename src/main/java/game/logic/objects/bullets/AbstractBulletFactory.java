package game.logic.objects.bullets;

import game.logic.objects.GameObject;

/**
 * Абстрактная фабрика пуль
 * Отвечает за создание экземпляров класса Bullet
 */
public interface AbstractBulletFactory {

    /**
     * Создает пулю в заданной позиции развернутой в сторону цели
     * @param initialPosition координаты пули
     * @param targetPosition координаты цели
     * @return новая пуля
     */
    BaseBullet createBullet(GameObject initialPosition, GameObject targetPosition);
}
