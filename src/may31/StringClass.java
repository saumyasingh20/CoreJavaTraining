package may31;

public class StringClass {
    public static void main(String[] args) {
        String str = "This is a Sample string to test all the methods of string class ";
        System.out.println(str.length());
        System.out.println(str.charAt(51)+" "+str.charAt(52));
        System.out.println(str.indexOf('z'));
        String str2 = str.concat("concat me");
        String str3 = str2.concat("hi whats up");
        System.out.println(str3);
        String array[]=str.split(" ");
        for(String s : array){
            System.out.print(s+"**");

        }
        System.out.println();
        String str4 = str.replace('s','z');
        boolean isPresent = str.contains("This");

        System.out.println(str4);
        System.out.println(isPresent);

        String str5 = str.substring(0,10);
        System.out.println(str5);
        String str6 = "          test         ";
        str6= str6.stripLeading();
        System.out.println(str6);
        String str7 = str6.concat("hi yo");
        System.out.println(str7);
        StringBuffer str8 = new StringBuffer(str);

        str8.reverse();
        System.out.println(str8);


    }
}
