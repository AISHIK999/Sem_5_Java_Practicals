import java.util.Scanner;   // Scanner scans the user input

class W1_UserInput {
    // Java program to work with user inputs
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);     // Create a new instance of teh Scanner class that will take in user inputs

        System.out.println("Please enter an integer");
        int a = userInput.nextInt();    // The next integer entered by the user will br inserted into the userInput instance
        System.out.println("The input integer is: " + a);

        System.out.println("Please enter a decimal number");
        float b = userInput.nextFloat();
        System.out.println("The input number is: " + b);

        System.out.println("Please enter a string");
        String c = userInput.next();
        System.out.println("The input string is: " + c);
    }
}
