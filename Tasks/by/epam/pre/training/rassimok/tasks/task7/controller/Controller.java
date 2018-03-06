package by.epam.pre.training.rassimok.tasks.task7.controller;

import by.epam.pre.training.rassimok.tasks.task6.exeptions.EmptyCollectionRassimokException;
import by.epam.pre.training.rassimok.tasks.task7.model.TreeRassimok;
import by.epam.pre.training.rassimok.tasks.view.View;

public class Controller {

	public static void main(String[] args) throws EmptyCollectionRassimokException {

		
		TreeRassimok<Integer> tree=new TreeRassimok<>();
		
		tree.add(10);
		tree.add(4);
		tree.add(6);
		tree.add(2);
		tree.add(12);
		tree.add(34);
		tree.add(11);
		tree.add(5);
		tree.add(111);
		View.println(tree.size());
		View.println(tree.contains(10));
		View.println(tree.contains(12));
		View.println(tree.contains(111));
		View.println(tree.contains(34));
		View.println(tree.contains(0));
		View.println(tree.contains(222));
		View.println(tree);
		View.println(tree.size());
		tree.remove(5);
		View.println(tree);
		View.println(tree.size());
		
		View.println("------------inOrder-------------");
		View.println(tree.inOrderRound());
		View.println("------------preOrder-------------");
		View.println(tree.preOrderRound());
		View.println("------------postOrder-------------");
		View.println(tree.postOrderRound());
	}

}
