package game.logic.objects.bullets;

import game.logic.objects.GameObject;

public interface AbstractBulletFactory {
    Bullet createBullet(GameObject initialPosition, GameObject targetPosition);
}
