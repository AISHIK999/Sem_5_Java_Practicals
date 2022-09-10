import java.util.Scanner;

public class TwoDArray{
    //Java program to print a 2D array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The 2D array is: ");
        System.out.println("[");
        for (int i = 0; i < n; i++) {
            System.out.print("[");
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }
        System.out.print("]");
    }
}