import java.util.Scanner;

public class TwoDimTable{
    // Java program to display the multiplication table of a number in a 2D array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tables you want to check: ");
        int rows = sc.nextInt();
        System.out.println("Enter the limit of each table: ");
        int columns = sc.nextInt();
        int[][] table = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        System.out.println("The multiplication tables are: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}