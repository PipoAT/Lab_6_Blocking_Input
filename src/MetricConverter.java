import java.util.Scanner; // import scanner for user input

public class MetricConverter {

    public static void main(String[] args) {
        // initialize the scanner for user input
        Scanner in = new Scanner(System.in);

        // declare variables
        double measurementInMeters = 0; // user input of measurement in meters
        double measurementInMiles = 0; // measurement output in miles
        double measurementInFeet = 0; // measurement output in feet
        double measurementInInches = 0; // measurement output in inches
        String trash = ""; // string for if user inputs an invalid type/input
        boolean done = false; // boolean value for indicating user input is valid or not, ends loop for valid input

        // do while loop will keep looping until valid input is received
        do {
            // output and obtain user input for meters
            System.out.println("Please enter measurement in meters:");
            // checks if the user inputted a valid input/type
            if (in.hasNextDouble()) {
                // valid double input
                // read the user input
                measurementInMeters = in.nextDouble();
                // convert to feet, in, miles
                measurementInMiles = measurementInMeters / 1609.344; // miles
                measurementInFeet = measurementInMiles * 5280; // feet
                measurementInInches = measurementInFeet * 12; // inches
                // output the results of the conversion
                System.out.println("The converted length in miles from meters is: " + measurementInMiles + " miles.");
                System.out.println("The converted length in feet from meters is: " + measurementInFeet + " feet.");
                System.out.println("The converted length in inches from meters is: " + measurementInInches + " inches.");
                // set done to true to kill loop
                done = true;
            } else {
                // not a valid double input, output error message and loop runs
                trash = in.nextLine();
                System.out.println("You stated that the measurement in meters was : " + trash);
                System.out.println("Please enter a valid input of double type for measurement in meters when prompted!");
            }
            // if true, it will keep looping as it is invalid input, else stops with valid input
        } while (!done);

    }
}
