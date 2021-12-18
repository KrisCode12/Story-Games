import java.util.Scanner;

public class Java_Game {
    Scanner scan = new Scanner(System.in);
    Scanner enterScanner = new Scanner(System.in);
    int playerLives;
    String playerName;
    String playerWeapon;
    int choice;
    int enemyHP;

    public static void main(String[] args) {
        Java_Game GTA;
        GTA = new Java_Game();

        GTA.playerSetup();
        GTA.buildingEntrance();


    }

    void playerSetup() {
        playerLives = 3;
        enemyHP = 100;

        playerWeapon = " Pistol with silencer";

        System.out.println("Welcome To GTA Console Game.");
        System.out.println("Your Goal is to eliminate T Bone Mendez the crime boss in the city ");
        System.out.println("Your HP: " + playerLives);
        System.out.println("Your Weapon:" + playerWeapon);

        System.out.println("Enter the name of your Character:");
        playerName = scan.nextLine();
        System.out.println("Sup!! " + playerName+ " Lets move holmes!!" );
    }
    void buildingEntrance(){
        System.out.println("You are at the building gate where T Bone Mendez Hides");
        System.out.println("A gang member is standing in front of you");
        System.out.println("");
        System.out.println("You got any plans to do?");
        System.out.println("");
        System.out.println("1: Stab the gang member at the neck area and hide the body");
        System.out.println("2: Talk to the Gang Member");
        System.out.println("3: Sneak and go inside the building");

        choice = scan.nextInt();

        if(choice == 1){
            System.out.println("You stabbed the Gang Member.");
            System.out.println("The Guard Died");
            System.out.println( playerName+ " is hiding the body somewhere else.");
            System.out.println("Going to floor 2");

        }else if (choice == 2){
            System.out.println("yow yow!! Holmes what the F are you doing here? ");
            System.out.println("This is a private property get out!!");
            enterScanner.nextLine();
            buildingEntrance();

        }else if (choice == 3){
            playerLives --;


            System.out.println("Hey!! yow dawg are you to sneak!!?? ");
            System.out.println("Gand Member stabs you.....");
            System.out.println("");
            System.out.println("HP: " + playerLives);
            buildingEntrance();



        }else if(playerLives == 0){
            System.out.println(" Game Over!! you can't be gangsta!!");
        }





    }
}


