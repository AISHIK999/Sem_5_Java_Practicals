import java.util.Scanner;

class W1_IfElse {
    // Java program to work with if-else statement
    /*
    * We will create a fizz-buzz program
    * If input number is multiple of 3, we will print "Fizz"
    * If input number is multiple of 5, we will print "Buzz"
    * If input number is multiple of both, we will print "Fizz Buzz"*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: \n");
        int a = input.nextInt();

        if (a%15 == 0){
            System.out.println("Fizz Buzz");
        }
        else if (a%3 == 0){
            System.out.println("Fizz");
        }
        else if (a%5 == 0) {
            System.out.println("Buzz");
        }
        else{
            System.out.println("No answer");
        }
    }
}
