package day3evaluation;

public class Vehicle {
    double weight;
    double fuelCapacity;
    boolean isFuelPresent;

    //the method below assigns the values to the object of vehicle class
    public void assign(double weight, double fuelCapacity, boolean isFuelPresent){
        this.weight = weight;
        this.fuelCapacity= fuelCapacity;
        this.isFuelPresent=isFuelPresent;
    }
    //this method returns a boolean which tells if fuel is present or not
    public void isFuelPresentOrNot(){
        if(this.isFuelPresent) {
            //this print statement can be used if the method is only called to check if fuel is present or not
            System.out.println("Yes, Fuel is present in the vehicle");


        }
        else{
            System.out.println("No,Vehicle has no fuel");

        }

    }
    public void display(){
        System.out.println("Weight of the vehicle is : "+this.weight);
        System.out.println("Fuel capacity of the vehicle is :"+this.fuelCapacity);

        String hasFuelOrNot = (this.isFuelPresent==true)?"Yes, Fuel is present in the vehicle":"No,Vehicle has no fuel";
        System.out.println("Is Fuel Present in the Vehicle ? "+ hasFuelOrNot);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.assign(500,100,true);
        Vehicle v2 = new Vehicle();
        v2.assign(789,887,false);
        v2.display();
        v2.isFuelPresentOrNot();

       // v1.display();
        //v1.isFuelPresentOrNot();

    }


}
