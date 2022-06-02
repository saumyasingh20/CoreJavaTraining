package june2;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    static int empID = 0;
    String empName;
    int empAge;
    char gender;
     Map<Integer,String> employeeMap = new HashMap<>();

    public Employee(String empName, int empAge, char gender) throws MinorAgeException, EmpNameMismatch, GenderMismatchException {
        if (empName.matches(".*\\d.*")|| empName.isEmpty() ) {
            throw new EmpNameMismatch("Name can't contain non-alphabetic characters or be empty");
        }
        if(empAge<18){
            throw new MinorAgeException("Employee's age can't be lesser than 18 !");
        }
        if(!(gender=='M' || gender=='F')){
            throw  new GenderMismatchException("Gender can either be male or female");
        }

        this.empName = empName;
        this.empAge = empAge;
        this.gender = gender;
        employeeMap.put(empID++,empName);

    }
    public String getEmployeeNameById(int inputID) throws EmployeeNotFound {
        if(!employeeMap.containsKey(inputID)){
            throw new EmployeeNotFound("Employee Details Not Found in DB");
        }
        return employeeMap.get(inputID);
    }

}
