package amazon;

import java.util.Scanner;

/**
 * 
 * 
 * Given an array and a sum s find all pairs of numbers which whose sum = s ?
 * 
 * space complexity-O(1),time complexity-O(n)
 * 
 * @author veenakpandit
 *
 */

public class PairsofNumbersWhoseSumiss {

	public PairsofNumbersWhoseSumiss(int[] numbers, int s) {

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double mealCost = scan.nextDouble(); // original meal price
		int tipPercent = scan.nextInt(); // tip percentage
		int taxPercent = scan.nextInt(); // tax percentage
		scan.close();

		// Write your calculation code here.
		double tip = Double.valueOf(tipPercent) / 100;
		double tax = Double.valueOf(taxPercent) / 100;
		System.out.println(tip);
		System.out.println(tax);
		// cast the result of the rounding operation to an int and save it as totalCost
		int totalCost = (int) Math.round((tip * mealCost) + (tax * mealCost) + mealCost);

		// Print your result
		System.out.println(totalCost);
	}

}
