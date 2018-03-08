package by.epam.pre.training.rassimok.tasks.task8.controller;

import by.epam.pre.training.rassimok.tasks.task6.exeptions.RassimokCollectionException;
import by.epam.pre.training.rassimok.tasks.task6.model.collection.ArrayListRassimok;
import by.epam.pre.training.rassimok.tasks.task8.model.Searcher;
import by.epam.pre.training.rassimok.tasks.task8.model.Sorter;
import by.epam.pre.training.rassimok.tasks.view.View;

public class Task8 {

	public static void main(String[] args) throws RassimokCollectionException {

		ArrayListRassimok<Integer> array = new ArrayListRassimok<>();
		array.add(2);
		array.add(9);
		array.add(33);
		array.add(44);
		array.add(1);
		array.add(75);
		array.add(3);
		array.add(25);
		array.add(23);
		array.add(23);
		Sorter<Integer> sorter = new Sorter<>();
		sorter.quickSort(array);
		View.println(array);
		Searcher<Integer> search = new Searcher<>();
		View.println(search.linearSearch(array, 33));
		View.println(search.binarySearch(array, 33));
		View.println(search.binarySearchIter(array, 33));

	}

}
