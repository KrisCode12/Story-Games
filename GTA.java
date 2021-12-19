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
  
        //GameStartsHere
        GTA.playerSetup();


    }

    void playerSetup() {
        playerLives = 3;
        enemyHP = 100;

        playerWeapon = " Swiss Knife"; //First Weapon

        System.out.println("Welcome To GTA Console Game.");
        System.out.println("Your Goal is to eliminate T Bone Mendez the crime boss in the city ");
        System.out.println("Your HP: " + playerLives);
        System.out.println("Your Weapon:" + playerWeapon);

        System.out.println("Enter the name of your Character:");
        playerName = scan.nextLine();
        System.out.println("Sup!! " + playerName + " Lets move holmes!!");

        buildingEntrance();// first mission
    }

    void buildingEntrance() {
        System.out.println("You are at the building gate where T Bone Mendez Hides");
        System.out.println("A gang member is standing in front of you");
        System.out.println("");
        System.out.println("You got any plans to do?");
        System.out.println("");
        System.out.println("1: Stab the gang member at the neck area and hide the body");
        System.out.println("2: Talk to the Gang Member");
        System.out.println("3: Sneak and go inside the building");

        choice = scan.nextInt();

        if (choice == 1) {
            System.out.println("You stabbed the Gang Member.");
            System.out.println("The Guard Died");
            System.out.println(playerName + " is hiding the body somewhere else.");
            System.out.println("You just picked a Combat Knife");
            playerWeapon = "Combat Knife";
            System.out.println("Going to floor 2");

            secondFoor();

        } else if (choice == 2) {
            System.out.println("yow yow!! Holmes what the F are you doing here? ");
            System.out.println("This is a private property get out!!");
            enterScanner.nextLine();
            buildingEntrance();

        } else if (choice == 3) {
            playerLives--;


            System.out.println("Hey!! yow dawg are you trying to sneak!!?? ");
            System.out.println("Gang Member stabs you.....");
            System.out.println("");
            System.out.println("HP: " + playerLives);
            buildingEntrance();


        } else {
            buildingEntrance();
        }

    }

    void secondFoor() {
        Ryder r = new Ryder();
        BigSmoke b = new BigSmoke();
        T_BoneMendez t = new T_BoneMendez();


        System.out.println("------------------------------------------------------");


        System.out.println("Player Weapon: " + playerWeapon);
        System.out.println("You are facing your ex co gang member named Ryder.");
        System.out.println("You can't engaged easily player got an fire arm");
        r.showWeapon();
        System.out.println("");
        System.out.println("You got any plans?");
        System.out.println("1:Talk to ryder");
        System.out.println("2:Sneak and slash his throat");
        System.out.println("3: Quit!! ");
        choice = scan.nextInt();

        if (choice == 1) {
            System.out.println("Talking to ryder");
            System.out.println("Yow my dawg!! " + playerName + " What the hell are you doing here!?");
            System.out.println("Good to see you again! " + r.EnemyName + ": I'm here for Tbone Mendez");
            System.out.println("Ryder: Bro you can't kill him by using " + playerWeapon);
            System.out.print("Go take my ");
            r.showWeapon();
            System.out.println("Ryder: Take care dawg!!");
            System.out.println("going to the Third Floor: ");
            thirdFloor();
        } else if (choice == 2) {
            System.out.println("You killed your old friend");
            System.out.println("You got his: " + r.EnemyWeapon);
            System.out.println("Going to the Third Floor");
            System.out.println("-----------------------------");
            System.out.println(b.EnemyName + " Saw you killed " + r.EnemyName);
            System.out.println(b.EnemyName + " is holding a" + b.EnemyWeapon);
            System.out.println(b.EnemyName + " started firing at you");

            System.out.println("1: Fire Back");
            System.out.println("2: Beg for Mercy");
            System.out.println("3: Run!!");
            choice = scan.nextInt();
            if (choice == 1) {
                System.out.println("You killed BigSmoke!!");
                System.out.println(t.EnemyName + " is now alerted because of gunshots");
                System.out.println("proceeding to the Final Floor");
                System.out.println("-----------------------------");

                FinalFloor();
            } else if (choice == 2) {
                System.out.println("Bigsmoke showed no mercy");
                System.out.println("This is for Ryder.......................");
                System.out.println(b.EnemyWeapon + " shots ");
                System.out.println("Bigsmoke shot you in the head with a " + b.EnemyWeapon);
                System.out.println("You died");
                System.out.println("-----------------------------");
                secondFoor();
            } else if (choice == 3) {
                System.out.println("COWARD!!");
                secondFoor();
            } else {
                secondFoor();
            }

        } else if (choice == 3) {
            System.out.println("Go back Coward!!");
            secondFoor();
        } else {
            secondFoor();
        }


    }

    void thirdFloor() {
        BigSmoke b = new BigSmoke();
        T_BoneMendez t = new T_BoneMendez();

        System.out.println(b.EnemyName + "saw you");
        System.out.println(b.EnemyName + " Called for back ups");
        System.out.println("Ryder came to help you...");
        System.out.println("Ryder got killed ");
        System.out.println("You Killed all of Big smoke's body guard");

        System.out.println("Big Smoke beg for mercy!!");
        System.out.println("Come on dawg I got family to feed dawg");

        System.out.println("1: Kill big smoke");
        System.out.println("2: Free big smoke ");
        System.out.println("3: Quit the Game");
        choice = scan.nextInt();

        if (choice == 1) {
            System.out.println("Big Smoke died");
            System.out.println("You got his " + b.EnemyWeapon);
            playerWeapon = b.EnemyWeapon;
            System.out.println("Weapon: " + playerWeapon);
            System.out.println("T bone's guard are now alerted and ready.");
            System.out.println(" proceeding to the final floor");
            FinalFloor();
        } else if (choice == 2) {
            System.out.println(b.EnemyName + ": " + "Thanks holmes!! Go take my shot gun!!");
            playerWeapon = b.EnemyWeapon;
            System.out.println("Weapon: " + playerWeapon);
            System.out.println("Big Smoke Alerted T Bone");
            System.out.println("T bone's guard are now alerted and ready.");
            System.out.println(" proceeding to the final floor");
            FinalFloor();
        } else if (choice == 3) {
            System.out.println("You have been killed by T Bone's body Guard");
            secondFoor();
        } else {
            secondFoor();
        }

    }

    void FinalFloor() {
        T_BoneMendez t = new T_BoneMendez();

        System.out.println("T_Bone body guards is attacking you");
        System.out.println("");
        System.out.println("1: Fire back!!");
        System.out.println("2: Surrender");
        System.out.println("3: Quit the Game");

        choice = scan.nextInt();

        if (choice == 1) {
            System.out.println("You eliminated all of the body guards");

            System.out.println("TBone is begging for mercy");
            System.out.println("TBone offers you 500000$");
            System.out.println("");
            System.out.println(" T bone is all yours now");


            System.out.println("1: Fire back!!");
            System.out.println("2: Leave T bone and take the money");
            System.out.println("3: Quit the Game");
            System.out.println("-----------------------------");
            choice = scan.nextInt();
            if (choice == 1) {
                System.out.println("You have killed TBone");
                System.out.println("MISSION PASSED");
                System.out.println("RESPECT +");


            } else if (choice == 2) {
                System.out.println("T BONE ESCAPED");
                System.out.println("You got T bones money now");
                System.out.println("End Game");
            } else if (choice == 3) {
                System.out.println("Game over");
            }


        } else if (choice == 3) {
            System.out.println(" T bone's Guard killed you");
            System.out.println("");
            FinalFloor();
        } else {
            FinalFloor();
        }


    }

    public interface Enemy {


        void showWeapon();

        void showName();
    }

    public class Ryder implements Enemy {
        String EnemyWeapon = "Caliber .45 pistol";
        String EnemyName = "Ryder";

        @Override
        public void showWeapon() {
            System.out.println(EnemyWeapon);

        }

        @Override
        public void showName() {
            System.out.println(EnemyName);

        }
    }

    public class BigSmoke implements Enemy {
        String EnemyWeapon = "ShotGun";
        String EnemyName = "Big Smoke";

        @Override
        public void showWeapon() {
            System.out.println(EnemyWeapon);

        }

        @Override
        public void showName() {
            System.out.println(EnemyName);

        }
    }
    public class T_BoneMendez implements Enemy {
        String EnemyWeapon = "Ak 47";
        String EnemyName = "TBone Mendez";

        @Override
        public void showWeapon() {
            System.out.println(EnemyWeapon);

        }

        @Override
        public void showName() {
            System.out.println(EnemyName);

        }
    }



}


