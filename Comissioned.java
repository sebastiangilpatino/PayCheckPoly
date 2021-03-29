package LAB51;

import java.util.ArrayList;
import java.util.List;

public class Comissioned extends Employee {

	private double comission;
	private double baseSalary;
	private List<Order> orders;

	public Comissioned(int empID, double baseSalary) {
		super(empID);
		orders = new ArrayList<Order>();
		this.comission = 0.07;
		this.baseSalary = baseSalary;
	}

	public void addOrder(Order order) {
		orders.add(order);
	}

	@Override
	public double calcGrossPay(DateRange date) {
		double grossPay = 0;
		for (int i = 0; i < orders.size(); i++) {
			grossPay += orders.get(i).getOrderAmount();
		}

		return baseSalary + (grossPay * comission); // 7 percent of the total of orderAmount.
	}
}
