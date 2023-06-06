import java.util.Scanner; // import scanner for user inputs

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CtoFConverter {
    public static void main(String[] args) {
        // initialize the scanner for user input
        Scanner in = new Scanner(System.in);

        // declare variables
        double tempInC = 0; // temperature input in C
        double tempInF = 0; // temperature output in F
        String trash = ""; // string for if user inputs an invalid type/input
        boolean done = false; // boolean value for indicating user input is valid or not, ends loop for valid input

        // do while loop will keep looping until valid input is received
        do {
            // output and obtain user input for temp in C
            System.out.println("Please enter temperature in Celsius:");
            // checks if the user inputted a valid input/type
            if (in.hasNextDouble()) {
                // valid double input
                // read the user input
                tempInC = in.nextDouble();
                // convert from C to F
                tempInF = (tempInC * (1.8)) + 32;
                // output the results of the conversion
                System.out.println("Given input of temperature: " + tempInC + " degrees C");
                System.out.println("The converted temperature from C to F is: " + tempInF + " degrees F");
                // set done to true to kill loop
                done = true;
            } else {
                // not a valid double input, output error message and loop runs
                trash = in.nextLine();
                System.out.println("You stated that the temperature was: " + trash);
                System.out.println("Please enter a valid input of double type for temperature in C when prompted!");
            }
        // if true, it will keep looping as it is invalid input, else stops with valid input
        } while (!done);

    }
}