package JDBCTutorial;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employee";
        String user = "root";
        String password = "759381";
        try{
            Connection con = DriverManager.getConnection(url,user,password);
            String query = "update emp_new set emp_name = ? ,salary  = ? where emp_id = ? ;";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1,"Shaurya");
            ps.setInt(2,95000);
            ps.setInt(3,67);
            ps.executeUpdate();
            String showTable = "select * from emp_new;";
            String del = "delete from emp_new where emp_id = 9 or emp_id = 10 ";
            Statement s = con.createStatement();
            s.executeUpdate(del);
            ResultSet rs = s.executeQuery(showTable);
            while (rs.next()){
                System.out.println(rs.getString(1)+" "+ rs.getString(2)+" "+rs.getString(3)+" "+ rs.getString(4) );
            }
            con.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
