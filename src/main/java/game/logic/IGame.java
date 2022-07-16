package game.logic;

public interface IGame {
    /**
     * Запуст основного игрового цикла
     */
    void start();
    /**
     * Постановка игры на паузу
     */
    void pause();
    /**
     * Сохранение игры
     */
    void save();
    /**
     * Загрузка игры
     */
    void load();
    /**
     * Добавление слушателя изменения игровых объектов
     * @param gamePaintListener новый слушатель изменений игровых объектов
     */
    void addGamePaintListener(GamePaintListener gamePaintListener);
}
