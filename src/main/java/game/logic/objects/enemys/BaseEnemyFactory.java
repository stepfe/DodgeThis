package game.logic.objects.enemys;

import game.logic.ImageLoader;
import game.logic.objects.bullets.BaseBulletFactory;

public class BaseEnemyFactory implements AbstractEnemyFactory{

    private ImageLoader imageLoader;

    public BaseEnemyFactory() {
        imageLoader = ImageLoader.getInstance();
    }

    public BaseEnemy createEnemy(int x, int y) {
        return new BaseEnemy(x, y, 1, 5, new BaseBulletFactory(), imageLoader.getEnemyImage());
    }
}
