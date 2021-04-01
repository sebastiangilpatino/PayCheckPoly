package LAB51;

import java.time.LocalDate;

public class DateRange {
	private LocalDate startDate;

	private LocalDate endDate;

	public DateRange(LocalDate startDate, LocalDate endDate) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public boolean isInRange() {
		if (endDate.compareTo(startDate) > 30) {
			return true;
		}
		return false;
	}

	public static int getFirstDayOfMonth(LocalDate date) {
		return 1;
	}

	public static int getLastDayOfMonth(LocalDate date) {
		return date.lengthOfMonth();
	}

	@Override
	public String toString() {
		return "DateRange [startDate=" + startDate + ", endDate=" + endDate + "]";
	}

}
