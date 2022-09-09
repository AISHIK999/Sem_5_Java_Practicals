//Find out factorial of a number using recursion
class Factorial{
    public static void main(String[] args){
        int n = 5;
        System.out.println("Factorial of "+n+" is "+fact(n));
    }
    static int fact(int n){
        if(n==1)
            return 1;
        else
            return n*fact(n-1);
    }
}