package by.epam.pre.training.rassimok.tasks.task6.model.collection;

import java.util.Arrays;

import by.epam.pre.training.rassimok.tasks.task6.exeptions.IllegalArgumentExceptionRassimok;
import by.epam.pre.training.rassimok.tasks.task6.exeptions.IndexOfBoundRassimokException;
import by.epam.pre.training.rassimok.tasks.task6.exeptions.MaxElementsCollectionRassimokException;
import by.epam.pre.training.rassimok.tasks.task6.model.interfaces.ListRassimok;

public class ArrayListRassimok<E> extends AbstractCollectionRassimok<E> implements ListRassimok<E> {
	@SuppressWarnings("unchecked")
	private E[] elementData = (E[]) new Object[DEFAULT_CAPACITY];
	private static final int DEFAULT_CAPACITY = 10;
	private int size = 0;
	private int amountElements = DEFAULT_CAPACITY;

	public ArrayListRassimok() {
	}

	@SuppressWarnings("unchecked")
	public ArrayListRassimok(int initialCapacity) throws IllegalArgumentExceptionRassimok {
		if (initialCapacity >= DEFAULT_CAPACITY) {
			this.elementData = (E[]) new Object[initialCapacity];
		} else if (initialCapacity < DEFAULT_CAPACITY) {
			this.elementData = (E[]) new Object[DEFAULT_CAPACITY];
		} else {
			throw new IllegalArgumentExceptionRassimok("Illegal Capacity: " + initialCapacity);
		}
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isFull() {
		return size == amountElements;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void clear() {
		if (size != 0) {
			this.elementData = (E[]) new Object[DEFAULT_CAPACITY];
		}
	}

	@Override
	public void add(E e) throws MaxElementsCollectionRassimokException {

		if (isFull()) {
			amountElements += amountElements / 2;
			if (amountElements < 0) {
				throw new MaxElementsCollectionRassimokException();
			}
			elementData = Arrays.copyOf(elementData, amountElements);
		}
		this.elementData[size++] = e;
	}

	@Override
	public void remove(E e) {
		for (int i = 0; i < size; i++) {
			if (elementData[i].equals(e)) {
				for (int j = i; j < size; j++) {
					elementData[j] = elementData[j + 1];
				}
				elementData[--size] = null;
				break;
			}

		}
	}

	@Override
	public void remove(int index) throws IndexOfBoundRassimokException {
		if(index<0||index>size) {
			throw new IndexOfBoundRassimokException();
		}
		for (int i = index; i < size; i++) {
			elementData[i] = elementData[i + 1];
		}
		elementData[--size] = null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		for (Object element : elementData) {
			result += result * prime + element.hashCode();
		}
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
		ArrayListRassimok<?> other = (ArrayListRassimok<?>) obj;
		if (!Arrays.equals(elementData, other.elementData))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		for (int i = 0; i < size - 1; i++) {
			sb.append(elementData[i].toString()).append(", ");
		}
		sb.append(elementData[size - 1]);
		return sb.append(']').toString();
	}

	@Override
	public E get(int index) throws IndexOfBoundRassimokException {
		if (index >= 0 && index < size) {
			return elementData[index];
		} else {
			throw new IndexOfBoundRassimokException();
		}
	}

}
