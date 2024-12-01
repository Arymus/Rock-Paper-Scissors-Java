import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanner object

        // Print instructions/title to the console
        System.out.println("rock, paper, scissors");
        System.out.println("'R' for rock,  and 'P' for paper, and 'S' for scissors.");

        double random = Math.random() * 3;
        int randInt = (int) random; // Cast the random variable to an integer
        String[] array = {"rock", "paper", "scissors"};
        String computer = (String) array[randInt]; // Take the randomized number and print the array string associated with it

        String input = scanner.nextLine(); // Take input from the user
        input = input.toLowerCase(); // Transform the input to lower case

        // Evaluate the conditions for a win, lose, and tie and respond accordingly
        if (input.equals("r") && randInt == 0 || input.equals("p") && randInt == 1 || input.equals("s") && randInt == 2) {
            System.out.println("It\'s a tie! The computer chose " + computer + ".");
        } else if (input.equals("r") && randInt == 1 || input.equals("p") && randInt == 2 || input.equals("s") && randInt == 0) {
            System.out.println("You lost! The computer chose " + computer + ".");
        } else if (input.equals("r") && randInt == 2 || input.equals("p") && randInt == 0 || input.equals("s") && randInt == 1) {
            System.out.println("You won! The computer chose " + computer + ".");
        } else {
            System.out.println("Please input 'R' for rock, 'P' for paper, or 'S' for scissors.");
        }
    }
}
