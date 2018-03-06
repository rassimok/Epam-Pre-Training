package by.epam.pre.training.rassimok.tasks.task6.controller;

import by.epam.pre.training.rassimok.tasks.task6.exeptions.EmptyCollectionRassimokException;
import by.epam.pre.training.rassimok.tasks.task6.exeptions.IllegalArgumentExceptionRassimok;
import by.epam.pre.training.rassimok.tasks.task6.exeptions.MaxElementsCollectionRassimokException;
import by.epam.pre.training.rassimok.tasks.task6.model.collection.QueueRassimok;
import by.epam.pre.training.rassimok.tasks.task6.model.collection.StackRassimok;
import by.epam.pre.training.rassimok.tasks.task6.model.palindrome.Palindrome;
import by.epam.pre.training.rassimok.tasks.view.View;

public class Task6 {

	public static void main(String[] args) throws MaxElementsCollectionRassimokException, IllegalArgumentExceptionRassimok, EmptyCollectionRassimokException {
		
		StackRassimok<Integer> stack = new StackRassimok<>();
		
		stack.push(5);
		stack.push(3);
		stack.push(2);
		stack.push(5);
		stack.push(6);
		View.println("Check Stack Working");
		View.println(stack);
		try {
			View.println(stack.pop());
			View.println(stack.peek());
			View.println(stack.peek());
		} catch (EmptyCollectionRassimokException e) {
			e.printStackTrace();
		}
		View.println("Check Queue Working");
		QueueRassimok<Integer> queue =new QueueRassimok<>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		View.println(queue);
		View.println(queue.dequeue());
		View.println(queue.peek());
		View.println(queue.peek());
		View.println(queue);
		
		View.println("Check Palindrome Working");
		View.println(Palindrome.isPalindrome("654684"));
		
		
		
	}

}
