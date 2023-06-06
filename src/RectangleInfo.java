import java.util.Scanner; // import scanner for user inputs

import static java.lang.Math.sqrt; // import sqrt for math calculations of diagonal length

public class RectangleInfo {

    public static void main(String[] args) {

        // initialize scanners for user inputs
        Scanner width = new Scanner(System.in); // user input for width
        Scanner height = new Scanner(System.in); // user input for height

        // declare variables
        double widthInput = 0; // user variable for the width of rectangle
        double heightInput = 0; // user variable for the height of rectangle
        double area = 0; // area of the rectangle
        double perimeter = 0; // perimeter of the rectangle
        double diagonalLength = 0; // diagonal length of rectangle
        String trash = ""; // string for if user inputs invalid input
        boolean validInput = false; // boolean value for indicating user input is valid or not, ends loop for valid input

        do {
            // output and obtain user input for width
            System.out.println("Please enter the width:");
            if (width.hasNextDouble()) {
                // valid input, reads user input and breaks loop
                widthInput = width.nextDouble();
                validInput = true;
            } else {
                // obtains invalid input
                trash = width.nextLine();
                // invalid input, output error message and loop reruns to allow another input
                System.out.println("You have inputted the width to be: " + trash);
                System.out.println("Please enter a valid input of double type when prompted!");
            }
            // if true, it will keep looping as it is invalid input, else stops with valid input
        } while (!validInput);

        // do while loop for height input
        // reset the validInput indicator
        validInput = false;
        do {
            // output and obtain user input for height
            System.out.println("Please enter the height:");
            // output and obtain user input for height:");
            if (height.hasNextDouble() || height.hasNextInt()) {
                // valid input, reads user input and breaks loop
                if (height.hasNextDouble()) {
                    heightInput = height.nextDouble();
                } else {
                    heightInput = height.nextInt();
                }
                validInput = true;
            } else {
                // obtains invalid input
                trash = height.nextLine();
                // invalid input, output error message and loop reruns to allow another input
                System.out.println("You have inputted the height to be: " + trash);
                System.out.println("Please enter a valid input of double type when prompted!");
            }
            // if true, it will keep looping as it is invalid input, else stops with valid input
        } while (!validInput);

        // after checking for valid inputs, calculate the area and perimeter, as well as diagonal length
        area = widthInput * heightInput;
        perimeter = (2 * widthInput) + (2 * heightInput);
        diagonalLength = sqrt((widthInput * widthInput) + (heightInput * heightInput));

        // output results
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The diagonal length of the rectangle is: " + diagonalLength);

    }
}
