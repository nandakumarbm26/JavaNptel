package dataBase;
import java.sql.*;

public class connect {
    public static void main(String[] args) {
        Connection conn=null;
        Statement st=null;
        ResultSet rs=null;
        String tableName;
        try {
            String user="root";
            String pass="nk123456";
            String url="jdbc:mysql://localhost:3306/student";

            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            conn=DriverManager.getConnection(url, user,pass);
            System.out.println("Connection was successfull");
            st=conn.createStatement();
            //st.execute("create table studentJava(roll integer primary key, name varchar(30),marks integer not null)");
            st.execute("insert into studentJava values(1,'Nanda',99)");
            st.execute("insert into studentJava values(2,'Bob',79)");
            st.execute("insert into studentJava values(3,'Alice',29)");
            st.execute("insert into studentJava values(4,'ram',100)");
            
            st.execute("update studentJava set Name='Aliceia' where Name='Alice' ");
            st.execute("delete from studentJava where marks=100");
           // st.execute("delete from studentJava");
        }catch(SQLException e) {
        	System.out.println(e.getMessage());
        }
        
        catch (Exception e) {
            //TODO: handle exception
            System.out.println("cannot connect : "+e);
        }finally{
            if(conn!=null){
                try {
                    conn.close();
                    System.out.println("database connection terminated");
                } catch (Exception e) {
                    //TODO: handle exception
                }
            }
        }
    }
}