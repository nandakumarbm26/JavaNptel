package dataBase;
import java.sql.*;
public class Jdbc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String user="root";
            String pass="nk123456";
            String url="jdbc:mysql://localhost:3306/student";

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user,pass);
			Statement stmt =con.createStatement();
			ResultSet rs=stmt.executeQuery("select name from student");
			while(rs.next()) {
				System.out.println();
			}
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
