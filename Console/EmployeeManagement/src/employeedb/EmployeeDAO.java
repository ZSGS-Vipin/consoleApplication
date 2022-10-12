package employeedb;
import java.sql.*;
public class EmployeeDAO {
	public static boolean insertEmployee(EmployeePojo employeepojo) {
		boolean result = false;
		try {
			Connection con = DBConnection.connect();
			String query = "insert into employee(empName,empPhone,empAddress,empSalary) values(?,?,?,?)";
			PreparedStatement preparedStatement = con.prepareStatement(query);
			preparedStatement.setString(1, employeepojo.getEmpName());
			preparedStatement.setString(2, employeepojo.getEmpPhone());
			preparedStatement.setString(3, employeepojo.getAddress());
			preparedStatement.setString(4, employeepojo.getSalary());
			preparedStatement.executeUpdate();
			result = true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}
	public static boolean deleteEmployee(int empId) {
		boolean result = false;
		try {
			Connection con = DBConnection.connect();
			String query = "delete from employee where empId=?";
			PreparedStatement psmt = con.prepareStatement(query);
			psmt.setInt(1,empId);
			psmt.executeUpdate();
			result = true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public static void showAllEmployee() {
		boolean result = false;
		try {
			Connection con = DBConnection.connect();
			String query = "select * from employee";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String phone = rs.getString(3);
				String address = rs.getString(4);
				String salary = rs.getString(5);
				System.out.println("Employee Id  : " +id+"\n Employee Name :"+name+"\nEmployee Phone :"+phone+"\nEmployee Address :"+address+"\nEmployee Salary :"+salary);
				System.out.println("--------------------------------");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static boolean updateEmployee(int val, String toUpdate, int id, EmployeePojo employeePojo) {
		boolean result = false;
		try {
			Connection con = DBConnection.connect();
			if(val==1) {
				//updating name
				String query = "update employee set empName=? where empId=?";
				PreparedStatement psmt = con.prepareStatement(query);
				psmt.setString(1, toUpdate);
				psmt.setInt(2, id);
				psmt.executeUpdate();
				result = true;
			}
			else if(val==2) {
				//updatind phone
				String query = "update employee set empPhone=? where empId=?";
				PreparedStatement psmt = con.prepareStatement(query);
				psmt.setString(1, toUpdate);
				psmt.setInt(2, id);
				psmt.executeUpdate();
				result = true;
			}
			else if(val==3) {
				//update address
				String query = "update employee set empAddress=? where empId=?";
				PreparedStatement psmt = con.prepareStatement(query);
				psmt.setString(1, toUpdate);
				psmt.setInt(2, id);
				psmt.executeUpdate();
				result = true;
			}
			else if(val==4) {
				//updating salary
				String query = "update employee set empSalary=? where empId=?";
				PreparedStatement psmt = con.prepareStatement(query);
				psmt.setString(1, toUpdate);
				psmt.setInt(2, id);
				psmt.executeUpdate();
				result = true;
			}
			else {
				System.out.println("wrong option");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
