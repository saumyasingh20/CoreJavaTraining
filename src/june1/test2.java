package june1;

public class test2 {
    public static void xyz(String str){
        try{
            if(str.charAt(0)=='a' || str.charAt(0)=='A')
                throw new NumberFormatException("Exception occurred - String can't start with alphabet A");
            else
                System.out.println(str);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        xyz("Abcd");
    }
}
