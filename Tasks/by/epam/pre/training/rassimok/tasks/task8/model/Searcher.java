package by.epam.pre.training.rassimok.tasks.task8.model;

import by.epam.pre.training.rassimok.tasks.task6.exeptions.IndexOfBoundRassimokException;
import by.epam.pre.training.rassimok.tasks.task6.exeptions.RassimokCollectionException;
import by.epam.pre.training.rassimok.tasks.task6.model.collection.ArrayListRassimok;

public class Searcher<E extends Comparable<E>> {

	public int linearSearch(ArrayListRassimok<E> array, E element) {

		for (int i = 0; i < array.size(); i++) {
			try {
				if (array.get(i).compareTo(element) == 0) {
					return i;
				}
			} catch (IndexOfBoundRassimokException e) {
				e.printStackTrace();
			}
		}
		return -1;
	}

	public int binarySearch(ArrayListRassimok<E> array, E element) {
		return doBinarySearch(array, element, 0, array.size() - 1);
	}

	private int doBinarySearch(ArrayListRassimok<E> array, E element, int startIndex, int endIndex) {
		try {
			int mid = (startIndex + endIndex) / 2;
			if (endIndex > startIndex) {
				if (element.compareTo(array.get(mid)) == 0) {
					return mid;
				}
				if (element.compareTo(array.get(mid)) > 0) {
					return doBinarySearch(array, element, mid + 1, endIndex);
				} else {
					return doBinarySearch(array, element, 0, mid);
				}
			}

		} catch (RassimokCollectionException e) {
			e.printStackTrace();
		}
		return -1;
	}

	public int binarySearchIter(ArrayListRassimok<E> array, E element) {
		try {
			int startIndex = 0;
			int endIndex = array.size() - 1;
			while (startIndex < endIndex) {
				int mid = (startIndex + endIndex) / 2;
				if (element.compareTo(array.get(mid)) == 0) {
					return mid;
				}
				if (element.compareTo(array.get(mid)) > 0) {
					startIndex = mid + 1;
				} else {
					endIndex = mid;
				}
			}
		} catch (IndexOfBoundRassimokException e) {
			e.printStackTrace();
		}
		return -1;
	}
}
