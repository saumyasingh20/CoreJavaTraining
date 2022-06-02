package may25;

public class Student {
    int id;
    String name;
    double marks;
    static  int numberOfStudents=0;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, double marks) {
        this(id,name);
        this.marks = marks;
        numberOfStudents++;
    }
    public void display2(){
        System.out.println(this.id);
        System.out.println(this.marks);
    }
    public  void display(){
        System.out.println(this.name);
        this.display2();
    }
    public boolean studentIsPassed(){
        if(this.marks>=40)
             return true;

        return false;
    }

    public static void main(String[] args) {
        Student s1 = new Student(1,"Saumya",40);

        String isPassed = (s1.studentIsPassed())?s1.name+" is Passed":s1.name+" is failed";

//        System.out.println(isPassed);
//        s1.display();
        Student s2 = new Student(2,"Sai",60);
        Student s3 = new Student(3,"hari",89);
        Student s4 = new Student(4,"vignesh",70);
//        s2.display();
//        s3.display();
        s4.display();
        System.out.println("no of objects- "+Student.numberOfStudents);
    }
}
