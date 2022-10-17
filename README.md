# A program written to play the game Rock, Paper, Scissors

## Task List

1. Creat a flowchart
2. Write code
3. Rules of the game are as follows:

    a. Each player chooses Rock, Paper, Scissors
    
    b. If both players choose the same thing, the round is a tie.
       
    c. Otherwise:
           - Paper wraps Rock to win
           - Scissors cut Paper to win
           - Rock breaks Scissors to win

## Requirements

1. The program first asks the user how many rounds he/she wants to play

- Maximum number of rounds = 10, minimum number of rounds = 1. If the user asks for something outside this game, the program prints an error message and quits.
- If the number of rounds is in range, the program plays that number of rounds. each round is played according to the requirements below.

2. For each round of Rock, Paper, Scissors, the program does the following:

- The computer asks the user for his/her choice (Rock, Paper, or Scissors).
    
    - Hint: 1 = Rock, 2 = Paper, 3 = Scissor

- After the computer asks for the user's input, the computer randomly chooses Rock, paper, or Scissors and displays the result of the round (tie, user win, or computer win).
    
    - Hint: use Random class
- The program must keep track of how many rounds are ties, user wins, or computer wins

    - Hint: Create three variables to keep track of these items and update them correctly after each round.
  
- The program must print out the number of ties, user wins, and computer wins and declare the overall winner based on who won more rounds.

- After all rounds have been played and the winner declared, the program must ask the user if he/she wants to play again.
  
    - If the user says No, the program prints out a message saying, "Thanks for playing!" and then exits.
    - If the usr says Yes, the program starts over, asking the user how many rounds he/she would like to play.


