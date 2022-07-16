package game.logic;

import game.logic.objects.DrawableObject;

import java.util.Set;

/**
 * Слушатель изменений положений объектов с целью их дальнейшей отрисовки
 */
public interface GamePaintListener {

    /**
     * Действие по изменению игровых объектов (в плане отрисовки)
     * @param gameObjectsToPaint все игровые объекты которые необходимо отрисовать
     */
    void onGameChanged(Set<DrawableObject> gameObjectsToPaint);
}
