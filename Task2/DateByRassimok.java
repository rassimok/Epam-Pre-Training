
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
		int nomberOfDaysInThisMounth;
		switch (month) {
		case 1:
			nomberOfDaysInThisMounth = 31;
			break;
		case 2:
			if (year % 4 == 0) {
				nomberOfDaysInThisMounth = 29;
				break;
			} else {
				nomberOfDaysInThisMounth = 28;
				break;
			}
		case 3:
			nomberOfDaysInThisMounth = 31;
			break;
		case 4:
			nomberOfDaysInThisMounth = 30;
			break;
		case 5:
			nomberOfDaysInThisMounth = 31;
			break;
		case 6:
			nomberOfDaysInThisMounth = 30;
			break;
		case 7:
			nomberOfDaysInThisMounth = 31;
			break;
		case 8:
			nomberOfDaysInThisMounth = 31;
			break;
		case 9:
			nomberOfDaysInThisMounth = 30;
			break;
		case 10:
			nomberOfDaysInThisMounth = 31;
			break;
		case 11:
			nomberOfDaysInThisMounth = 30;
			break;
		case 12:
			nomberOfDaysInThisMounth = 31;
			break;
		default:
			nomberOfDaysInThisMounth = 0;
			break;
		}

		return nomberOfDaysInThisMounth;
	}

	public static DateByRassimok getNextDayDate(int day, int month, int year) {
		DateByRassimok nextDayDate;
		if (day < getNomberOfDaysInThisMounth(month, year)) {
			nextDayDate = new DateByRassimok(day + 1, month, year);
		} else if (month < 12) {
			nextDayDate = new DateByRassimok(1, month + 1, year);
		} else {
			nextDayDate = new DateByRassimok(1, 1, year + 1);
		}
		return nextDayDate;
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
