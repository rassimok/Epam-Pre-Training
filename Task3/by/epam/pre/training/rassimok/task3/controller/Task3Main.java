package by.epam.pre.training.rassimok.task3.controller;

import by.epam.pre.training.rassimok.task3.model.Coin;
import by.epam.pre.training.rassimok.task3.model.NaturalNumberUtil;
import by.epam.pre.training.rassimok.task3.model.PerfectNumber;
import by.epam.pre.training.rassimok.task3.view.View;

public class Task3Main {

	public static void main(String[] args) {
		View.println("---Coin.countHeadsResults(100)");
		View.println(Coin.countHeadsResults(100));
		View.println("---NaturalNumberUtil.findMaxNumeral(2134234)");
		View.println(NaturalNumberUtil.findMaxNumeral(2134234));
		View.println("---NaturalNumberUtil.checkIsPalindrome(123321)");
		View.println(NaturalNumberUtil.checkIsPalindrome(123321));
		View.println("---NaturalNumberUtil.checkIsPrime(19)");
		View.println(NaturalNumberUtil.checkIsPrime(19));
		View.println("---NaturalNumberUtil.findAllPrimeDividers(11880)");
		View.println(NaturalNumberUtil.findAllPrimeDividers(11880));
		View.println("---NaturalNumberUtil.findGCD(100, 200)");
		View.println(NaturalNumberUtil.findGCD(100, 200));
		View.println("---NaturalNumberUtil.findLCM(15, 20)");
		View.println(NaturalNumberUtil.findLCM(15, 20));
		View.println("---NaturalNumberUtil.countDifferentNumerals(1450)");
		View.println(NaturalNumberUtil.countDifferentNumerals(1450));
		View.println("---");
		View.println(PerfectNumber.checkIsPerfect(6));
		View.println(PerfectNumber.checkIsPerfect(28));
		View.println(PerfectNumber.checkIsPerfect(496));
		View.println(PerfectNumber.checkIsPerfect(8128));
		View.println(PerfectNumber.checkIsPerfect(3553));

	}

}
