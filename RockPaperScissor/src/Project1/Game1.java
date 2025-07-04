package Project1;

import java.util.Scanner;

public class Game1 {
	
	// Returns either "rock", "paper" or "scissors"
    String getComputerChoice() {

        String computerChoice;
        int randomNumber = (int) (Math.random() * 3) + 1;

        if (randomNumber == 1) {
            computerChoice = "rock";
        }

        else if (randomNumber == 2) {
            computerChoice = "paper";
        }

        else {
            computerChoice = "scissors";
        }

        return computerChoice;
    }

    // Returns user input
    String getUserInput() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter rock, paper or scissors:");
        String userInput = input.nextLine();

        userInput = userInput.toLowerCase();

        return userInput;
    }

    // Returns either "win", "lose" or "draw"
    String getResult(String userInput, String computerChoice) {

        // Condition for user to draw
        if (userInput.equals(computerChoice)) {
            return "draw";
        }

        // Condition for user to win
        else if (userInput.equals("paper") && computerChoice.equals("rock")) {
            return "win";
        } 
        
        else if (userInput.equals("rock") && computerChoice.equals("scissors")) {
            return "win";
        }
        
        else if (userInput.equals("scissors") && computerChoice.equals("paper")) {
            return "win";
        }
        
        // All other conditions result to loss
        else {
            return "lose";
        }
    }

    public static void main(String[] args) {

        // Creating object of Main class
        Game1 obj = new Game1();

        // Get users input
        String userInput = obj.getUserInput();
        
        // Get computers choice
        String computerChoice = obj.getComputerChoice();

        // Get results
        String result = obj.getResult(userInput, computerChoice);

        System.out.println("User Input: " + userInput);
        System.out.println("Computer Choice: " + computerChoice);
        System.out.println(result);
    }
}


