//Change marks of a student by 2 with the help of object passing
class ChangeMarks{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.marks = 50;
        System.out.println("Before change: "+s1.name+" "+s1.marks);
        change(s1);
        System.out.println("After change: "+s1.name+" "+s1.marks);
    }
    static void change(Student s){
        s.marks = s.marks + 2;
    }
}