package employeedb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class EmployeeUser {
	public static void showAllEmployee() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your id");
		int inputId = scanner.nextInt();
		boolean result = false;
		try {
			Connection con = DBConnection.connect();
			String query = "select * from employee";
		    Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				int id1 = rs.getInt(1);
				String name = rs.getString(2);
				String phone = rs.getString(3);
				String address = rs.getString(4);
				String salary = rs.getString(5);
				if((inputId==id1)) {
				System.out.println("Employee Id  : " +id1+"\n Employee Name :"+name+"\nEmployee Phone :"+phone+"\nEmployee Address :"+address+"\nEmployee Salary :"+salary);
				System.out.println("--------------------------------");
				return;
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	}

