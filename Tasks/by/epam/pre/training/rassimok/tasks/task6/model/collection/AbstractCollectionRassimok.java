package by.epam.pre.training.rassimok.tasks.task6.model.collection;

import by.epam.pre.training.rassimok.tasks.task6.model.interfaces.CollectionRassimok;

public abstract class AbstractCollectionRassimok<E> implements CollectionRassimok<E> {

	public boolean isEmpty() {
		return size() == 0;
	}
}
