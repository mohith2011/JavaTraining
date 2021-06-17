import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//4) END
public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee("Test", "123", 600000);
		Employee e2 = new Employee("Test2", "345", 700000);
		e1.setSelected_scheme("scheme1");
		e2.setSelected_scheme("scheme2");

		ArrayList<Employee> woi = new ArrayList<>();
		try {
			FileOutputStream fop = new FileOutputStream("LaptopScheme.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fop);
			woi.add(e1);
			woi.add(e2);
			oos.writeObject(woi);

		} catch (Exception e) {
		}
		try {
			FileInputStream fis = new FileInputStream("LaptopScheme.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee wo = null;
			Employee[] woj = new Employee[5];

			ArrayList<Employee> data = new ArrayList<>();
			data = (ArrayList<Employee>) ois.readObject();

			data.forEach(temp -> {
				System.out.println("Name :" + temp.getName());
				System.out.println("ID :" + temp.getId());
				System.out.println("Scheme :" + temp.getSelected_scheme());
			}
			);
		} catch (Exception e) {
		}
	}
}