package LAB51;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateRange {
	private LocalDateTime startDate;

	private LocalDateTime endDate;

	public DateRange(LocalDateTime startDate, LocalDateTime endDate) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public boolean isInRange() {
		if (endDate.compareTo(startDate) > 30) {
			return true;
		}
		return false;
	}

	public static int getFirstDayOfMonth(LocalDateTime date) {
		return 1;
	}

	public static int getLastDayOfMonth(LocalDateTime date) {
		LocalDate lastDay = date.toLocalDate();
		return lastDay.lengthOfMonth();
	}

	@Override
	public String toString() {
		return "DateRange [startDate=" + startDate + ", endDate=" + endDate + "]";
	}

}
