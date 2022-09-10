class W1_Math {
    // Java program to work with Math class
    public static void main(String[] args) {
        /*
        * We can generate a random number between lower limit x and upper limit y using the Math class.
        * Math.random() returns a random number between 0 and 1.
        * We will multiply that number with (y-x+1) and add the lower limit to fit the number in the required range.
        */
        int random = (int)Math.floor(Math.random()*(500-100+1)+100);    // Floor value is the lower limit of a decimal value
        System.out.println("A number between 100 and 500 is: " + random);

        float root = (float) Math.sqrt(random);     // Find square root of a number using sqrt()
        System.out.println("Square root of "+random+" is: "+root);
    }
}
