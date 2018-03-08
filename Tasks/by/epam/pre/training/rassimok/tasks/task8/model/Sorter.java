package by.epam.pre.training.rassimok.tasks.task8.model;

import by.epam.pre.training.rassimok.tasks.task6.exeptions.IndexOfBoundRassimokException;
import by.epam.pre.training.rassimok.tasks.task6.exeptions.RassimokCollectionException;
import by.epam.pre.training.rassimok.tasks.task6.model.collection.ArrayListRassimok;

public class Sorter<E extends Comparable<E>> {

	public void bubbleSort(ArrayListRassimok<E> array) {
		if (array.size() > 1) {
			try {
				for (int i = 0; i < array.size(); i++) {
					for (int j = 0; j < array.size() - i - 1; j++) {
						if (array.get(j).compareTo(array.get(j + 1)) > 0) {
							E tmp = array.get(j);
							array.set(j, array.get(j + 1));
							array.set(j + 1, tmp);
						}

					}
				}
			} catch (IndexOfBoundRassimokException e) {
				e.printStackTrace();
			}
		}
	}

	public void insertionSort(ArrayListRassimok<E> array) {
		if (array.size() > 1) {
			try {
				for (int i = 0; i < array.size(); i++) {
					for (int j = i; j > 0; j--) {
						if (array.get(j).compareTo(array.get(j - 1)) < 0) {
							E tmp = array.get(j);
							array.set(j, array.get(j - 1));
							array.set(j - 1, tmp);
						}
					}
				}

			} catch (IndexOfBoundRassimokException e) {
				e.printStackTrace();
			}
		}
	}

	public void selectionSort(ArrayListRassimok<E> array) {
		if (array.size() > 1) {
			try {
				for (int i = 0; i < array.size(); i++) {
					int indexMin = i;
					for (int j = i + 1; j < array.size(); j++) {
						if (array.get(j).compareTo(array.get(indexMin)) < 0) {
							indexMin = j;
						}
					}
					E tmp = array.get(indexMin);
					array.set(indexMin, array.get(i));
					array.set(i, tmp);
				}
			} catch (IndexOfBoundRassimokException e) {
				e.printStackTrace();
			}
		}
	}

	public void mergeSort(ArrayListRassimok<E> array) {
		if (array.size() > 1) {
			try {
				ArrayListRassimok<E> left = new ArrayListRassimok<E>();
				ArrayListRassimok<E> right = new ArrayListRassimok<E>();

				int middle = array.size() / 2;
				for (int i = 0; i < middle; i++) {
					left.add(array.get(i));
				}
				for (int i = middle; i < array.size(); i++) {
					right.add(array.get(i));
				}
				mergeSort(left);
				mergeSort(right);
				merge(left, right, array);

			} catch (RassimokCollectionException e) {
				e.printStackTrace();
			}
		}
	}

	private void merge(ArrayListRassimok<E> left, ArrayListRassimok<E> right, ArrayListRassimok<E> array) {
		try {
			int leftIndex = 0;
			int rightIndex = 0;
			int index = 0;
			while (leftIndex < left.size() && rightIndex < right.size()) {
				if ((left.get(leftIndex).compareTo(right.get(rightIndex))) < 0) {
					array.set(index, left.get(leftIndex));
					leftIndex++;
				} else {
					array.set(index, right.get(rightIndex));
					rightIndex++;
				}
				index++;
			}
			ArrayListRassimok<E> tmpList;
			int rIndex;
			if (leftIndex >= left.size()) {
				tmpList = right;
				rIndex = rightIndex;
			} else {
				tmpList = left;
				rIndex = leftIndex;
			}
			for (int i = rIndex; i < tmpList.size(); i++) {
				array.set(index, tmpList.get(i));
				index++;
			}
		} catch (RassimokCollectionException e) {
			e.printStackTrace();
		}
	}

	public void quickSort(ArrayListRassimok<E> array) {
		int startIndex = 0;
		int endIndex = array.size() - 1;
		doQuickSort(array, startIndex, endIndex);
	}

	private void doQuickSort(ArrayListRassimok<E> array, int startIndex, int endIndex) {
		if (endIndex > startIndex) {
			try {
				int i = startIndex, j = endIndex;
				int cur = i - (i - j) / 2;
				while (i < j) {
					while (i < cur && (array.get(i).compareTo(array.get(cur))) <= 0) {
						i++;
					}
					while (j > cur && (array.get(cur).compareTo(array.get(j)) <= 0)) {
						j--;
					}
					if (i < j) {
						E temp = array.get(i);
						array.set(i, array.get(j));
						array.set(j, temp);
						if (i == cur)
							cur = j;
						else if (j == cur)
							cur = i;
					}
				}
				doQuickSort(array, startIndex, cur);
				doQuickSort(array, cur + 1, endIndex);
			} catch (RassimokCollectionException e) {
				e.printStackTrace();
			}
		}
	}
}
