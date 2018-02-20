package by.epam.pre.training.rassimok.task4.model;

public class HanoyTower {
	private static StringBuilder displacementHanoyTower = new StringBuilder();

	public static StringBuilder countHanoyTowerDisplacement(int nomberOfRings, char start, char finish, char temp) {
		if (nomberOfRings > 0) {
			countHanoyTowerDisplacement(nomberOfRings - 1, start, temp, finish);
			displacementHanoyTower.append(start + "-->" + finish + "\n");
			countHanoyTowerDisplacement(nomberOfRings - 1, temp, finish, start);
		}
		return displacementHanoyTower;
	}

}
