package by.epam.pre.training.rassimok.tasks.task7.model;

import by.epam.pre.training.rassimok.tasks.task6.exeptions.EmptyCollectionRassimokException;
import by.epam.pre.training.rassimok.tasks.task6.exeptions.MaxElementsCollectionRassimokException;
import by.epam.pre.training.rassimok.tasks.task6.model.collection.ArrayListRassimok;

public class TreeRassimok<T extends Comparable<T>> {

	private Node<T> root;
	private int size = 0;

	public void add(T element) {
		root = addRecursive(root, element);
		size++;
	}

	@SuppressWarnings("unchecked")
	private Node<T> addRecursive(Node<T> current, T element) {
		if (current == null) {
			return new Node<T>(element);
		}
		if (element.compareTo((T) current.element) < 0) {
			current.left = addRecursive(current.left, element);
		} else if (element.compareTo((T) current.element) > 0) {
			current.right = addRecursive(current.right, element);
		}
		return current;
	}

	public boolean contains(T element) throws EmptyCollectionRassimokException {
		if (isEmpty()) {
			throw new EmptyCollectionRassimokException("contains in TreeRassimok");
		}
		return containsRecur(root, element);
	}

	@SuppressWarnings("unchecked")
	private boolean containsRecur(Node<T> current, T element) {
		if (current == null) {
			return false;
		}
		if (element.compareTo((T) current.element) == 0) {
			return true;
		}
		return (element.compareTo((T) current.element) < 0) ? containsRecur(current.left, element)
				: containsRecur(current.right, element);
	}

	public void remove(T element) throws EmptyCollectionRassimokException {
		if (isEmpty()) {
			throw new EmptyCollectionRassimokException("remove in TreeRassimok");
		}
		removeRecur(root, element);
		size--;
	}

	@SuppressWarnings("unchecked")
	private Node<T> removeRecur(Node<T> current, T element) {
		if (current == null) {
			return null;
		}

		if (element.compareTo(current.element) == 0) {
			if (current.left == null && current.right == null) {
				return null;
			}

			if (current.right == null) {
				return current.left;
			}

			if (current.left == null) {
				return current.right;
			}

			T minElement = (T) findMinElement(current.right);
			current.element = minElement;
			current.right = removeRecur(current.right, minElement);
			return current;
		}
		if (element.compareTo(current.element) < 0) {
			current.left = removeRecur(current.left, element);
			return current;
		}

		current.right = removeRecur(current.right, element);
		return current;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private T findMinElement(Node root) {
		return root.left == null ? (T) root.element : findMinElement(root.left);
	}

	public void clear() {
		root = null;
		size = 0;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public int size() {
		return size;
	}

	public ArrayListRassimok<T> inOrderRound() {
		return inOrderRoundRecur(root, new ArrayListRassimok<T>());
	}

	public ArrayListRassimok<T> preOrderRound() {
		return preOrderRoundRecur(root, new ArrayListRassimok<T>());
	}

	public ArrayListRassimok<T> postOrderRound() {
		return postOrderRoundRecur(root, new ArrayListRassimok<T>());
	}

	@SuppressWarnings("unchecked")
	private ArrayListRassimok<T> inOrderRoundRecur(Node<T> current, ArrayListRassimok<T> round) {

		try {
			if (current != null) {
				inOrderRoundRecur(current.left, round);

				round.add(current.element);

				inOrderRoundRecur(current.right, round);
			}
		} catch (MaxElementsCollectionRassimokException e) {
			e.printStackTrace();
		}
		return round;

	}

	@SuppressWarnings("unchecked")
	private ArrayListRassimok<T> preOrderRoundRecur(Node<T> current, ArrayListRassimok<T> round) {
		try {
			if (current != null) {

				round.add(current.element);
				inOrderRoundRecur(current.left, round);
				inOrderRoundRecur(current.right, round);
			}
		} catch (MaxElementsCollectionRassimokException e) {
			e.printStackTrace();
		}
		return round;
	}

	@SuppressWarnings("unchecked")
	private ArrayListRassimok<T> postOrderRoundRecur(Node<T> current, ArrayListRassimok<T> round) {
		try {
			if (current != null) {
				inOrderRoundRecur(current.left, round);
				inOrderRoundRecur(current.right, round);
				round.add(current.element);

			}
		} catch (MaxElementsCollectionRassimokException e) {
			e.printStackTrace();
		}
		return round;
	}

	@Override
	public String toString() {
		return inOrderRound().toString();
	}

	// ------------------------------------------------------------------------------------------
	@SuppressWarnings({ "rawtypes", "hiding" })
	class Node<T extends Comparable> implements Comparable<T> {
		Node left;
		Node right;
		T element;

		Node(T object) {
			this.element = object;
		}

		@SuppressWarnings("unchecked")
		@Override
		public int compareTo(T object) {
			return element.compareTo(object);
		}

		@Override
		public String toString() {
			return element.toString();
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + ((element == null) ? 0 : element.hashCode());
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
			@SuppressWarnings("unchecked")
			Node<T> other = (Node<T>) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (element == null) {
				if (other.element != null)
					return false;
			} else if (!element.equals(other.element))
				return false;
			return true;
		}

		private TreeRassimok getOuterType() {
			return TreeRassimok.this;
		}

	}
}
