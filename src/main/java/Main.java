import game.UI.MainFrame;
import game.controller.IController;
import game.controller.KeyController;
import game.logic.Game;
import game.logic.IGame;

/**
 * Точка входа в приложение
 */
public class Main {

    private static IGame game;
    private static IController controller;
    private static MainFrame frame;

    public static void main(String[] args){
        game = new Game();
        controller = new KeyController(game);
        frame = new MainFrame(controller);
        game.addGamePaintListener(frame);
        game.start();
    }
}
