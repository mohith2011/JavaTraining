package package2;

import package1.LoyalCustomer;

public class Main {

	public static void main(String[] args) {
		LoyalCustomer lc=new LoyalCustomer();
		lc.setEmployee_type("govt_emp");
		lc.loyal_or_not=1;
		lc.getRate();
	}

}
