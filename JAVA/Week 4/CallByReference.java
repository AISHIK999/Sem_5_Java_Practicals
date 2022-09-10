// Write a program to show call by reference using member variables of an object.
class CallByReference {
    int a, b;
    CallByReference(int i, int j) {
        a = i;
        b = j;
    }
    // pass an object
    void operation(CallByReference o) {
        o.a *= 2;
        o.b /= 2;
    }
    public static void main(String args[]) {
        CallByReference ob = new CallByReference(15, 20);
        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
        ob.operation(ob);
        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }
}