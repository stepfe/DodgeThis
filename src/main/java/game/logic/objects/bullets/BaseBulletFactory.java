package game.logic.objects.bullets;

import game.logic.ImageLoader;
import game.logic.objects.GameObject;

import java.awt.image.BufferedImage;

/**
 * Порождает экземпляры обычных пуль
 */
public class NormalBulletFactory implements AbstractBulletFactory {

    public final int speedOfBullets = 5;
    public final int damageOfBullets = 5;
    ImageLoader imageLoader;

    public NormalBulletFactory(){
         imageLoader = ImageLoader.getInstance();
    }

    public Bullet createBullet(GameObject initialPosition, GameObject targetPosition) {
        return new Bullet(initialPosition, targetPosition, speedOfBullets, damageOfBullets, imageLoader.getBulletImage());
    }
}
