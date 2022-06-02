package june2;

public class ExceptionTest {
    public static void main(String[] args) {
        try{
            Employee emp1 = new Employee("Saumya Singh",22,'F');

            System.out.println(emp1.getEmployeeNameById(787));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
