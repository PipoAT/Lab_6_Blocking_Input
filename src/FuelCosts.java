import java.util.Scanner;  // import scanner for user inputs

public class FuelCosts {
    public static void main(String[] args) {
        // initialize the scanner for user input
        Scanner gallonsOfGas = new Scanner(System.in); // scanner for number of gallons in tank
        Scanner milesPerGallon = new Scanner(System.in); // scanner for mpg/fuel efficiency
        Scanner priceOfGas = new Scanner(System.in); // scanner for price of gas

        // declare variables
        double gallonsOfGasDeclared = 0; // user input of gallons of gas used
        double milesPerGallonDeclared = 0; // user input of mpg
        double priceOfGasDeclared = 0; // user input of gas prices
        double pricePer100Miles = 0; // the total price per 100 miles
        double distance = 0; // distance that can be travelled
        String trash = ""; // string for if user inputs an invalid type/input
        boolean validInput = false; // boolean value for indicating user input is valid or not, ends loop for valid input

        // do while loop will keep looping until valid input  of gallons of gas input is received
        do {
            // output and obtain user input for gallons of Gas
            System.out.println("Please enter the number of gallons of gas in the tank:");
            if (gallonsOfGas.hasNextDouble()) {
                // valid input, reads user input and breaks loop
                gallonsOfGasDeclared = gallonsOfGas.nextDouble();
                validInput = true;
            } else {
                // obtains invalid input
                trash = gallonsOfGas.nextLine();
                // invalid input, output error message and loop reruns to allow another input
                System.out.println("You have inputted the gallons of gas to be: " + trash);
                System.out.println("Please enter a valid input of double type when prompted!");
            }
            // if true, it will keep looping as it is invalid input, else stops with valid input
        } while (!validInput);

        // set up the do while for the mpg variable/input
        validInput = false;
        do {
            // output and obtain user input for mpg
            System.out.println("Please enter the number of miles per gallon:");
            if (milesPerGallon.hasNextDouble()) {
                // valid input, reads user input and breaks loop
                milesPerGallonDeclared = milesPerGallon.nextDouble();
                validInput = true;
            } else {
                // obtains invalid input
                trash = milesPerGallon.nextLine();
                // invalid input, output error message and loop reruns to allow another input
                System.out.println("You have inputted the mpg to be: " + trash);
                System.out.println("Please enter a valid input of double type when prompted!");
            }
            // if true, it will keep looping as it is invalid input, else stops with valid input
        } while (!validInput);

        // set up the do while for the price of gas input
        validInput = false;
        do {
            // output and obtain user input for mpg
            System.out.println("Please enter the price of gas:");
            if (priceOfGas.hasNextDouble()) {
                // valid input, reads user input and breaks loop
                priceOfGasDeclared = priceOfGas.nextDouble();
                validInput = true;
            } else {
                // obtains invalid input
                trash = priceOfGas.nextLine();
                // invalid input, output error message and loop reruns to allow another input
                System.out.println("You have inputted the price of gas to be: " + trash);
                System.out.println("Please enter a valid input of double type when prompted!");
            }
            // if true, it will keep looping as it is invalid input, else stops with valid input
        } while (!validInput);

        // after checking for the valid inputs, calculate the cost per 100 miles
        pricePer100Miles = (100 / milesPerGallonDeclared) * priceOfGasDeclared;
        distance = gallonsOfGasDeclared * milesPerGallonDeclared;

        // output the results
        System.out.println("The price per 100 miles is: " + pricePer100Miles);
        System.out.println("The distance that can be travelled in miles is: " + distance);

    }
}
