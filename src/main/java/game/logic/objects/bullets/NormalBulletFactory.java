package game.logic.objects.bullets;

import game.logic.objects.GameObject;

public class NormalBulletFactory implements AbstractBulletFactory {

    public final int speedOfBullets = 5;
    public final int damageOfBullets = 5;

    public Bullet createBullet(GameObject initialPosition, GameObject targetPosition) {
        return new Bullet(initialPosition, targetPosition, speedOfBullets, damageOfBullets);
    }
}
