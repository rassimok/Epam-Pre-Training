package by.epam.pre.training.rassimok.tasks.task6.model.palindrome;

import by.epam.pre.training.rassimok.tasks.task6.exeptions.EmptyCollectionRassimokException;
import by.epam.pre.training.rassimok.tasks.task6.exeptions.MaxElementsCollectionRassimokException;
import by.epam.pre.training.rassimok.tasks.task6.model.collection.StackRassimok;

public class Palindrome {

	public static boolean isPalindrome(String string) {
		StackRassimok<Character> stackString = new StackRassimok<>();
		StringBuilder reverseString = new StringBuilder();
		try {
			for (int i = 0; i < string.length(); i++) {
				stackString.push(string.charAt(i));
			}
			while (!stackString.isEmpty()) {
				reverseString.append(stackString.pop());
			}
		} catch (MaxElementsCollectionRassimokException | EmptyCollectionRassimokException e) {
			e.printStackTrace();
		}
		return string.equals(reverseString.toString());

	}
}
