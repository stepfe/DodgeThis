package game.logic;

import game.logic.objects.enemys.BaseEnemy;

import java.util.Set;

/**
 * Интерфейс для уровней с тригерами на количество и состав врагов
 */
public interface ILevel {

    /**
     * Проверка существующих врагов на соответсвие волне и создание новых если необходимо
     * @param enemies множество всех врагов на игровой сцене
     */
    public void checkTriggers(Set<BaseEnemy> enemies);
}
