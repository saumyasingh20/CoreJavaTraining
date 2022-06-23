package StreamDemo;

import java.io.*;

public class SerializationDemo implements Serializable {
    int id;
    String name;
    long salary;
    transient String departmentName;

    static  final long SerialVersionUID=55445L;

    public SerializationDemo(int id, String name, long salary, String departmentName) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departmentName=departmentName;
    }

    public static void main(String[] args) {
        try{
            SerializationDemo e1 = new SerializationDemo(1,"Saumya",69000,"engineering");
            SerializationDemo e2 = new SerializationDemo(2,"sai",87768,"it");
            SerializationDemo e3 = new SerializationDemo(3,"hari",56798,"dev");

            FileOutputStream fos = new FileOutputStream("C:\\Users\\saumya.singh\\eclipse-workspace\\CoreJavaTraining\\src\\StreamDemo\\Test.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            FileInputStream fis = new FileInputStream("C:\\Users\\saumya.singh\\eclipse-workspace\\CoreJavaTraining\\src\\StreamDemo\\Test.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            oos.writeObject(e1);
            oos.writeObject(e2);
            oos.writeObject(e3);

            System.out.println("Object properties serialized ");
           // System.out.println(e1.departmentName);
            for(int i = 0;i<3;i++){
                SerializationDemo obj = (SerializationDemo) ois.readObject();
                System.out.println(obj.id+" "+ obj.name+ " "+obj.salary+" "+obj.departmentName);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
