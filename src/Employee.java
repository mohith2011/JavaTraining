//4) part1
public class Employee implements java.io.Serializable{ 
private String name;
private String id;
private int salary;
private String selected_scheme;
public Employee(String name,String id,int salary) {
	this.name=name;
	this.id=id;
	this.salary=salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getSelected_scheme() {
	return selected_scheme;
}
public void setSelected_scheme(String selected_scheme) {
	this.selected_scheme = selected_scheme;
}
}
