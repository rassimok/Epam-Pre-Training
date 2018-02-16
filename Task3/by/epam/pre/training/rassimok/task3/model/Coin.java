package by.epam.pre.training.rassimok.task3.model;

import java.util.Random;

public class Coin {

	public static int countHeadsResults(int numberOfTosses) {
		Random rand = new Random();
		int count = 0;
		for (int i = 0; i < numberOfTosses; i++) {
			if (rand.nextBoolean()) {
				count++;
			}
		}
		return count;
	}

}
