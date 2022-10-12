package employee;

import java.util.Scanner;

import employeedb.EmployeeDAO;
import employeedb.EmployeePojo;
import employeedb.EmployeeUser;

public class Main {
public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
		boolean outer = true;
		while(outer) {
		System.out.println("Employee Management ");
		System.out.println("Press 1. to Admin Login");
		System.out.println("Press 2 to Employee Login");
		int choice = scanner.nextInt();
		boolean loop = true;
		try {
		while(loop) {
			switch(choice) {
			case 1:
				System.out.println("Enter Your Name");
				String validationName = scanner.next();
				if(Validation.validation(validationName)) {
					System.out.println("PRESS 1 to ADD Employee");
					System.out.println("PRESS 2 to DELETE Employee");
					System.out.println("PRESS 3 to DISPLAY Employee");
					System.out.println("PRESS 4 to UPDATE Employee");
					System.out.println("PRESS 5 to EXIT App");
					int userChoice = scanner.nextInt();
					switch(userChoice) {
					case 1:
						System.out.println("Enter Name");
						String name = scanner.next();
						System.out.println("Enter User Phone: ");
						String phone = scanner.next();
						System.out.println("Enter User Address: ");
						String address = scanner.next();
						System.out.println("Enter the Salary");
						String salary = scanner.next();
						EmployeePojo employee = new EmployeePojo(name,phone,address,salary);
						boolean ans = EmployeeDAO.insertEmployee(employee);
						if(ans) {
							System.out.println("Employee record Inserted Successfully...");
							System.out.println("Employee Record:" + employee);
						}
						else {
							System.out.println("Some error Occured While Inserting...Please try Again!");
						}
						break;
					case 2:
						//delete
						System.out.println("Enter Employee ID To Delete: ");
						int userID = scanner.nextInt();
						boolean ans2 = EmployeeDAO.deleteEmployee(userID);
						if(ans2) {
							System.out.println("Employee Of ID " + userID + " Record Deleted... ");
						}else {
							System.out.println("Something Went Wrong.. Please try Again!");
						}
						break;
					case 3:
						EmployeeDAO.showAllEmployee();
						break;
					case 4:
						System.out.println("PRESS 1 to UPDATE name");
						System.out.println("PRESS 2 to UPDATE phone");
						System.out.println("PRESS 3 to UPDATE city");
						System.out.println("PRESS 4 to UPDATE Salary");
						int val = scanner.nextInt();
						if(val == 1) {
							//Update Name
							System.out.println("Enter name to UPDATE...");
							String name1 = scanner.next();
							System.out.println("Enter ID to identify Employee!");
							int id = scanner.nextInt();
							EmployeePojo empPojo = new EmployeePojo();
							empPojo.setEmpName(name1);
							boolean res = EmployeeDAO.updateEmployee(val, name1, id, empPojo);
							if(res) {
								System.out.println("Employee Name Updated Successfully...");
							}else {
								System.out.println("Something Went Wrong Please try Again!");
							}
						}
						else if(val == 2) {
							System.out.println("Enter phone to UPDATE...");
							String phone1 = scanner.next();
							System.out.println("Enter ID to identify Employee!");
							int id = scanner.nextInt();
							EmployeePojo empPojo = new EmployeePojo();
							empPojo.setEmpPhone(phone1);
							boolean res = EmployeeDAO.updateEmployee(val, phone1, id, empPojo);
							if(res) {
								System.out.println("Employee Name Updated Successfully...");
							}else {
								System.out.println("Something Went Wrong Please try Again!");
							}
						}
						else if(val == 3) {
							System.out.println("Enter address to UPDATE...");
							String address1 = scanner.next();
							System.out.println("Enter ID to identify Employee!");
							int id = scanner.nextInt();
							EmployeePojo empPojo = new EmployeePojo();
							empPojo.setAddress(address1);
							boolean res = EmployeeDAO.updateEmployee(val, address1, id, empPojo);
							if(res) {
								System.out.println("Employee Address Updated Successfully...");
							}else {
								System.out.println("Something Went Wrong Please try Again!");
							}
						}
						else if(val == 4) {
							System.out.println("Enter Salary to UPDATE...");
							String salary1 = scanner.next();
							System.out.println("Enter ID to identify Employee!");
							int id = scanner.nextInt();
							EmployeePojo empPojo = new EmployeePojo();
							empPojo.setSalary(salary1);
							boolean res = EmployeeDAO.updateEmployee(val, salary1, id, empPojo);
							if(res) {
								System.out.println("Employee salary Updated Successfully...");
							}else {
								System.out.println("Something Went Wrong Please try Again!");
							}
						}
						else {
							System.out.println("Hey You have not updated Anything... Please choose option Correctly!");
						}
						break;
					case 5:
						System.out.println("Thank You ");
						loop = false;
						break;
					}
				}
				else {
					System.out.println("You have entered wrong details");
				}
			case 2:
				boolean loop1 = true;
				try {
					while(loop1) {
				System.out.println("1.To View Your Details");
				System.out.println("2.Exit");
				int userChoic = scanner.nextInt();
				
					switch(userChoic) {
					case 1:
						EmployeeUser.showAllEmployee();
						break;
					case 2:
						loop1 = false;
						return;
					}
				}
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
				
		}
				}catch(Exception e) {
					System.out.println("You have entered wrong option");
				}
	}
	}
}
}
			
				
			
			


