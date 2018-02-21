package by.epam.pre.training.rassimok.task4.model;

public class HanoyTower {
	public static String countHanoyTowerDisplacement(int nomberOfRings, char start, char finish, char temp) {
		return countHanoyTowerDisplacement(nomberOfRings, start, finish, temp, new StringBuilder()).toString();
	}

	private static StringBuilder countHanoyTowerDisplacement(int nomberOfRings, char start, char finish, char temp,
			StringBuilder displacementHanoyTower) {
		if (nomberOfRings > 0) {
			countHanoyTowerDisplacement(nomberOfRings - 1, start, temp, finish, displacementHanoyTower);
			displacementHanoyTower.append(start + "-->" + finish + "\n");
			countHanoyTowerDisplacement(nomberOfRings - 1, temp, finish, start, displacementHanoyTower);
		}
		return displacementHanoyTower;
	}
}
