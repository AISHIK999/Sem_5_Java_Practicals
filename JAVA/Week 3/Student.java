public class Student {
    // Java program to use getters and setters to create and check a student object
    public static class human {
        String name;
        int RollNo;
        String Stream;

        public void setname(String name) {
            this.name = name;
        }

        public void setRollNo(int RollNo) {
            this.RollNo = RollNo;
        }

        public void setStream(String Stream) {
            this.Stream = Stream;
        }

        public String getname() {
            return name;
        }

        public int getRollNo() {
            return RollNo;
        }

        public String getStream() {
            return Stream;
        }
    }

    public static void main(String[] args) {
        human h = new human();
        h.setname("John Doe");
        h.setRollNo(1);
        h.setStream("CSE");
        System.out.println("Name: " + h.getname());
        System.out.println("Roll No: " + h.getRollNo());
        System.out.println("Stream: " + h.getStream());
    }
}
