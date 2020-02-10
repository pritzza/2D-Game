package src.title.gfx;

import java.awt.image.BufferedImage;

public class Assets {

    private static final int width = 8, height = 8;

    public static BufferedImage player, grass, rock, sand, guy, mushroom, shooter, eater;
    
    public static void init() {

        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/res/textures/sheet.png"));
        
        player = sheet.crop(width * 0, height * 5, width * 2, height * 3);
        grass = sheet.crop(width * 2, height * 6, width * 2, height * 2);
        rock = sheet.crop(width * 2, height * 4, width * 2, height * 2);
        sand = sheet.crop(width * 0, height * 3, width * 2, height * 2);
        guy = sheet.crop(width * 0, height * 1, width * 1, height * 1);
        mushroom = sheet.crop(width * 2, height * 1, width * 1, height * 1);
    }
}