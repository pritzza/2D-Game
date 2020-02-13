package src.title.tiles;

import src.title.gfx.Assets;

public class DarkrockTile extends Tile {

    public DarkrockTile(int id) {

        super(Assets.darkrock, id);

    }

    @Override
    public boolean isSolid() {
        return true;
    }
}