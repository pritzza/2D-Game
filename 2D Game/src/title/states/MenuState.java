package src.title.states;

import java.awt.Graphics;

import src.title.Game;
import src.title.gfx.Assets;

public class MenuState extends State{

    

    public MenuState(Game game) {
        super(game);

    }

    @Override
    public void tick(){


    }

    @Override
    public void render(Graphics g){

        g.drawImage(Assets.guy, 100, 100, null);

    }
}