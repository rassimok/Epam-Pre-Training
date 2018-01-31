
public class Ex4Task2 {

	public static void main(String[] args) {

		int day = 31;
		int month = 12;
		int year = 2016;

		if (day < getNomberOfDaysInThisMounth(month, year)) {
			System.out.println("tomorrow date is: " + (day + 1) + "." + month + "." + year);
		} else if (month < 12) {
			System.out.println("tomorrow date is: " + 1 + "." + (month + 1) + "." + year);
		} else {
			System.out.println("tomorrow date is: " + 1 + "." + 1 + "." + (year + 1));
		}

	}

	public static int getNomberOfDaysInThisMounth(int month, int year) {
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
}
