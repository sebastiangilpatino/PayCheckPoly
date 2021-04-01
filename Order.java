package LAB51;

import java.time.LocalDate;

public class Order {
	private int orderNo;
	private LocalDate orderDate;
	private double orderAmount;
	private Comissioned comissioned;

	public Order(int orderNo, LocalDate orderDate, double orderAmount) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

}
