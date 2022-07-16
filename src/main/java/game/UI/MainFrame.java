package game.UI;

import game.logic.GamePaintListener;
import game.logic.objects.DrawableObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.util.Set;

/**
 * Главное окно приложения
 */
public class MainFrame extends JFrame implements GamePaintListener {
    private GamePanel gamePanel;
    private ShopPanel shopPanel;

    public MainFrame(KeyListener listener){
        super();
        initializeFrame();
        initializeGamePanel();
        addKeyListener(listener);
        setVisible(true);
    }

    public void onGameChanged(Set<DrawableObject> gameObjectsToPaint) {
        gamePanel.redrawGameField(gameObjectsToPaint);
    }

    private void initializeFrame() {
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
    }

    private void initializeGamePanel() {
        gamePanel = new GamePanel();
        gamePanel.setSize(1000, 1000);
        gamePanel.setVisible(true);
        add(gamePanel, BorderLayout.CENTER);
    }
}
