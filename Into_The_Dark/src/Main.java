import java.util.Scanner; // Imports the Scanner class for user input

public class Main {

    public static void main(String[] args) {
        // Creates a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Infinite loop that keeps the game running until the player exits
        while (true) {
            // Displays the title screen
            System.out.println("\n\t\t  **Into the Dark**  \n");
            System.out.println("1. Venture Forth");
            System.out.println("2. Return Home");

            // Reads the user's choice and stores it in the `choice` variable
            int choice = scanner.nextInt();

            // Switch statement to handle different user choices
            switch (choice) {
                case 1:
                    startGame(); // Starts the game if the user chooses option 1
                    break;
                case 2:
                    System.out.println("You turn back, choosing the comfort of home over the mysteries of the dungeon.\n");
                    System.exit(0); // Exits the program if the user chooses option 2
                default:
                    System.out.println("Invalid choice. Please choose 1 or 2."); // Informs the user of an invalid choice
            }
        }
    }

    public static void startGame() {
        // Initializes the current level to 1
        int currentLevel = 1;

        // Loop that continues until all five levels are completed
        while (currentLevel <= 5) {
            // Displays the current level number
            System.out.println("\n** Level " + currentLevel + " **\n");

            // ** PLACEHOLDER: Add specific logic and story elements for each level here **
            // This section needs to be filled in with the details for each level,
            // including descriptions, challenges, user choices, and their consequences.

            // Example level logic:
            System.out.println("You find yourself in a dimly lit cavern.");
            System.out.println("1. Explore the north passage.");
            System.out.println("2. Investigate the flickering torch to the south.");
            int levelChoice = new Scanner(System.in).nextInt();
            if (levelChoice == 1) {
                // Handle user choice for exploring north passage
                System.out.println("You encounter a group of goblins!");
                // Further logic for battling or interacting with goblins
            } else if (levelChoice == 2) {
                // Handle user choice for investigating the torch
                System.out.println("You discover a hidden doorway behind the torch.");
                // Further logic for entering the doorway
            } else {
                System.out.println("Invalid choice. Please choose 1 or 2.");
            }

            // Increments the current level for the next iteration
            currentLevel++;
        }

        // Congratulates the player on completing the game
        System.out.println("\nCongratulations! You have conquered the dungeon!\n");
    }
}
