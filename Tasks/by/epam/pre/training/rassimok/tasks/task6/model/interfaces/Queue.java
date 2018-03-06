package by.epam.pre.training.rassimok.tasks.task6.model.interfaces;

import by.epam.pre.training.rassimok.tasks.task6.exeptions.EmptyCollectionRassimokException;

public interface Queue<E> {

	public void enqueue(E e);

	public E dequeue() throws EmptyCollectionRassimokException;

	public E peek() throws EmptyCollectionRassimokException;

}
