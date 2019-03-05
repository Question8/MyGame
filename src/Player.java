
import java.util.Scanner;

public class Player extends Character {

    private int xPos;

    private int yPos;

    public Player(String name) {
        super();
        setName(name);
        
        setXPos(1);
        setYPos(2);
        
        
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
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
