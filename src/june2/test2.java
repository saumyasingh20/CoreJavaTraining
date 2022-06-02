package june2;
//interface inside interface , implementing outer
public class test2 implements Old{
    @Override
    public void xyz() {
        System.out.println("xyz");
    }

    public static void main(String[] args) {
      test2 t = new test2();
      t.xyz();
    }
}
