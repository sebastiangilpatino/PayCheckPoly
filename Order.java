package LAB51;

import java.time.LocalDateTime;

public class Order {
	private int orderNo;
	private LocalDateTime orderDate;
	private double orderAmount;
	private Comissioned comissioned;

	public Order(int orderNo, LocalDateTime orderDate, double orderAmount) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

}
