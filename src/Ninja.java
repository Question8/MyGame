
import java.util.Random;

public class Ninja extends Character {

    private NinjaType type;
    private String[] ninjaNames = {"The Crouching Lion", "Light Stroke",
        "The Dark Silence", "The Floating Vision", "The Quick Shadow",
        "Goldenblade", "The Rapid Mime", "Silver Claw", "The Unheard Figure",
        "The Snake Striker"};

    private final int GBHP = 250;
    private final int GBS = 20;
    private final int GBF = 20;

    private final int RBHP = 200;
    private final int RBS = 15;
    private final int RBF = 15;

    private final int HHP = 150;
    private final int HS = 10;
    private final int HF = 10;

    private final int MHP = 100;
    private final int MS = 5;
    private final int MF = 5;

    Ninja() {
        int selector = new Random().nextInt(3);
        int nameNum = new Random().nextInt(11);

        switch (selector) {
            case 0://Minion
                setType(NinjaType.values()[0]);
                configureNinja(MHP, MS, MF);
                break;
            case 1://Henchman
                setType(NinjaType.values()[1]);
                configureNinja(HHP, HS, HF);
                break;
            case 2://RoomBoss
                setType(NinjaType.values()[2]);
                configureNinja(RBHP, RBS, RBF);
                break;

        }
        
        setName(ninjaNames[nameNum]);
        
    }

    public Ninja(NinjaType type) {
        setType(type);
         int nameNum = new Random().nextInt(11);

        switch (type) {
            case MINION://Minion
                setType(NinjaType.values()[0]);
                configureNinja(MHP, MS, MF);
                break;
            case HENCHMAN://Henchman
                setType(NinjaType.values()[1]);
                configureNinja(HHP, HS, HF);
                break;
            case ROOMBOSS://RoomBoss
                setType(NinjaType.values()[2]);
                configureNinja(RBHP, RBS, RBF);
                break;
            case GAMEBOSS://GameBoss
                setType(NinjaType.values()[3]);
                configureNinja(GBHP, GBS, GBF);
                break;
        }
        
        setName(ninjaNames[nameNum]);
    }

    private void configureNinja(int hp, int s, int f) {
        setHealth(hp);
        setSpeed(s);
        setForce(f);
    }

    public NinjaType getType() {
        return this.type;
    }

    public void setType(NinjaType type) {
        this.type = type;
    }

    @Override
    public void printInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Health: " + getHealth());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Force: " + getForce());
        System.out.println("Type: " + getType());
        System.out.println();
    }
}
