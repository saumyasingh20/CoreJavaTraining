package may24;
class Bank{
    String name;
    double balance;

    public Bank(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double deposit(double amount){
        this.balance+=amount;
        System.out.println(amount+" credited to your bank account, Current balance "+balance);
        return balance;
    }
    public double withdraw(double amount){
        if(balance<amount)
            {
            System.out.println("Insufficient Balance");
            return 0;
        }
        balance-=amount;
        System.out.println(amount+" debited from your bank account, Current balance "+balance);
        return balance;
    }
}
class Animal{
    String name;
     int numOfLegs;
    boolean hasWings;

    public Animal(String name, int numOfLegs, boolean hasWings) {
        this.name = name;
        this.numOfLegs = numOfLegs;
        this.hasWings = hasWings;
    }

    public void canFly(){
        if(this.hasWings)
            System.out.println(this.name+" can fly");
        else
            System.out.println(this.name+" can't fly");
    }
}
class Car{
    String color;
    int noOfTyres;
    int noOfWindows;
    public void drive(){
        System.out.println("car drives");
    }
}

public class OopsTutorial {
    public static void main(String[] args) {
        Car audi = new Car();
        Animal chimpanzee = new Animal("Chimpanzee",2,false);
        Animal pigeon = new Animal("pigeon",2,true);
        Animal partyAnimal = new Animal("Sanjay",2,false);
//        partyAnimal.canFly();

        Bank kotak = new Bank("saumya",3000);
        kotak.deposit(5000);
        kotak.withdraw(1000);


    }

}
