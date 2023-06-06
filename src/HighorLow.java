import java.util.Random; // import random for generator
import java.util.Scanner; // import scanner for user input

public class HighorLow {

    public static void main(String[] args) {

        // initialize scanner for user input
        Scanner in = new Scanner(System.in);

        // initialize random generator for computer to know what value to check user input against
        Random generator = new Random();

        // generate and initialize the random value to a variable between 1 and 10;
        int generatedValue = generator.nextInt(10) + 1;

        // declare variables
        int userGuess = 0; // user input
        String trash = ""; // for if the user inputs other than an int
        boolean done = false; // for the loop to iterate if wrong input

        do {
            // output and obtain user input for user guess
            System.out.println("Please enter your guess (only one chance):");
            // checks if the user inputted a valid input/type
            if (in.hasNextInt()) {
                // read the user input
                userGuess = in.nextInt();
                // outputs the random generated number and outputs if user was correct or high/low
                System.out.println("The generated number was: " + generatedValue);
                if (userGuess == generatedValue) {
                    // correct guess
                    System.out.println("You were right on the money! Good job!");
                } else if (userGuess > generatedValue) {
                    // too high
                    System.out.println("Your guess was too high!");
                } else {
                    // too low
                    System.out.println("Your guess was too low!");
                }

                // set done to true to kill loop
                done = true;
            } else {
                // not a valid int input, output error message and loop runs
                trash = in.nextLine();
                System.out.println("You stated that your guess was: " + trash);
                System.out.println("Please enter a valid input of int type for your guess when prompted!");
            }
            // if true, it will keep looping as it is invalid input, else stops with valid input
        } while (!done);
    }
}
