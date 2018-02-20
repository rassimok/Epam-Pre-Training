package by.epam.pre.training.rassimok.task4.controller;

import by.epam.pre.training.rassimok.task3.view.View;
import by.epam.pre.training.rassimok.task4.model.Fibonacci;
import by.epam.pre.training.rassimok.task4.model.HanoyTower;
import by.epam.pre.training.rassimok.task4.model.MyNumber;
import by.epam.pre.training.rassimok.task4.model.Pow;

public class Task4Main {

	public static void main(String[] args) {

		View.println("---Number.countSumDigitsIter(1234)");
		View.println(MyNumber.countSumDigitsIter(1234));
		View.println("---Number.countSumDigitsRecur(1234)");
		View.println(MyNumber.countSumDigitsRecur(1234));

		int x = 5;
		int n = 5;
		View.println("---Pow.countPowIter(x, n)");
		View.println(Pow.countPowIter(x, n));
		View.println("---Pow.countPowRecur(x, n)");
		View.println(Pow.countPowRecur(x, n));
		View.println("---Math.pow(x, n)");
		View.println(Math.pow(x, n));

		View.println("---Fibonacci.countFibonacciByNRecur(25)");
		View.println(Fibonacci.countFibonacciByNRecur(25));
		View.println("---Fibonacci.countFibonacciByNIter(25)");
		View.println(Fibonacci.countFibonacciByNIter(25));

		View.println("---Number.checkSumDigitsNEqualsNomberSIter(1234,10)");
		View.println(MyNumber.checkSumDigitsNEqualsNomberSIter(1234, 10));
		View.println("---Number.checkSumDigitsNEqualsNomberSRecur(1234,10)");
		View.println(MyNumber.checkSumDigitsNEqualsNomberSRecur(10000, 1));

		View.println("---Hanoy");
		View.println(HanoyTower.countHanoyTowerDisplacement(3, 'A', 'B', 'C'));

	}

}
