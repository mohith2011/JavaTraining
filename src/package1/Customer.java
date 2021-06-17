package package1;

public abstract class Customer {

	public String employee_type;
	
	public abstract void getRate();
	
	public String getEmployee_type() {
		return employee_type;
	}
	public void setEmployee_type(String employee_type) {
		this.employee_type = employee_type;
	}
}
