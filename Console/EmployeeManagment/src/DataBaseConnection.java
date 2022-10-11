import java.sql.*;
public class DataBaseConnection {
	static Connection con;
	public static Connection connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String user = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/employee_db";
			con = DriverManager.getConnection(url,user,password);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
