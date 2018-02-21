package by.epam.pre.training.rassimok.task4.controller;

import by.epam.pre.training.rassimok.task3.view.View;
import by.epam.pre.training.rassimok.task4.model.HanoyTower;
import by.epam.pre.training.rassimok.task4.model.RassimokMath;

public class Task4Main {

	public static void main(String[] args) {

		View.println("---RassimokMath.countSumDigitsIter(1234)");
		View.println(RassimokMath.countSumDigitsIter(1234));
		View.println("---RassimokMath.countSumDigitsRecur(1234)");
		View.println(RassimokMath.countSumDigitsRecur(1234));

		int x = 5;
		int n = 5;
		View.println("---RassimokMath.countPowIter(x, n)");
		View.println(RassimokMath.countPowIter(x, n));
		View.println("---RassimokMath.countPowRecur(x, n)");
		View.println(RassimokMath.countPowRecur(x, n));
		View.println("---Math.pow(x, n)");
		View.println(Math.pow(x, n));

		View.println("---RassimokMath.countFibonacciByNRecur(25)");
		View.println(RassimokMath.countFibonacciByNRecur(25));
		View.println("---RassimokMath.countFibonacciByNIter(25)");
		View.println(RassimokMath.countFibonacciByNIter(25));

		View.println("---RassimokMath.checkSumDigitsNEqualsNomberSIter(1234,10)");
		View.println(RassimokMath.checkSumDigitsNEqualsNomberSIter(2000, 2));
		View.println("---RassimokMath.checkSumDigitsNEqualsNomberSRecur(1234,10)");
		View.println(RassimokMath.checkSumDigitsNEqualsNomberSRecur(2000, 2));

		View.println("---Hanoy");
		View.println(HanoyTower.countHanoyTowerDisplacement(3, 'A', 'B', 'C'));

	}

}
