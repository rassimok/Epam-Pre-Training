import java.util.ArrayList;

public class Ex3Task2 {

	public static void main(String[] args) {

		int n = (int) (Math.random() * 10);
		ArrayList<String> SmilesArray = new ArrayList<String>();
		SmilesArray.add("(^_^)");
		SmilesArray.add(";’-)))");
		SmilesArray.add("(_|_)");
		SmilesArray.add(":)");
		SmilesArray.add(":DDD");
		SmilesArray.add(":(");
		SmilesArray.add(";(");
		SmilesArray.add(";)");
		SmilesArray.add("(^o^)");
		SmilesArray.add("(*-*)");

		System.out.println(SmilesArray.get(n));

	}

}
