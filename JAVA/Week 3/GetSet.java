public class GetSet {
    // Java program to implement a class coordinate with a method to display
    //values of member variables and assign the values of the member variable inside the
    //main method.
    public static class coordinate {
        int x;
        int y;
        int z;
        public void setCoordinate(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
        public void display() {
            System.out.println("x = " + x + ", y = " + y + ", z = " + z);
        }
    }
    public static void main(String[] args) {
        coordinate c = new coordinate();
        c.setCoordinate(10, 20, 30);
        c.display();
    }


}