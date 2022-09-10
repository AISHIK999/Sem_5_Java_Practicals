import java.util.Scanner;

class W1_LeapYear {
    // Java program to check whether a year is leap year or not
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        if (a%4 == 0){
            if (a%100 == 0){
                if (a%400 == 0){
                    System.out.println("Leap Year");
                }
                else{
                    System.out.println("Not a leap year");
                }
            }
            else {
                System.out.println("Leap Year");
            }
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
