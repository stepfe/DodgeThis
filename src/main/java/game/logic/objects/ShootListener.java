package game.logic.objects;

import game.logic.objects.bullets.Bullet;

public interface ShootListener {
    void onShoot(Bullet bullet);
}
