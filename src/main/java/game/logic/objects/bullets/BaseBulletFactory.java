package game.logic.objects.bullets;

import game.logic.ImageLoader;
import game.logic.objects.GameObject;

/**
 * Порождает экземпляры обычных пуль
 */
public class BaseBulletFactory implements AbstractBulletFactory {

    public final int speedOfBullets = 5;
    public final int damageOfBullets = 5;
    ImageLoader imageLoader;

    public BaseBulletFactory(){
         imageLoader = ImageLoader.getInstance();
    }

    public BaseBullet createBullet(GameObject initialPosition, GameObject targetPosition) {
        return new BaseBullet(initialPosition, targetPosition, speedOfBullets, damageOfBullets, imageLoader.getBulletImage());
    }
}
