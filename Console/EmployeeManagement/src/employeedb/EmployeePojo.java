package employeedb;

public class EmployeePojo {
	private int empId;
	private String empName;
	private String empPhone;
	private String address;
	private String salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public EmployeePojo(int empId, String empName, String empPhone, String address, String salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPhone = empPhone;
		this.address = address;
		this.salary = salary;
	}
	public EmployeePojo(String empName, String empPhone, String address,String salary) {
		super();
		this.empName = empName;
		this.empPhone = empPhone;
		this.address = address;
		this.salary = salary;
	}
	public EmployeePojo() {
		super();
	}
	@Override
	public String toString() {
		return "EmployeePojo [empId=" + empId + ", empName=" + empName + ", empPhone=" + empPhone + ", address="
				+ address + ", salary=" + salary + "]";
	}
	

}
