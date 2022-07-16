package game.logic.objects;

import java.awt.image.BufferedImage;

/**
 * Класс содержит логику отрисовки объектов
 * Эффекты и осноные картинки объектов
 */
public class DrawableObject extends GameObject{

    private BufferedImage image;

    public DrawableObject(int x, int y, BufferedImage image) {
        super(x, y);
        this.image = image;
    }

    public BufferedImage getImage() {
        return image;
    }
}
