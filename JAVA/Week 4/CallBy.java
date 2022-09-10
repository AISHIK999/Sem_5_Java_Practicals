// Write a program to show call by value
// We will create a simple swap method
class CallBy{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping a = " + a + " b = " + b);
        swap(a, b);
        System.out.println("After swapping a = " + a + " b = " + b);
    }
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}