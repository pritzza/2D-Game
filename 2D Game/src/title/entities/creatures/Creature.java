package src.title.entities.creatures;

import src.title.entities.Entity;

public abstract class Creature extends Entity {

    public static final int DEFAULT_HEALTH = 10;
    public static final float DEFAULT_SPEED = 3.0f;
    public static final int DEFAULT_CREATURE_WIDTH = 64;
    public static final int DEAFAULT_CREATURE_HEIGHT = 64;

    protected int health;
    protected float speed;
    protected float xMove, yMove;

    public Creature(float x, float y, int width, int height) {

        super(x, y, width, height);
        health = DEFAULT_HEALTH;
        speed = DEFAULT_SPEED;
        xMove = 0;
        yMove = 0;

    }

    public void move() {
        
        if((xMove == 3 && yMove == 3) || (xMove == -3 && yMove == 3) || (xMove == 3 && yMove == -3) || (xMove == -3 && yMove == -3)){
            x += xMove;
            y += yMove ;
        } else {
            x += xMove * 1.1;
            y += yMove * 1.1;
        }
    }

    //GETTERS AND SETTERS
    public float getxMove() {
        return xMove;
    }

    public void getxMove(float xMove) {
        this.xMove = xMove;
    }

    public float getyMove() {
        return yMove;
    }

    public void getyMove(float yMove) {
        this.yMove = yMove;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public float getSpeed() {
        return speed;
    }

    public void setHeight(float speed) {
        this.speed = speed;
    }

}