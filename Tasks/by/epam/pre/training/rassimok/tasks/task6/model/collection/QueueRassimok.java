package by.epam.pre.training.rassimok.tasks.task6.model.collection;

import by.epam.pre.training.rassimok.tasks.task6.exeptions.EmptyCollectionRassimokException;
import by.epam.pre.training.rassimok.tasks.task6.exeptions.IndexOfBoundRassimokException;
import by.epam.pre.training.rassimok.tasks.task6.exeptions.MaxElementsCollectionRassimokException;
import by.epam.pre.training.rassimok.tasks.task6.model.interfaces.CollectionRassimok;
import by.epam.pre.training.rassimok.tasks.task6.model.interfaces.Queue;

public class QueueRassimok<E> implements Queue<E>,CollectionRassimok<E>{

	private ArrayListRassimok<E> array = new ArrayListRassimok<>();
	
	
	
	@Override
	public int size() {
		return array.size();
	}

	@Override
	public boolean isEmpty() {
		return array.isEmpty();
	}

	@Override
	public boolean isFull() {
		return array.isFull();
	}

	@Override
	public void clear() {
		array.clear();

	}


	@Override
	public void enqueue(E e) {
		try {
			array.add(e);
		} catch (MaxElementsCollectionRassimokException e1) {
			e1.printStackTrace();
		}
		
	}

	@Override
	public E dequeue() throws EmptyCollectionRassimokException {
		try {
			E dequeue = array.get(0);
			array.remove(0);
			return dequeue;
		} catch (IndexOfBoundRassimokException e) {
			throw new EmptyCollectionRassimokException("dequeue in QueueRassimok");
		}
		
		
	}

	@Override
	public E peek() throws EmptyCollectionRassimokException {
		try {
			return array.get(0);
		} catch (IndexOfBoundRassimokException e) {
			throw new EmptyCollectionRassimokException("peek in QueueRassimok");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((array == null) ? 0 : array.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QueueRassimok<?> other = (QueueRassimok<?>) obj;
		if (array == null) {
			if (other.array != null)
				return false;
		} else if (!array.equals(other.array))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return array.toString();
	}

	
}
