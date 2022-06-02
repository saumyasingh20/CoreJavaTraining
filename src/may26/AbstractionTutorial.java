package may26;
interface Vehicle {
    String typeOfVehicle();
    boolean hasEngine();
    int numberOfWheels();
}
class Bicycle implements Vehicle {

    @Override
    public boolean hasEngine() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int numberOfWheels() {
        // TODO Auto-generated method stub
        return 2;
    }

    @Override
    public String typeOfVehicle() {
        // TODO Auto-generated method stub
        return "Bicycle";
    }

}
interface Car extends Vehicle {
    @Override
    boolean hasEngine();
    @Override
    int numberOfWheels();
    String modelOfCar();
    int numberOfGears();
    String brand();
    int numOfDoors();
    int horsepower();
    String typeOfCar();
    int numOfSeats();
}
abstract class Ford implements Car {

    @Override
    public boolean hasEngine() {

        return true;
    }

    @Override
    public int numberOfWheels() {

        return 4;
    }

    @Override
    public int numberOfGears() {

        return 8;
    }

    @Override
    public String brand() {

        return "FORD";
    }

    abstract public String modelOfCar();
    @Override
    abstract public int numOfDoors();

    @Override
    abstract public int horsepower();

    @Override
    abstract public String typeOfCar();
    abstract public int numOfSeats();


}
class Mustang extends Ford {

    @Override
    public int numOfDoors() {
        // TODO Auto-generated method stub
        return 2;
    }

    @Override
    public int horsepower() {
        // TODO Auto-generated method stub
        return 310;
    }

    @Override
    public String typeOfCar() {
        // TODO Auto-generated method stub
        return "Sedan";
    }

    @Override
    public int numOfSeats() {
        // TODO Auto-generated method stub
        return 2;
    }

    @Override
    public String modelOfCar() {
        // TODO Auto-generated method stub
        return "Mustang";
    }

    @Override
    public String typeOfVehicle() {
    
        return "Car";
    }

}

public class AbstractionTutorial {
    public static void main(String[] args) {
        Mustang v1 = new Mustang();
        System.out.println("Type of Vehicle : "+ v1.typeOfVehicle());
        System.out.println("Has Engine : "+ v1.hasEngine());
        System.out.println("Brand : " + v1.brand());
        System.out.println("Model : " + v1.modelOfCar());


        System.out.println("Horsepower : "+v1.horsepower());

        System.out.println("Number of Gears : "+v1.numberOfGears());
        System.out.println("Number of Wheels : "+v1.numberOfWheels());
        System.out.println("Number of Seats : "+v1.numOfSeats());
        System.out.println("Body type of Car : "+v1.typeOfCar());
        Vehicle v2 = new Bicycle();
        System.out.println();
        System.out.println("Type of Vehicle : "+ v2.typeOfVehicle());
        System.out.println("Has Engine : "+ v2.hasEngine());
        System.out.println("Number of Wheels : "+v2.numberOfWheels());

    }
}
