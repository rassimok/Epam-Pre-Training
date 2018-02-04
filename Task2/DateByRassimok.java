
public class DateByRassimok {
	private int day;
	private int mounth;
	private int year;

	public DateByRassimok() {

	}

	public DateByRassimok(int day, int month, int year) {
		this.setDay(day);
		this.setMounth(month);
		this.setYear(year);
	}

	private static int getNomberOfDaysInThisMounth(int month, int year) {
		switch (month) {
		case 1:
			return 31;
		case 2:
			if (year % 4 == 0) {
				return 29;
			} else {
				return 28;
			}
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;
		default:
			return 0;
		}

	}

	public static DateByRassimok getNextDayDate(int day, int month, int year) {
		if (day < getNomberOfDaysInThisMounth(month, year)) {
			return new DateByRassimok(day + 1, month, year);
		} else if (month < 12) {
			return new DateByRassimok(1, month + 1, year);
		} else {
			return new DateByRassimok(1, 1, year + 1);
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMounth() {
		return mounth;
	}

	public void setMounth(int mounth) {
		this.mounth = mounth;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "DateByRassimok [day=" + day + ", mounth=" + mounth + ", year=" + year + "]";
	}
}
