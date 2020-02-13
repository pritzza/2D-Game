package src.title.gfx;

import java.awt.image.BufferedImage;

public class Assets {

    private static final int width = 8, height = 8;

    public static BufferedImage player, grass, thickgrass, bush, rock, darkrock, sand, water, deepwater, dirt;
    
    public static void init() {

        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/res/textures/sheet.png"));
        
        player = sheet.crop(width * 0, height * 0, width * 2, height * 3);
        grass = sheet.crop(width * 7, height * 6, width * 1, height * 1);
        thickgrass = sheet.crop(width * 6, height * 6, width * 1, height * 1);
        bush = sheet.crop(width * 6, height * 7, width * 1, height * 1);
        rock = sheet.crop(width * 6, height * 2, width * 1, height * 1);
        darkrock= sheet.crop(width * 7, height * 2, width * 1, height * 1);
        sand = sheet.crop(width * 6, height * 4, width * 1, height * 1);
        water = sheet.crop(width * 6, height * 0, width * 1, height * 1);
        deepwater = sheet.crop(width * 7, height * 0, width * 1, height * 1);
        dirt = sheet.crop(width * 6, height * 8, width * 1, height * 1);


    }
}