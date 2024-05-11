package javaapplication70;
import java.sql.*;

class SQL_connector{
    String username = "root";
    String password = "Hypernova1";
    void connect()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/db",username,password);
            Statement smt = conn.createStatement();
            ResultSet s = smt.executeQuery("SELECT * FROM personnel");
            System.out.println("Done");
            while(s.next())
            {
                int ID = s.getInt("PersonnelID");
                String name = s.getString("name_of_the_individual");
                int dob = s.getInt("DOB");
                int tid =  s.getInt("Team_ID");
                System.out.print("ID: "+ID);
                System.out.print("name: "+name);
                System.out.print("Date_of_birth: "+dob);
                System.out.println("Team_ID: "+tid);
            }
            s.close();
            smt.close();
            conn.close();
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

