import java.util.Scanner;

public class ReplaceStr {
    //Java program to replace the contents of a string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        System.out.println("Enter the string to be replaced:");
        String str1 = sc.nextLine();
        System.out.println("Enter the string to be replaced with:");
        String str2 = sc.nextLine();
        System.out.println("The new string is \n" + str.replace(str1, str2));
    }

}