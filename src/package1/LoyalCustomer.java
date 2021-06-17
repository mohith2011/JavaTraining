package package1;

public class LoyalCustomer extends Customer{

	public int loyal_or_not;
	public int getLoyal_or_not() {
		return loyal_or_not;
	}
	public void setLoyal_or_not(int loyal_or_not) {
		this.loyal_or_not = loyal_or_not;
	}
	@Override
	public void getRate() {
		int discount=0;
		int rate=100000;
		if(employee_type=="govt_emp") {
			discount=12;
		}else if(employee_type=="copt_emp") {
			discount=8;
		}else if(employee_type=="bussiness") {
			discount=6;
		}
		
		if(this.loyal_or_not==1) {
			discount=discount+5;
		}
		System.out.println("Total Discount percentage :"+discount);
		System.out.println("Total Rate :"+rate);
		System.out.println("Total discount obtained :"+rate*(discount/100));
	}

}
