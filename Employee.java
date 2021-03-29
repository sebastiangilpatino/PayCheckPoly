package LAB51;

import java.time.LocalDate;
import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
	private int empID;
	private List<Paycheck> paychecks;
	public final double fica = 0.23, state = 0.05, local = 0.01, medicare = 0.03, social = 0.075;

	public abstract double calcGrossPay(DateRange date);

	public Employee(int empID) {
		this.empID = empID;
		paychecks = new ArrayList<Paycheck>();
	}

	public void addPaychecks(Paycheck paycheck) {
		paychecks.add(paycheck);
	}

	public void print() {
		System.out.println("ID: " + empID);
		for (int i = 0; i < paychecks.size(); i++) {
			paychecks.get(i).print();
		}
	}

	public Paycheck calcCompensation(int month, int year) {
		final int hourMinute = 00;
		LocalDateTime startDate = LocalDateTime.of(year, month, 1, hourMinute, hourMinute);
		LocalDate lastDay = startDate.toLocalDate();
		LocalDateTime endDate = LocalDateTime.of(year, month, lastDay.lengthOfMonth(), hourMinute, hourMinute);
		double grossPay = calcGrossPay(new DateRange(startDate, endDate));
		Paycheck payment = new Paycheck(grossPay, grossPay * fica, grossPay * state, grossPay * local,
				grossPay * medicare, grossPay * social);

		return payment;
	}

}
