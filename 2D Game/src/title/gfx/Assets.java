package src.title.gfx;

import java.awt.image.BufferedImage;

public class Assets {

    private static final int width = 8, height = 8;

    public static BufferedImage player, grass, shooter, eater, mushroom, guy;
    
    public static void init() {

        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/res/textures/sheet.png"));
        
        player = sheet.crop(width * 0, height * 5, width * 2, height * 3);
        grass = sheet.crop(width * 2, height * 3, width * 1, height * 1);
        guy = sheet.crop(width * 0, height * 1, width * 1, height * 1);
    }
}