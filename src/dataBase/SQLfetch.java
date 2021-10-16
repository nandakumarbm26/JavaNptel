package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLfetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
            st.execute("select *from studentJava");
            rs=st.getResultSet();
            System.out.println("\n\n--------------------------RESTULTS----------------------");
            while(rs.next()) {
            	System.out.println(rs.getString("roll")+"\t"+rs.getString("name")+"\t"+rs.getString("marks"));
            }
            System.out.println("================================================================");
            rs.last();
            
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
