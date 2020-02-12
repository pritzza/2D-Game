package src.title.gfx;

import java.awt.image.BufferedImage;

public class Assets {

    private static final int width = 8, height = 8;

    public static BufferedImage player, grass, rock, sand, water, dirt;
    
    public static void init() {

        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/res/textures/sheet.png"));
        
        player = sheet.crop(width * 0, height * 0, width * 2, height * 3);
        grass = sheet.crop(width * 6, height * 6, width * 2, height * 2);
        rock = sheet.crop(width * 6, height * 2, width * 2, height * 2);
        sand = sheet.crop(width * 6, height * 4, width * 2, height * 2);
        water = sheet.crop(width * 6, height * 0, width * 2, height * 2);
        dirt = sheet.crop(width * 6, height * 8, width * 2, height * 2);


    }
}