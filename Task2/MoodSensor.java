
public class MoodSensor {

	public static String getMood() {
		String mood;
		switch ((int) (Math.random() * 10)) {
		case 0:
			mood = "(^_^)";
			break;
		case 1:
			mood = ";’-)))";
			break;
		case 2:
			mood = "(_|_)";
			break;
		case 3:
			mood = ":)";
			break;
		case 4:
			mood = ":DDD";
			break;
		case 5:
			mood = ":(";
			break;
		case 6:
			mood = ";(";
			break;
		case 7:
			mood = ";)";
			break;
		case 8:
			mood = "(^o^)";
			break;
		case 9:
			mood = "(^o^)";
			break;
		case 10:
			mood = "(*-*)";
			break;
		default:
			mood = "!!!!!!!!!!!!";
			break;
		}

		return mood;
	}

}
