import java.util.ArrayList;

public class Ex3Task2 {

	public static final ArrayList<String> smilesArray = new ArrayList<String>();
	static {
		smilesArray.add("(^_^)");
		smilesArray.add(";’-)))");
		smilesArray.add("(_|_)");
		smilesArray.add(":)");
		smilesArray.add(":DDD");
		smilesArray.add(":(");
		smilesArray.add(";(");
		smilesArray.add(";)");
		smilesArray.add("(^o^)");
		smilesArray.add("(*-*)");
	}

	

	public static String getMood() {
		return smilesArray.get((int) (Math.random() * 10));
	}

}
