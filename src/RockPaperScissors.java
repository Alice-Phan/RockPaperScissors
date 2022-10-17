import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner myChoice = new Scanner(System.in);
        Random computerChoice = new Random();
        // Declare a variable for number of round
        int roundsCount;

        // Declare a variable for one of three choices
        int choiceChosen;

        // Declare a variable to hold the computer's choice
        int computerChosen;

        // Declare variables to hold the number of times of winning the games from user, computer; or total of ties
        int totalUserWins = 0;
        int totalComputerWins = 0;
        int totalTies = 0;

        // set the while loop, inquire the number of rounds the user wants to play the game
        while(true) {
            System.out.println("Let's play Rock, Paper, Scissors Game");
            System.out.println("How many rounds would you like to play? ");
            roundsCount = myChoice.nextInt();

            // Check condition of the number of rounds given by the player
            if (roundsCount < 1 || roundsCount > 10) {
                break;
            }
            // Run the for loop when the number of round is in range
            for(int i = 1; i <= roundsCount; i ++) {
                // Ask for the user's input
                System.out.println("Game " + i + "\n Select your choice: 1 for Rock, 2 for Paper, and 3 for Scissors ");
                choiceChosen = myChoice.nextInt();
                switch(choiceChosen) {
                    case 1:
                        choiceChosen = 1;
                        System.out.println("You chose: Rock");
                        break;
                    case 2:
                        choiceChosen = 2;
                        System.out.println("You chose: Paper");
                        break;
                    case 3:
                        choiceChosen = 3;
                        System.out.println("You chose: Scissor");
                }

                // Check if user select a valid input
                if (choiceChosen != 1 || choiceChosen != 2 || choiceChosen != 3);
                    System.out.println("Please enter a valid number!");

                // After the computer asks for the user's input, the computer randomly chooses Rock, Paper, Scissors
                computerChosen = computerChoice.nextInt(3) + 1;
                switch (computerChosen) {
                    case 1:
                        computerChosen = 1;
                        System.out.println("");
                }
            }


        }
    }
}

