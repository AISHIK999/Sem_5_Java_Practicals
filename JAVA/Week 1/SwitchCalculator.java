import java.util.Scanner;

class W1_SwitchCalculator {
    // Java program to create a basic calculator using switch case
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the operator: ");
        char op = sc.next().charAt(0);
        System.out.println("The answer is:");
        switch (op) {
            case '+' -> System.out.println(num1 + num2);
            case '-' -> System.out.println(num1 - num2);
            case '*' -> System.out.println(num1 * num2);
            case '/' -> System.out.println(num1 / num2);
            default -> System.out.println("Invalid operator");
        }
    }
}
