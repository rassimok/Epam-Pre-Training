package by.epam.pre.training.rassimok.tasks.task6.model.interfaces;

import by.epam.pre.training.rassimok.tasks.task6.exeptions.IndexOfBoundRassimokException;
import by.epam.pre.training.rassimok.tasks.task6.exeptions.MaxElementsCollectionRassimokException;

public interface ListRassimok<E> {

	public void add(E e) throws MaxElementsCollectionRassimokException;

	public void remove(E e);

	public void remove(int index) throws IndexOfBoundRassimokException;
	
	public E get(int index) throws IndexOfBoundRassimokException;
}
