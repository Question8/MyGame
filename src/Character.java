
import java.util.Random;

public class Character {

    private String name;

    private int health;

    private int speed;

    private int force;
    
    private int currDamage;


    Character(){
    this.health = 100;
    this.speed = 5;
    this.force = 5;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getForce() {
        return this.force;
    }

    public void setForce(int force) {
        this.force = force;
    }
    
    public void setCurrDamage(int currDamage) {
        this.currDamage = currDamage;
    }

    public int getCurrDamage() {
        return this.currDamage;
    }
    
    //FIGHT FUNCTIONS
    public int attack() {
        System.out.println("attacking");
        int damage = new Random().nextInt((this.force - 1) + 1) + 1;
        return damage;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if(this.health < 0){
            this.health = 0;
        }
    }
    
    public boolean dodge(int incoming){
        int dodgeTry = new Random().nextInt(12 + 1) + 1;
        
        if(dodgeTry % 3 == 0){
            System.out.println("Succesful dodge");
            return true;
            //counter-attack
        }else{
            System.out.println("Failed dodge");
            takeDamage(incoming);
            return false;
        }
    }
    
    public void printInfo(){
        System.out.println("This is here solely to be overridden");
    }
    
}
