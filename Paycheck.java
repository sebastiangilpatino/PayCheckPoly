package LAB51;

public final class Paycheck {
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	private DateRange payPeriod;
	private Employee emp;

	public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
		super();
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
	}

	public void print() {

		System.out.format("GROSS PAY: $%.2f" + " FICA: $%.2f" + " STATE: $%.2f" + " LOCAL: $%.2f" + " MEDICARE: $%.2f"
				+ " SOCIAL SECURITY: $%.2f\n\n", grossPay, fica, state, local, medicare, socialSecurity);

	}

	public double getNetPay() {
		return grossPay - fica - state - local - medicare - socialSecurity;
	}
}
