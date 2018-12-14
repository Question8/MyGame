
import java.util.Scanner;

public class Player extends Character {

    private int xPos;

    private int yPos;

    public Player(String name) {
        super();
        setName(name);
    }

    public int setXPos(int xPos) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getXPos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getYPos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int setYPos(int yPos) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void printInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Health: " + getHealth());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Force: " + getForce());
        System.out.println();
    }
}
