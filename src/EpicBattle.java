public class EpicBattle {
    public static void main(String[] args) {
        System.out.println("Welcome, the epic battle is about to start.");

        //Do valid actions in a try catch block
        try {
            //Create Characters
            Archer archer = new Archer("Legolas", 90, 15);
            Mage mage = new Mage("Gandalf the Grey", 80, 25);
            Warrior warrior = new Warrior("Gimli", 100, 20);

            //Announce Characters
            System.out.println("Starting Characters:");
            printDivider();

            System.out.println("The Warrior: ");
            warrior.displayInfo();
            printDivider();

            System.out.println("The Archer: ");
            archer.displayInfo();
            printDivider();

            System.out.println("The Mage: ");
            mage.displayInfo();
            printDivider();

            //Round 1 of the battle
            System.out.println("Let the battle begin!");
            archer.attack(mage);
            System.out.println();

            warrior.attack(archer);
            System.out.println();

            mage.attack(archer);
            System.out.println();

            //Update After First Round
            System.out.println("Updated Character Information: ");
            printDivider();

            System.out.println("The Warrior: ");
            warrior.displayInfo();
            printDivider();

            System.out.println("The Archer: ");
            archer.displayInfo();
            printDivider();

            System.out.println("The Mage: ");
            mage.displayInfo();
            printDivider();

            System.out.println("Gandalf tries to cheat by healing himself:");
            mage.takeDamage(-20);


        } catch (IllegalArgumentException e) {
            System.out.println("Invalid data error: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Invalid action error: " + e.getMessage());
        }

        //Test Invalid Actions
        System.out.println("Testing invalid character creation:");

        try {
            Warrior noName = new Warrior("", 100, 20);
            noName.displayInfo();
        } catch (IllegalArgumentException e){
            System.out.println("Invalid data error: " + e.getMessage());
        }

        try {
            Mage badMage = new Mage("Sarumon", 0, 65);
        } catch (IllegalArgumentException e){
            System.out.println("Invalid data error: " + e.getMessage());
        }

    }

    public static void printDivider(){
        System.out.println("------------------------------------------------------");
    }
}
