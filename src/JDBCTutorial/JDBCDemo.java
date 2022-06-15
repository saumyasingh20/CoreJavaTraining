package JDBCTutorial;

import java.sql.*;
import java.util.Scanner;

public class JDBCDemo {
    public static void main(String[] args)  {
        String url = "jdbc:mysql://localhost:3306/employee";
        String user = "root";
        String password = "759381";
        try{
            Scanner scan = new Scanner(System.in);
            Connection con = DriverManager.getConnection(url,user,password);
//            System.out.println("Database is connected");
            String sql = "select * from emp_new;";
//            String del = "delete from emp_new where emp_name = 'Sai s';";
//            String insert = "insert into emp_new values(1,'Saumya',90000,3);";
            System.out.println("Enter employee id :");
            int id = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter employee name : ");
            String name = scan.nextLine();
            System.out.println("Enter employee salary : ");
            int salary = scan.nextInt();
            System.out.println("Enter project id : ");
            int projId = scan.nextInt();
            String userInsert = "insert into emp_new values("+id+",'"+name+"',"+salary+","+projId+");";

            Statement s = con.createStatement();
            s.executeUpdate(userInsert);


//            s.executeUpdate(del);
//            s.executeUpdate(insert);
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getString(1)+" "+ rs.getString(2)+" "+rs.getString(3)+" "+ rs.getString(4) );
            }
            con.close();

        }catch (SQLException e){

            System.out.println(e.getMessage());
        }

    }
}
