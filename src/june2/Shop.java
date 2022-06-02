package june2;
//class inside interface
public interface Shop {
    void buyLaptop(Laptop2 l);

    class Laptop2 {
        int model;
        String manufacturer;

        public Laptop2(int model, String manufacturer) {
            this.model = model;
            this.manufacturer = manufacturer;
        }

        void  xyz(){
            System.out.println("in laptop class "+this.manufacturer+" "+this.model);
        }
    }
}
class RelianceMart implements Shop{
    public void buyLaptop(Laptop2 l) {
        System.out.println(l.model+" "+l.manufacturer);
    }

    public static void main(String[] args) {
       RelianceMart a = new RelianceMart();
       a.buyLaptop(new Laptop2(5,"Dell"));
       Laptop2 L = new Laptop2(6,"apple");
       L.xyz();


    }



}