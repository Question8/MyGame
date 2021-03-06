
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
import java.io.FileOutputStream; 

/**
 *
 * @author ahmad50017
 */
public class testDriver {

    public static void main(String[] args) {
        displayTitle();
        Scanner in = new Scanner(System.in);
        Player mainP;
        mainP = new Player();
        TimeZone current;
        Ninja n;

        current = new TimeZone(3);
        int choice;
        boolean playing = false;
        
        choice = validNum("Would you like to 1) Create your own name, or"
                + " 2) Have a name generated for you");
        if (choice == 1) {
            System.out.println("What would you like to name your character?");

            mainP.setName(in.next());
        } else if (choice == 2) {
            mainP.setName("John");
        }
        
        clear();
        Dialog(mainP, in, current.getTimePeriod());
        while (!playing) {
            choice = validNum("What do you want to do?\n"
                    + "1. Play\n"
                    + "2. Quit\n"
                    + "3. Instructions");
            switch (choice) {
                case 1:
                    clear();
                    playing = true;
                    break;
                case 2:
                    System.exit(0);
                    break;
                case 3:
                    displayInstructions();
                    break;
                default:
                    System.out.println("That was invalid\n");
                    break;
            }
        }

        current.setTimePeriod(1);
        current.setYear(1942);
        current.initMap(current.getTimePeriod());
        int[][] theMap = current.getMyMap();
        Dialog(mainP, in, current.getTimePeriod());

        while (playing) {

            
            System.out.println("Before.. X: " + mainP.getXPos() + " Y: " + mainP.getYPos() + " Year: " + current.getYear());
            for (int[] x : current.getMyMap()) {
                for (int y : x) {
                    System.out.print(y + " ");
                }
                System.out.println();
            }

            move(in, theMap, mainP);
            System.out.println("After.. X: " + mainP.getXPos() + " Y: " + mainP.getYPos());
            switch (theMap[mainP.getYPos()][mainP.getXPos()]) {
                case 3:
                    current.Notes(in);
                    break;
                case 8:
                    choice = validNum("Would you like to timetravel?: "
                            + "\n1)Yes"
                            + "\n2)No");

                    if (choice == 1) {
                        System.out.println("While timetraveling a ninja appears");
                        n = new Ninja(NinjaType.MINION);
                        fightHandler(n, mainP);

                        if (mainP.getHealth() <= 0) {
                            System.out.println("You have died, Thanks for playing the void");
                            playing = false;
                        } else {
                            System.out.println("You have beat " + n.getName());
                            promptEnterKey();
                            current.timeTravel(in);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Person at desk");
                    break;
                case 6:
                    randomEvent(mainP);
                    break;
            }//end of map switch

        }

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

            System.out.println("============================");
            System.out.println();

            choice = validNum("Would you like to: \n"
                    + "1) Attack\n"
                    + "2) Dodge\n"
                    + "3) Nothing\n");
            clear();
            switch (choice) {
                case 1:
                    attackBuffer = P.attack();
                    counterAttack = N.dodge(attackBuffer);
                    if (counterAttack == true) {
                        System.out.println(N.getName() + " can counter attack");
                        P.takeDamage(N.attack() * 2);
                    }
                    break;

                case 2:
                    attackBuffer = N.attack();
                    counterAttack = P.dodge(attackBuffer);
                    if (counterAttack == true) {
                        System.out.println(P.getName() + " can counter attack");
                        N.takeDamage(P.attack() * 2);
                    }
                    break;

                case 3:
                    attackBuffer = N.attack();
                    P.takeDamage(attackBuffer);
                    break;
            }

            System.out.println();

            System.out.println("Main's Data");
            P.printInfo();

            System.out.println("============================");
            System.out.println("Ninja's Data");
            N.printInfo();

        }

    }//end of fightHandler

    public static void displayTitle() {
        System.out.println("    .....                                                                        .       ..      ");
        System.out.println(" .H8888888h.  ~-.    .uef^\"                                                     @88>   dF        ");
        System.out.println(" 888888888888x  `> :d88E                          ...     ..             u.     %8P   '88bu.     ");
        System.out.println("X~     `?888888hx~ `888E            .u         :~\"\"888h.:^\"888:    ...ue888b     .    '*88888bu  ");
        System.out.println("'      x8.^\"*88*\"   888E .z8k    ud8888.      8X   `8888X  8888>   888R Y888r  .@88u    ^\"*8888N ");
        System.out.println(" `-:- X8888x        888E~?888L :888'8888.    X888n. 8888X  ?888>   888R I888> ''888E`  beWE \"888L");
        System.out.println("      488888>       888E  888E d888 '88%\"    '88888 8888X   ?**h.  888R I888>   888E   888E  888E");
        System.out.println("    .. `\"88*        888E  888E 8888.+\"         `*88 8888~ x88x.    888R I888>   888E   888E  888E");
        System.out.println("  x88888nX\"      .  888E  888E 8888L          ..<\"  88*`  88888X  u8888cJ888    888E   888E  888F");
        System.out.println(" !\"*8888888n..  :   888E  888E '8888c. .+        ..XC.    `*8888k  \"*888*P\"     888&  .888N..888 ");
        System.out.println("'    \"*88888888*   m888N= 888>  \"88888%        :888888H.    `%88>    'Y\"        R888\"  `\"888*\"\"  ");
        System.out.println("        ^\"***\"`     `Y\"   888     \"YP'        <  `\"888888:    X\"                 \"\"       \"\"     ");
        System.out.println("                         J88\"                       %888888x.-`                                  ");
        System.out.println("                         @%                           \"\"**\"\"                                     ");
        System.out.println("                       :\"                                                                        ");
        System.out.println();
        System.out.println("The Void by Kwestion Ahmad and Hunter Stewart");
        System.out.println();
    }//end of displayTitle

    public static void displayInstructions() {
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("|-------------|");
        System.out.println("|Instructions |");
        System.out.println("|-------------|");
        System.out.println("In The Void, you are placed into a laboratory with a little swing to it.\n"
                + "You are trying to figure out what is happening there but with ninja's trying to stop\n"
                + "you, it becomes harder for each level to make it to. Through each level. You will\n"
                + "be placed in the same lab but things will be changed inside of it from year to year, making\n"
                + "this game a little harder to figure out. Once you do tho, you will figure out the reason of\n"
                + "why you are here. Good luck !!\n"
                + "Controls:\n"
                + "------------------------------------------------------------------------------------\n"
                + "WASD Buttons: Moves Player\n"
                + "Enter Key: Brings New Dialog\n");
        System.out.println("---------------------------------------------------------------------------");
        
        promptEnterKey();
    }//end of displayInstructions

    public static void Dialog(Player p, Scanner in, int tp) {
        switch (tp) {
            case 1:
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------- ");
                System.out.println("You traveled to 1942\n");
                System.out.println("\n");
                typeWriter("Year: 1942\n"
                        + "Location: Cam Cooperation\n"
                        + "Date: September 11th\n"
                        + "\n"
                        + "You breath deeply as if your on your last breath. You move through a laboratory... one you\n"
                        + "have seen before.. maybe in a later time. Then all of the sudden a black figure moves in\n"
                        + "front of you like a wondering shadow trying to find a home. Your heart sinks but you have\n"
                        + "one mindset. To find out what Cam Corp is up to and find a way back to 2019\n", 10);
                promptEnterKey();
                clear();
                typeWriter("You look around the room. You see a teleporter right behind you that you just went through,\n"
                        + "a table in the middle of the room, and a note sitting like it was just put there. So perfect\n"
                        + "and straight.\n", 10);
                break;
            case 2:
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------- ");
                typeWriter("Year: 1968\n"
                        + "Location: Cam Cooperation\n"
                        + "Date: July 15th\n"
                        + "\n"
                        + "If you are seeing this.. This note is from the person I know very well. I am going to help\n"
                        + "you as much as I can. Right now there is a woman that needs to talk to you. She is 5 spaces\n"
                        + "up and 2 spaces right. She will help you from there.", 10);
            case 3:
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------- ");
                typeWriter("Year: 2019\n"
                        + "Location: Cam Coorperation\n"
                        + "Date: January 3rd\n"
                        + "\n"
                        + "Hello. How have you been? Working for \"Cam-Corp\" is still fun. It has been great here. People are very nice here and I have fit in really good in here.\n"
                        + "Although, I have a feeling something else is happening here.. People keep going into this inclosed room next to my table. I can not see what it is but\n"
                        + "I keep seeing bright lights come into the room at different times... Weird lights. Ones I have never seen before... Anyways I hope you are \n"
                        + "having fun! I will see you soon. " + p.getName() + "\n", 10);
                promptEnterKey();
                clear();
                typeWriter("Year: 2019\n"
                        + "Location: Cam Coorperation\n"
                        + "Date: January 10th\n"
                        + "\n"
                        + "Hello.. It has been a couple of days. I don't even know where I am now. It's dark... All I can see is the awkward lights that is coming from the room. Someone is \n"
                        + "coming out.. He is wearing a black uniform.. kind of like a ninja. My brain feels like it's trying to come out of my head. I can feel my heartbeat and\n"
                        + "it's driving me crazy. The man is walking towards me, his eyes are glowing!! Where am I.. What do they want from me.. No! They are taking m--\n"
                        + "\n"
                        + "\nYou are pulled into the misterious room. You see a lot of lab equipment and a what looks like to be a teleporter. The man with the suit drags\n"
                        + "you to a table in the middle of the room. He ties you down and starts to grab a knife. Out of experience, you kick him and grab the knife\n"
                        + "You cut the hard straps that you are stuck on and you start to run for the door. The man gets up and stops you and you turn around and run\n"
                        + "into the teleporter hoping for the best.\n", 10);
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------- ");
                System.out.println("\n");
                break;
        }
    }//end of Dialog

    public static void promptEnterKey() {
        System.out.println("\n");
        System.out.println("Press \"ENTER\" to continue...");
        try {
            int read = System.in.read(new byte[2]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        clear();
    }//End of promptEnterKey

    public static int validNum(String prompt) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println(prompt);
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next(); // this is important!
            }
            number = sc.nextInt();
        } while (number <= 0);

        return number;
    }//End of validNum

    public static void move(Scanner in, int[][] theMap, Player P) {
        int dir = 0;

        dir = validNum("What direction would you want to go?: "
                + "1)N, 2)E, 3)S, 4)W"
                + "\n5)Developer fast travel");

        switch (dir) {
            case 1://North
                if (theMap[P.getYPos() - 1][P.getXPos()] == 4) {
                    System.out.println("There's a wall.. you can't go there.");
                } else {
                    P.setYPos(P.getYPos() - 1);
                }
                break;
            case 2://East
                if (theMap[P.getYPos()][P.getXPos() + 1] == 4) {
                    System.out.println("There's a wall.. you can't go there.");
                } else {
                    P.setXPos(P.getXPos() + 1);
                }
                break;
            case 3://South
                if (theMap[P.getYPos() + 1][P.getXPos()] == 4) {
                    System.out.println("There's a wall.. you can't go there.");
                } else {
                    P.setYPos(P.getYPos() + 1);
                }
                break;
            case 4://West
                if (theMap[P.getYPos()][P.getXPos() - 1] == 4) {
                    System.out.println("There's a wall.. you can't go there.");
                } else {
                    P.setXPos(P.getXPos() - 1);
                }
                break;
            case 5://fast Travel
                int newX = 0;
                int newY = 0;
                newX = validNum("enter x-coordinate");
                newY = validNum("Enter y-coordinate");

                if (theMap[newY][newX] == 4) {
                    System.out.println("There's a wall.. you can't go there.");
                }else {
                    P.setXPos(newX);
                    P.setYPos(newY);

                }
                break;
            default:
                System.out.println("That was invalid");
                move(in, theMap, P);
                break;

        }
        
        clear();
    }// end of movefunction

    public static void typeWriter(String prompt, int speed) {

        String text = prompt;

        int i;

        for (i = 0; i < text.length(); i++) {

            System.out.printf("%c", text.charAt(i));

            try {

                Thread.sleep(speed);

            } catch (InterruptedException e) {

                Thread.currentThread().interrupt();

            }

        }

    }//end of typeWriter
    

    public static void parallelArray(){
        String[] armor = {"Cloth", "Silver", "Gold", "Diamond"};
        int[] armorHealth = {1, 4, 8, 16};
        
        for (int i = 0; i < armor.length; i++) {
            System.out.println(armor[i]);
            System.out.println(armorHealth[i]);
        }
    }//end parallellArray

    public static void randomEvent(Player P){
        
        String[] goodEvent = {"You accidently spill Pym particles on yourself.",
            "You are exposed to radiation.", "You inhale a mix of fumes that make you stronger."};
        
        String[] badEvent = {"You have stepped on a broken beaker.", "You have ran into a poison trap.",
            "You stepped on a bear trap.", "You accidently soill acid on your hand.", 
            "You accidently spill Pym particles on your hand."};
        
        String effect = "";
        int randomHealth = 0;
        Random rand = new Random();
        randomHealth = rand.nextInt((20 - 5) + 1) + 5;
        
        boolean isBad = true;
        isBad = (rand.nextBoolean());
        int effectNum = 0;
        
        if(isBad){
            effectNum = rand.nextInt(4);
            effect = badEvent[effectNum];
            System.out.println("You lost: " + randomHealth + " Health.");            
            P.setHealth(P.getHealth() - randomHealth);
        }else{
            effectNum = rand.nextInt(2);
            effect = goodEvent[effectNum];
            
            P.setHealth(P.getHealth() + randomHealth);
            System.out.println("You gained: " + randomHealth + " Health.");
        }
        
        System.out.println(effect + "You now have: " + P.getHealth() + " health");
        promptEnterKey();
        
    }//end of randomEvent

}//end of testDriver
