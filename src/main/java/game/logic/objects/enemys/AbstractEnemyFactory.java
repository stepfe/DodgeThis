package game.logic.objects.enemys;

public interface AbstractEnemyFactory {
    BaseEnemy createEnemy(int x, int y);
}
