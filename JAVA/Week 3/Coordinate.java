import java.util.Scanner;

public class Coordinate {
    // Java program to create two 3D coordinates and check whether they coincide
    public static class point {
        int x;
        int y;
        int z;

        public void setPoint(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        // Getters
        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getZ() {
            return z;
        }

        // Setters
        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public void setZ(int z) {
            this.z = z;
        }
    }
    // Method to check whether the two coordinates are same
    public static boolean checkSimilarity(point a, point b){
        if(a.getX() == b.getX() && a.getY() == b.getY() && a.getZ() == b.getZ()){
            return true;
        }
        else{
            return false;
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("For the first coordinate:");
        System.out.println("Enter the x coordinate:");
        int x1 = sc.nextInt();
        System.out.println("Enter the y coordinate:");
        int y1 = sc.nextInt();
        System.out.println("Enter the z coordinate:");
        int z1 = sc.nextInt();
        System.out.println("For the second coordinate:");
        System.out.println("Enter the x coordinate:");
        int x2 = sc.nextInt();
        System.out.println("Enter the y coordinate:");
        int y2 = sc.nextInt();
        System.out.println("Enter the z coordinate:");
        int z2 = sc.nextInt();
        point a = new point();
        point b = new point();
        a.setPoint(x1, y1, z1);
        b.setPoint(x2, y2, z2);
        if(checkSimilarity(a, b)){
            System.out.println("The two coordinates are same");
        }
        else{
            System.out.println("The two coordinates are not same");
        }
    }
}