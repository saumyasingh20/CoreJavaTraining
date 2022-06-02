package may26;
class Employee{
    int id;
    String name;
    int deptId;
    long phoneNumber;


    public Employee(int id, String name, int deptId, long phoneNumber) {
        this.id = id;
        this.name = name;
        this.deptId = deptId;
        this.phoneNumber = phoneNumber;
    }

    public void display(){
        System.out.println(this.id + " "+ " "+ this.name + " "+this.deptId+" "+ this.phoneNumber);

    }
    public void  display(int id){
        System.out.println(this.id);
    }
    public void display(String name){
        System.out.println(this.name);
    }
    public void display(int id,int deptId){
        System.out.println(this.id + " "+ this.deptId);
    }
    public void display(long phoneNumber){
        System.out.println(this.phoneNumber);
    }
}
class Trainee extends Employee{
    String lastName;
    String departmentName;

    public Trainee(int id, String name, int deptId, long phoneNumber, String lastName, String departmentName) {
        super(id, name, deptId, phoneNumber);
        this.name = lastName;
        this.departmentName = departmentName;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Saumya",301,8527646170l);
        e1.display();
        e1.display(e1.id);
        e1.display(e1.phoneNumber);
        e1.display(e1.id,e1.deptId);
        e1.display(e1.name);
        Trainee t = new Trainee(2,"saumya",305,9876666889l,"singh","r&d");
         t.display();

    }
}
