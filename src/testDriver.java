
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
        
        
        System.out.println("Would you like to 1) Create your own name, or"
                + "2) Have a name generated for you");
        int choice = in.nextInt();
        if (choice == 1) {
            System.out.println("What would you like to name your character?");
            
            mainP = new Player(in.next());
        }else{
            mainP = new Player("John");
        }
        System.out.println("Would you like to 1) Create your own Henchman, or "
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
}
