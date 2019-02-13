
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ahmad50017
 */
public class testDriver {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Player mainP;
        Ninja n1;
        
        
        System.out.println("1) Create your own name\n"
                + "2) Have a name generated for you");
        int choice = in.nextInt();
        if (choice == 1) {
            System.out.println("What would you like to name your character?");
            
            mainP = new Player(in.next());
        }else{
            mainP = new Player("John");
        }
        
        Dialog(mainP, in);
        
        System.out.println("1) Create your own Henchman\n"
                + "2) Have a ninja generated for you");
        choice = in.nextInt();
        if (choice == 1) {
            n1 = new Ninja(NinjaType.HENCHMAN);
        }else{
            n1 = new Ninja();
        }

        clear();
        System.out.println("Main's Data");
        mainP.printInfo();
        
        System.out.println("============================");
        System.out.println("Ninja's Data");
        n1.setName("Jacob");
        n1.printInfo();
        
       fightHandler(n1, mainP);
       clear();
       System.out.println("out of fight\n\n");
       System.out.println("Main's Data");
        mainP.printInfo();
        
        System.out.println("============================");
        System.out.println("Ninja's Data");
        n1.printInfo();
    }
    
    public static void clear(){
        for(int i = 0; i < 27; i++){
            System.out.print("\n");
        }
    }
    
    public static void fightHandler(Ninja N, Player P){
        int choice;
        Scanner in = new Scanner(System.in);
        int attackBuffer;
        boolean counterAttack;
        
         while(N.getHealth() > 0 && P.getHealth() > 0 ){
            clear();
            System.out.println("============================");
            System.out.println();
            
            System.out.println("Would you like to: \n"
                             + "1) Attack\n"
                             + "2) Dodge\n"
                             + "3) Nothing\n");
            choice = in.nextInt();
            
            switch(choice){
                case 1:
                   attackBuffer = P.attack();
                   counterAttack = N.dodge(attackBuffer);
                   if(counterAttack == true){
                       P.takeDamage(N.attack() * 2);
                   }
                   break;
                   
                case 2:
                    attackBuffer = N.attack();
                   counterAttack = P.dodge(attackBuffer);
                    if(counterAttack == true){
                       N.takeDamage(P.attack()* 2);
                   }
                    break;
                    
                case 3:
                    attackBuffer = N.attack();
                    P.takeDamage(attackBuffer);
                    break;
            }
            
            System.out.println("Main's Data");
            P.printInfo();
        
            System.out.println("============================");
            System.out.println("Ninja's Data");
            N.printInfo();
            
            
            
        }
        
    }
    public static void Dialog(Player p, Scanner in){
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------- ");
        System.out.println("Year: 2019\n" +
                           "Location: Cam Coorperation\n" +
                           "Date: January 3rd\n" +
                           "\n" +
                           "Hello. How have you been? Working for \"Cam-Corp\" is still fun. It has been great here. People are very nice here and I have fit in really good in here.\n" +
                           "Although, I have a feeling something else is happening here.. People keep going into this inclosed room next to my table. I can not see what it is but\n" +
                           "I keep seeing bright lights come into the room at different times... Weird lights. Ones I have never seen before... Anyways I hope you are \n" +
                           "having fun! I will see you soon. Love, " + p.getName());
        promptEnterKey();
        clear();
        System.out.println("Year: 2019\n" +
                           "Location: Cam Coorperation\n" +
                           "Date: January 10th\n" +
                           "\n" +
                           "Hello.. It has been awile. I don't even know where I am now. It's dark... All I can see is the awkward lights that is coming from the room. Someone is \n" +
                           "coming out.. He is wearing a black uniform.. kind of like a ninja. My brain feels like it's trying to come out of my head. I can feel my heartbeat and\n" +
                           "it's driving me crazy. The man is walking towards me, his eyes are glowing!! Where am I.. What do they wa-" );
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------- ");
    }
    
    public static void promptEnterKey(){
        System.out.println("Press \"ENTER\" to continue...");
        try {
            int read = System.in.read(new byte[2]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
