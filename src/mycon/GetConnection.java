package mycon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class GetConnection {
    static Statement st;
    static Connection con;
    public static Statement getConnect(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","123");
        st=con.createStatement();}
        catch(Exception e){
            System.out.println(e);
        }
        return st;
    }
    public static void colseConnection(){
        try{
        st.close();
        con.close();}
        catch(Exception e){
            System.out.println(e);
        }
    }
}
