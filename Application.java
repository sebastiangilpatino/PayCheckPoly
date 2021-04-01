package LAB51;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		final int year = 2020;
		LocalDate orderDate = LocalDate.now();

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Hourly(1, 12, 40));
		employees.add(new Salaried(2, 80000));
		employees.add(new Comissioned(3, 60000));

		((Comissioned) employees.get(2)).addOrder(new Order(1, orderDate, 3000));
		((Comissioned) employees.get(2)).addOrder(new Order(2, orderDate, 6000));
		((Comissioned) employees.get(2)).addOrder(new Order(3, orderDate, 8000));

		for (int i = 0; i < employees.size(); i++) {
			for (int month = 1; month < 13; month++) {
				employees.get(i).addPaychecks(employees.get(i).calcCompensation(month, year));
			}

		}

		for (int i = 0; i < employees.size(); i++) {
			employees.get(i).print();
		}
	}

}
