package src.title.tiles;

import java.awt.image.BufferedImage;
import java.awt.Graphics;

public class Tile {

    //STATIC STUFF HERE

    public static Tile[] tiles = new Tile[256];
    public static Tile grassTile = new GrassTile(0);
    public static Tile rockTile = new RockTile(1);
    public static Tile sandTile = new SandTile(2);
    public static Tile waterTile = new WaterTile(3);
    public static Tile dirtTile = new DirtTile(4);

    //CLASS

    //SCALE OF TILES
    public static final int TILEWIDTH = 64;
    public static final int TILEHEIGHT = 64;

    protected BufferedImage texture;
    protected final int id;

    public Tile(BufferedImage texture, int id) {
        this.texture = texture;
        this.id = id;

        tiles[id] = this;
    }

    public void tick() {

    }

    public void render(Graphics g, int x, int y) {

        g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);

    }

    public boolean isSolid() {
        return false;
    }

    public int getId() {
        return id;
    }
}