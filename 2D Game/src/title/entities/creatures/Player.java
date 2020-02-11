package src.title.entities.creatures;

import java.awt.Graphics;

import src.title.gfx.Assets;
import src.title.Game;

public class Player extends Creature {

    public Player(Game game, float x, float y, int width, int height) {

        super(game, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_WIDTH);
        //SIZE OF PLAYER
        this.width = 64;
        this.height = 96;

    }

    @Override
    public void tick() {
    
        getInput();
        move();
        game.getGameCamera().centerOnEntity(this);
    
    }

    private void getInput() {

        xMove = 0;
        yMove = 0;

        if(game.getKeyManager().up)
            yMove = -speed;
        if(game.getKeyManager().down)
            yMove = speed;
        if(game.getKeyManager().left)
            xMove = -speed;
        if(game.getKeyManager().right)
            xMove = speed;

    }

    @Override
    public void render(Graphics g) {

        g.drawImage(Assets.player, (int) (x - game.getGameCamera().getxOffset()), (int) (y - game.getGameCamera().getyOffset()), width, height, null);
    }

}
