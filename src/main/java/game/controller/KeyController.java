package game.controller;

import game.logic.IGame;
import game.logic.objects.Player;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Контроллер отвечающий за управление игроком по нажатым кнопкам клавиатуры
 */
public class KeyController implements IController {

    IGame game;

    public KeyController(IGame game){
        this.game = game;
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }
}
