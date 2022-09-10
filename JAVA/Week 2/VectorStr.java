import java.util.Vector;
import java.util.Scanner;

public class VectorStr{
    // Java program to demonstrate working of Vector using strings
    public static void main(String[] args){
        Vector<String> list = new Vector<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings to add in the vector:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Enter the string number "+(i+1)+":");
            list.add(sc.next());
        }
        System.out.println("The strings in the vector are:");
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}