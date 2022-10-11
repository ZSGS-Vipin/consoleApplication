
public class EmployeePojo {
	private int empId;
	private String empName;
	private String empPhone;
	private String empAddress;
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
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public EmployeePojo(int empId, String empName, String empPhone, String empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPhone = empPhone;
		this.empAddress = empAddress;
	}
	public EmployeePojo(String empName, String empPhone, String empAddress) {
		super();
		this.empName = empName;
		this.empPhone = empPhone;
		this.empAddress = empAddress;
	}
	public EmployeePojo() {
		super();
	}
	@Override
	public String toString() {
		return "EmployeePojo [empId=" + empId + ", empName=" + empName + ", empPhone=" + empPhone + ", empAddress="
				+ empAddress + "]";
	}
}
