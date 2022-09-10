import java.util.Scanner;

public class Marks {
    // Java program to find the average of marks of 2 subjects
    public static class Student{
        String name;
        int mark1, mark2;
        public void setStudent(String name, int mark){
            this.name = name;
            this.mark1 = mark1;
            this.mark2 = mark2;
        }
        public String getName(){
            return name;
        }
        public int getMark1(){
            return mark1;
        }
        public int getMark2(){
            return mark2;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setMark1(int mark1) {
            this.mark1 = mark1;
        }
        public void setMark2(int mark2) {
            this.mark2 = mark2;
        }
        public int getAverage(){
            return (mark1 + mark2) / 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of student: ");
        String n = sc.nextLine();
        System.out.println("Enter the marks of the student in subject 1: ");
        int mark1 = sc.nextInt();
        System.out.println("Enter the marks of the student in subject 2: ");
        int mark2 = sc.nextInt();
        Student student = new Student();

        student.setName(n);
        student.setMark1(mark1);
        student.setMark2(mark2);
        System.out.println("The average of the student " + student.getName() + " is: " + student.getAverage());
    }
}