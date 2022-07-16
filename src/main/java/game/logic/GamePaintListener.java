package game.logic;

import game.logic.objects.GameObject;

import java.util.Set;

public interface GamePaintListener {
    void onGameChanged(Set<GameObject> gameObjectsToPaint);
}
