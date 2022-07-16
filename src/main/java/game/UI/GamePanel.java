package game.UI;

import game.logic.objects.DrawableObject;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Панель на которой будут отображаться игра
 */
public class GamePanel extends JPanel {

    Set<DrawableObject> gameObjects;

    public GamePanel() {
        super();
        gameObjects = new HashSet<>();
    }

    /**
     * Принужденная перерисовка игрового поля
     * Вызывается по игровой итерации
     * @param drawableObjects обновленный набор объектов для отрисовки
     */
    public void redrawGameField(Set<DrawableObject> drawableObjects) {
        gameObjects = drawableObjects;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        clearPanel(g);
        drawGameObjects(g);
    }

    private void drawGameObjects(Graphics g){
        for (DrawableObject drawableObject : gameObjects){
            g.drawImage(drawableObject.getImage(), drawableObject.getX(), drawableObject.getY(), null);
        }
    }

    private void clearPanel(Graphics g){
        g.setColor(Color.black);
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}
