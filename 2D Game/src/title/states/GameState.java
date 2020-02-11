package src.title.states;

import java.awt.Graphics;

import src.title.entities.creatures.Player;
import src.title.Game;
import src.title.worlds.World;

public class GameState extends State{

    private Player player;
    private World world;

    public GameState(Game game) {
        super(game);
        player = new Player(game, 1000, 1000, 0, 0);
        world = new World(game, "src/title/worlds/world1");

    }

    @Override
    public void tick(){
        world.tick();
        player.tick();

    }

    @Override
    public void render(Graphics g){

        world.render(g);
        player.render(g);
        

    }
}