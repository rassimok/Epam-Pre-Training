import java.util.ArrayList;

public class Ex3Task2 {

	public static final ArrayList<String> SMILES_ARRAY = new ArrayList<String>();
	static {
		SMILES_ARRAY.add("(^_^)");
		SMILES_ARRAY.add(";’-)))");
		SMILES_ARRAY.add("(_|_)");
		SMILES_ARRAY.add(":)");
		SMILES_ARRAY.add(":DDD");
		SMILES_ARRAY.add(":(");
		SMILES_ARRAY.add(";(");
		SMILES_ARRAY.add(";)");
		SMILES_ARRAY.add("(^o^)");
		SMILES_ARRAY.add("(*-*)");
	}

	

	public static String getMood() {
		return SMILES_ARRAY.get((int) (Math.random() * 10));
	}

}
