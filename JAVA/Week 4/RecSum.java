//Find out sum of n natural numbers using recursion
class RecSum{
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of first "+n+" natural numbers is "+sum(n));
    }
    static int sum(int n){
        if(n==1)
            return 1;
        else
            return n+sum(n-1);
    }
}