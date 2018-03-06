package by.epam.pre.training.rassimok.tasks.task6.model.collection;

import by.epam.pre.training.rassimok.tasks.task6.exeptions.EmptyCollectionRassimokException;
import by.epam.pre.training.rassimok.tasks.task6.exeptions.IndexOfBoundRassimokException;
import by.epam.pre.training.rassimok.tasks.task6.exeptions.MaxElementsCollectionRassimokException;
import by.epam.pre.training.rassimok.tasks.task6.model.interfaces.CollectionRassimok;
import by.epam.pre.training.rassimok.tasks.task6.model.interfaces.Stack;

public class StackRassimok<E> implements Stack<E>, CollectionRassimok<E> {

	private ArrayListRassimok<E> array = new ArrayListRassimok<>();

	@SuppressWarnings("unchecked")
	@Override
	public void push(Object e) throws MaxElementsCollectionRassimokException {
		array.add((E) e);

	}

	@Override
	public E pop() throws EmptyCollectionRassimokException {
		if (size() == 0) {
			throw new EmptyCollectionRassimokException("pop in StackRassimok");
		}
		try {
			E pop = array.get(size() - 1);
			array.remove(size() - 1);
			return pop;
		} catch (IndexOfBoundRassimokException e) {
			throw new EmptyCollectionRassimokException("pop in StackRassimok");
		}
	}

	@Override
	public E peek() throws EmptyCollectionRassimokException {
		try {
			return array.get(size() - 1);
		} catch (IndexOfBoundRassimokException e) {
			throw new EmptyCollectionRassimokException("peek in StackRassimok");
		}
	}

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
	public String toString() {
		return array.toString();
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
		StackRassimok<?> other = (StackRassimok<?>) obj;
		if (array == null) {
			if (other.array != null)
				return false;
		} else if (!array.equals(other.array))
			return false;
		return true;
	}

}
