package RLWReport;

import java.util.Scanner;

public class ConversionAndConfession implements Runnable {
    private char[] dialogue;
    void start() {
        Scanner userInput = new Scanner(System.in);
        clearScreen();
        this.dialogue = "Rizal Life and Works - The Demand of Conversion and Confession\nPresented by Group 5 (Bancual, Contreras, Espartero, Punzal, Tuprio, Villar)\nPress ENTER to continue\n".toCharArray();
        showDialogue(dialogue);
        userInput.nextLine();
        goToMainMenu(userInput);
    }

    private void goToMainMenu(Scanner userInput) {
        clearScreen();
        while(true) {
            this.dialogue = "What do you want to know about? (PRESS THE CORRESPONDING NUMBER YOU WANT TO SELECT AND HIT ENTER)\n1. Conversion\n2. Confession".toCharArray();
            showDialogue(dialogue);
            String userChoice = userInput.nextLine();
            switch(userChoice) {
                case "1":
                    goToConversion(userInput);
                    break;
                case "2":
                    goToConfession(userInput);
                    break;
                default:
                    showError("Invalid number! Please try again.");
            }
        }
    }

    private void goToConversion(Scanner userInput) {
        this.dialogue = "conversion".toCharArray();
    }

    private void goToConfession(Scanner userInput) {
        this.dialogue = "confession".toCharArray();
    }

    /*
     * MISC
     */

    private void showError(String errorName) {
        System.out.println("Please enter a valid number!");
        char[] characters = {'.', ' ', '.', ' ', '.', ' ', '.'};
        for(int i = 0; i < characters.length; i++) {
            System.out.print(characters[i]);
            run(350);
        }
        clearScreen();
    }

    private void showDialogue(char[] dialogue) {
        char[] characters = dialogue;
        for(int i = 0; i < characters.length; i++) {
            System.out.print(characters[i]);
            run(50);
        }
    }

    public void run(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clearScreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
