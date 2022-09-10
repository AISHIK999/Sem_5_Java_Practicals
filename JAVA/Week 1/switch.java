import java.util.Scanner;

class W1_switch {
    // Java program to use switch case
    // Same FizzBuzz problem with switch case
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer from 1 to 7:");
        int a = input.nextInt();

        switch (a) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Invalid input");
        }
    }
}
