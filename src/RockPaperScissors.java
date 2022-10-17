import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner myChoice = new Scanner(System.in);
        Random computerChoice = new Random();
        // Declare a variable for number of round
        int roundsCount;

        // Declare a variable for one of three choices
        int myChoiceChosen;

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
                 myChoiceChosen = myChoice.nextInt();
                switch(myChoiceChosen) {
                    case 1:
                        myChoiceChosen = 1;
                        System.out.println("You chose: Rock");
                        break;
                    case 2:
                        myChoiceChosen = 2;
                        System.out.println("You chose: Paper");
                        break;
                    case 3:
                        myChoiceChosen = 3;
                        System.out.println("You chose: Scissor");
                        break;
                }

                // Check if user select a valid input (I don't know why this code doesn't work
                if (myChoiceChosen != 1 || myChoiceChosen != 2 || myChoiceChosen != 3)
                    System.out.println("Please enter a valid number!");

                // After the computer asks for the user's input, the computer randomly chooses Rock, Paper, Scissors
                computerChosen = computerChoice.nextInt(3) + 1;
                switch (computerChosen) {
                    case 1:
                        computerChosen = 1;
                        System.out.println("Other player chose: Rock");
                        break;

                    case 2:
                        computerChosen = 2;
                        System.out.println("Other player chose: Paper");
                        break;

                    case 3:
                        computerChosen = 3;
                        System.out.println("Other player chose: Scissor");
                        break;
                }

                // Check conditions and Display the result
                if (myChoiceChosen == 1 && computerChosen == 1) {
                    System.out.println("Winner: Tie!");
                    totalTies++;
                }
                if (myChoiceChosen == 2 && computerChosen ==2) {
                    System.out.println("Winner: Tie!");
                    totalTies++;
                }
                if (myChoiceChosen ==3 && computerChosen == 3) {
                    System.out.println("Winner: Tie!");
                    totalTies++;
                }
                if (myChoiceChosen == 1 && computerChosen == 2) {
                    System.out.println("Winner: Computer");
                    totalComputerWins++;
                }
                if (myChoiceChosen == 1 && computerChosen == 3) {
                    System.out.println("Winner: User!");
                    totalUserWins++;
                }
                if (myChoiceChosen == 2 && computerChosen == 1) {
                    System.out.println("Winner: User!");
                    totalUserWins++;
                }
                if (myChoiceChosen == 2 && computerChosen == 3) {
                    System.out.println("Winner: Computer!");
                    totalComputerWins++;
                }
                if (myChoiceChosen == 3 && computerChosen == 1) {
                    System.out.println("Winner: Computer!");
                    totalComputerWins++;
                }
                if (myChoiceChosen == 3 && computerChosen == 2) {
                    System.out.println("Winner: User!");
                    totalUserWins++;
                }
            }
        // Print out number of ties, user wins, and computer wins
            System.out.println("Total user wins: " + totalUserWins);
            System.out.println("Total computer wins: " + totalComputerWins);
            System.out.println("Total ties: " + totalTies);

        // Display overall winner

            if  (totalUserWins > totalComputerWins)
                System.out.println("\n Overall winner: User");
            if (totalUserWins < totalComputerWins)
                System.out.println("Overall winner: Computer");
            if (totalUserWins == totalComputerWins)
                System.out.println("Overall winner: No winner");

        // The computer asks if the user wants to play again
            System.out.println("Would you like to play the game again? 'Y' or 'N'?");
                String answerQuestion = myChoice.nextLine();
            if (myChoice.nextLine().equals("Y")) {
                continue;
            }

            else {
                System.out.println("Thanks for playing!");
                break;
            }
        }

    }
}

