// Increase the salary of a person by Rs. 1000 with the help of object passing
class Salary{
    int salary;
    Salary(int salary){
        this.salary = salary;
    }
    void increaseSalary(Salary s){
        s.salary += 1000;
    }
    void display(){
        System.out.println("Salary: " + salary);
    }
    public static void main(String[] args){
        Salary s = new Salary(10000);
        s.display();
        s.increaseSalary(s);
        s.display();
    }
}