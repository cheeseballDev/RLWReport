package RLWReport;

public class ConversionAndConfession implements Runnable {
    private char[] dialogue;
    void start() {
        clearScreen();
        String string = "Rizal Life and Works GROUP 5 - Confession and The Demand of Conversion";
        this.dialogue = string.toCharArray();
        showDialogue(dialogue);
    }

    private void showDialogue(char[] dialogue) {
        char[] characters = dialogue;
        for(int i = 0; i < characters.length; i++) {
            System.out.print(characters[i]);
            run();
        }
    }

    public void run() {
        try {
            Thread.sleep(50);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clearScreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
