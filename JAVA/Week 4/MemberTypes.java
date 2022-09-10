//Work with default, public and protected member variables of a class. Set
//values and display values from main()
class MemberTypes{
    //default member variable
    int defaultMember = 0;
    //public member variable
    public int publicMember = 1;
    //protected member variable
    protected int protectedMember = 2;
    //private member variable
    private int privateMember = 3;
    //default member method
    void defaultMethod(){
        System.out.println("defaultMethod");
    }
    //public member method
    public void publicMethod(){
        System.out.println("publicMethod");
    }
    //protected member method
    protected void protectedMethod(){
        System.out.println("protectedMethod");
    }
    //private member method
    private void privateMethod(){
        System.out.println("privateMethod");
    }
    //main method
    public static void main(String[] args){
        //create an instance of the class
        MemberTypes mt = new MemberTypes();
        //display the values of the member variables
        System.out.println("defaultMember = " + mt.defaultMember);
        System.out.println("publicMember = " + mt.publicMember);
        System.out.println("protectedMember = " + mt.protectedMember);
        System.out.println("privateMember = " + mt.privateMember);
        //call the member methods
        mt.defaultMethod();
        mt.publicMethod();
        mt.protectedMethod();
        mt.privateMethod();
    }
}