package by.epam.pre.training.rassimok.tasks.task6.model.interfaces;

import by.epam.pre.training.rassimok.tasks.task6.exeptions.EmptyCollectionRassimokException;
import by.epam.pre.training.rassimok.tasks.task6.exeptions.MaxElementsCollectionRassimokException;

public interface Stack<E> {

	public void push(E e) throws MaxElementsCollectionRassimokException;

	public E pop() throws EmptyCollectionRassimokException;

	public E peek() throws EmptyCollectionRassimokException;

}
