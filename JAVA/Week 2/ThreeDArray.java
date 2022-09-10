import java.util.Scanner;

public class ThreeDArray{
    //Java program to create a 3D Array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the width of the array: ");
        int m = sc.nextInt();
        System.out.println("Enter the height of the array: ");
        int o = sc.nextInt();
        int[][][] a = new int[n][m][o];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < o; k++) {
                    System.out.print("Enter element [" + i + "][" + j + "][" + k + "]: ");
                    a[i][j][k] = sc.nextInt();
                }
            }
        }
        // Unable to properly visualize a 3D array in the terminal
        System.out.println("The 3D array is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < o; k++){
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }

}