
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ahmad50017
 */
public class testDriver {

    public static void main(String[] args) {

        //displayTitle();
        Scanner in = new Scanner(System.in);
        Player mainP;
        Ninja n1;
        TimeZone current;
        current = new TimeZone(3);
        int choice = 1;
        
        mainP = new Player("John");
        
        while (choice == 1) {
            
            
            System.out.println("Before.. X: "+ mainP.getXPos() + " Y: " + mainP.getYPos());
            for (int[] x : current.getMyMap()) {
                for (int y : x) {
                    System.out.print(y + " ");
                }
                System.out.println();
            }
            move(in, current.myMap, mainP, current);
            System.out.println("After.. X: "+ mainP.getXPos() + " Y: " + mainP.getYPos());
                  
            
        }

//Mildred, Margaret, Mary, Mellisa, Mindie
        
        promptEnterKey();
        clear();

    }//End of main

    public static void clear() {
        for (int i = 0; i < 27; i++) {
            System.out.print("\n");
        }
    }//End of clear

    public static void fightHandler(Ninja N, Player P) {
        int choice;
        Scanner in = new Scanner(System.in);
        int attackBuffer;
        boolean counterAttack;

        while (N.getHealth() > 0 && P.getHealth() > 0) {
            clear();
            System.out.println("============================");
            System.out.println();

            System.out.println("Would you like to: \n"
                    + "1) Attack\n"
                    + "2) Dodge\n"
                    + "3) Nothing\n");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    attackBuffer = P.attack();
                    counterAttack = N.dodge(attackBuffer);
                    if (counterAttack == true) {
                        P.takeDamage(N.attack() * 2);
                    }
                    break;

                case 2:
                    attackBuffer = N.attack();
                    counterAttack = P.dodge(attackBuffer);
                    if (counterAttack == true) {
                        N.takeDamage(P.attack() * 2);
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

    }//End of fightHandler

    public static void displayTitle() {
        System.out.println("    .....                                         "
                + "                              .       ..      ");

        System.out.println(" .H8888888h.  ~-.    .uef^\"                      "
                + "                               @88>   dF        ");

        System.out.println(" 888888888888x  `> :d88E                          "
                + "...     ..             u.     %8P   '88bu.     ");

        System.out.println("X~     `?888888hx~ `888E            .u         :~"
                + "\"\"888h.:^\"888:    ...ue888b     .    '*88888bu  ");

        System.out.println("'      x8.^\"*88*\"   888E .z8k    ud8888.      8X"
                + "   `8888X  8888>   888R Y888r  .@88u    ^\"*8888N ");

        System.out.println(" `-:- X8888x        888E~?888L :888'8888.    X888n"
                + ". 8888X  ?888>   888R I888> ''888E`  beWE \"888L");

        System.out.println("      488888>       888E  888E d888 '88%\"    '888"
                + "88 8888X   ?**h.  888R I888>   888E   888E  888E");

        System.out.println("    .. `\"88*        888E  888E 8888.+\"         `"
                + "*88 8888~ x88x.    888R I888>   888E   888E  888E");

        System.out.println("  x88888nX\"      .  888E  888E 8888L          ..<"
                + "\"  88*`  88888X  u8888cJ888    888E   888E  888F");

        System.out.println(" !\"*8888888n..  :   888E  888E '8888c. .+        "
                + "..XC.    `*8888k  \"*888*P\"     888&  .888N..888 ");

        System.out.println("'    \"*88888888*   m888N= 888>  \"88888%        :"
                + "888888H.    `%88>    'Y\"        R888\"  `\"888*\"\"  ");

        System.out.println("        ^\"***\"`     `Y\"   888     \"YP'        "
                + "<  `\"888888:    X\"                 \"\"       \"\"     ");

        System.out.println("                         J88\"                    "
                + "   %888888x.-`                                  ");

        System.out.println("                         @%                       "
                + "    \"\"**\"\"                                     ");

        System.out.println("                       :\"                        "
                + "                                                ");

        System.out.println();
        System.out.println("The Void by Kwestion Ahmad and Hunter Stewart");
        System.out.println();
    }//End of displayTItle

    public static void displayInstructions() {
        System.out.println();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println();
    }//End of displayInstructions

    public static void Dialog(Player p, Scanner in) {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------- ");
        System.out.println("Year: 2019\n"
                + "Location: Cam Coorperation\n"
                + "Date: January 3rd\n"
                + "\n"
                + "Hello. How have you been? Working for \"Cam-Corp\" is still fun. It has been great here. People are very nice here and I have fit in really good in here.\n"
                + "Although, I have a feeling something else is happening here.. People keep going into this inclosed room next to my table. I can not see what it is but\n"
                + "I keep seeing bright lights come into the room at different times... Weird lights. Ones I have never seen before... Anyways I hope you are \n"
                + "having fun! I will see you soon. Love, " + p.getName());
        promptEnterKey();
        clear();
        System.out.println("Year: 2019\n"
                + "Location: Cam Coorperation\n"
                + "Date: January 10th\n"
                + "\n"
                + "Hello.. It has been awile. I don't even know where I am now. It's dark... All I can see is the awkward lights that is coming from the room. Someone is \n"
                + "coming out.. He is wearing a black uniform.. kind of like a ninja. My brain feels like it's trying to come out of my head. I can feel my heartbeat and\n"
                + "it's driving me crazy. The man is walking towards me, his eyes are glowing!! Where am I.. What do they wa-");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------- ");
    }//End of Dialogue

    public static void promptEnterKey() {
        System.out.println("Press \"ENTER\" to continue...");
        try {
            int read = System.in.read(new byte[2]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//End of promptEnterKey

    
     public static void move(Scanner in, int[][] theMap, Player P, TimeZone tz){
        int dir = 0;
        int choice = 0;
        
        System.out.println("What direction would you want to go?: "
                + "1)N, 2)E, 3)S, 4)W");
        dir = in.nextInt();
        
        switch(dir){
            case 1://North
                if(theMap[P.getYPos() -1][ P.getXPos()]==4) {
                    System.out.println("There's a wall.. you can't go there.");
                }
                else {
                    P.setYPos(P.getYPos() - 1);
                    if(theMap[P.getYPos()][P.getXPos()]==8){
                        System.out.println("Would you like to timetravel?: "
                                + "\n1)Yes"
                                + "\n2)No");
                        choice = in.nextInt();
                        
                        if(choice ==   1)
                            tz.timeTravel(in);
                    }
                }
                break;
            case 2://East
                if(theMap[P.getYPos()][ P.getXPos() + 1]==4) {
                    System.out.println("There's a wall.. you can't go there.");
                }
                else {
                    P.setXPos(P.getXPos() + 1);
                    if(theMap[P.getYPos()][P.getXPos()]==8){
                        System.out.println("Would you like to timetravel?: "
                                + "\n1)Yes"
                                + "\n2)No");
                        choice = in.nextInt();
                        
                        if(choice ==   1)
                            tz.timeTravel(in);
                    }
                }
                break;
            case 3://South
                if(theMap[P.getYPos() +1][ P.getXPos()]==4) {
                    System.out.println("There's a wall.. you can't go there.");
                }
                else {
                    P.setYPos(P.getYPos() + 1);
                    if(theMap[P.getYPos()][P.getXPos()]==8){
                        System.out.println("Would you like to timetravel?: "
                                + "\n1)Yes"
                                + "\n2)No");
                        choice = in.nextInt();
                        
                        if(choice ==   1)
                            tz.timeTravel(in);
                    }
                }
                break;
            case 4://West
                if(theMap[P.getYPos() ][ P.getXPos() - 1]==4) {
                    System.out.println("There's a wall.. you can't go there.");
                }
                else {
                    P.setXPos(P.getXPos() - 1);
                    if(theMap[P.getYPos()][P.getXPos()]==8){
                        System.out.println("Would you like to timetravel?: "
                                + "\n1)Yes"
                                + "\n2)No");
                        choice = in.nextInt();
                        
                        if(choice ==   1)
                            tz.timeTravel(in);
                    }
                }
                break;
                
        }
    }// end of movefunction
     
}//End of Driver

