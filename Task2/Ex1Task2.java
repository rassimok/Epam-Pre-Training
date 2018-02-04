
public class Ex1Task2 {

	public static int HEADTH_ON_200 = 201 * 3;
	public static int HEADTH_ON_300 = HEADTH_ON_200 + 100 * 2;
	public static int HEADTH_PER_YEAR_1_200 = 3;
	public static int HEADTH_PER_YEAR_200_300 = 2;
	public static int HEADTH_PER_YEAR_300_ = 1;
	public static int EYES_IN_ONE_HEAD = 2;

	public static int getNomberOfHeads(int age) {
		if (age >= 300) {
			return HEADTH_ON_300 + (age - 300);
		} else if (age >= 200) {
			return HEADTH_ON_200 + HEADTH_PER_YEAR_200_300 * (age - 200);
		} else {
			return (age + 1) * 3;
		}

	}

	public static int getNomberOfEyes(int age) {

		return EYES_IN_ONE_HEAD * getNomberOfHeads(age);
	}

}
