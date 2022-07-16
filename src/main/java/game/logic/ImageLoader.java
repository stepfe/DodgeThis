package game.logic;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Синглтон отвечает за подрузку картинок. Позволяет не загружать картинки из файлов лишний раз и содержит нужные в памяти.
 */
public class ImageLoader {
    //TODO::Добавить метод сброса картинок в памяти???
    BufferedImage playerImage;
    private static final String RESOURCES_FOLDER = "src/main/resources";

    public static ImageLoader instance;

    /**
     * @return единственный экземпляр объекта
     */
    public static ImageLoader getInstance() {
        if (instance == null) {
            instance = new ImageLoader();
        }
        return instance;
    }

    /**
     * Возвращает картинку игрока, если она еще не загружена загружает
     * @return картинка игрока
     */
    public BufferedImage getPlayerImage() {
        if (playerImage == null)
            playerImage = loadPlayerImage();
        return playerImage;
    }

    //TODO::Возвращение картинки врага
    public BufferedImage getEnemyImage() {
        return playerImage;
    }

    //TODO::Возвращение картинки пули
    public BufferedImage getBulletImage() {
        return playerImage;
    }

    //TODO::Обработка ошибки
    private BufferedImage loadPlayerImage() {
        String imagePath = RESOURCES_FOLDER + "/ship.png";
        BufferedImage image = null;
        try {
             image = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }

    private ImageLoader() {}
}
