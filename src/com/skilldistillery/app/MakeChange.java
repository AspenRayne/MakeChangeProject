package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("Please enter in the price of the item you are purchasing: ");
		double itemAmount = kb.nextDouble();

		System.out.print("Please enter in the amount you are paying for your item: ");
		double amountRecieved = kb.nextDouble();
		
		if (itemAmount > amountRecieved) {
			System.out.println("Your item is more than the amount you are paying with.");
		} else if (itemAmount == amountRecieved) {
			System.out.println("You paid your item to the exact amount! Have a good day.");
		} else if (itemAmount < amountRecieved) {
			System.out.println("Your change is: " + moneyOwed((amountRecieved - itemAmount) + .001));
		}

	}

	public static String moneyOwed(double amountOwed) {
		double penny = 0.01, nickel = 0.05, dime = 0.10, quarter = 0.25;
		double one = 1.00, five = 5.00, ten = 10.00, twenty = 20.00;
		String result = "";

		if (amountOwed - twenty >= 0) {
			int twentyOwed = (int) (amountOwed / twenty);
			if (twentyOwed == 1) {
				result += "1 Twenty dollar bill,";
			} else {
				result += twentyOwed + " Twenty dollar bills,";
			}
			amountOwed = amountOwed - (twenty * twentyOwed);
		}
		if (amountOwed - ten >= 0) {
			int tenOwed = (int) (amountOwed / ten);
			if (tenOwed == 1) {
				result += " 1 Ten dollar bill,";
			} else {
				result += tenOwed + " ten dollar bills,";
			}
			amountOwed = amountOwed - (ten * tenOwed);
		}
		if (amountOwed - five >= 0) {
			int fiveOwed = (int) (amountOwed / five);
			if (fiveOwed == 1) {
				result += " 1 five dollar bill,";
			} else {
				result += fiveOwed + " five dollar bills,";
			}
			amountOwed = amountOwed - (five * fiveOwed);
		}
		if (amountOwed - one >= 0) {
			int oneOwed = (int) (amountOwed / one);
			if (oneOwed == 1) {
				result += " 1 one dollar bill,";
			} else {
				result += oneOwed + " one dollar bills,";
			}
			amountOwed = amountOwed - (one * oneOwed);
		}
		if (amountOwed - quarter >= 0) {
			int quarterOwed = (int) (amountOwed / quarter);
			if (quarterOwed == 1) {
				result += " 1 quarter,";
			} else {
				result += quarterOwed + " quarters,";
			}
			amountOwed = amountOwed - (quarter * quarterOwed);
		}
		if (amountOwed - dime >= 0) {
			int dimeOwed = (int) (amountOwed / dime);
			if (dimeOwed == 1) {
				result += " 1 dime,";
			} else {
				result += dimeOwed + " dimes,";
			}
			amountOwed = amountOwed - (dime * dimeOwed);
		}
		if (amountOwed - nickel >= 0) {
			int nickelOwed = (int) (amountOwed / nickel);
			if (nickelOwed == 1) {
				result += " 1 nickel,";
			} else {
				result += nickelOwed + " nickels,";
			}
			amountOwed = amountOwed - (nickel * nickelOwed);
		}
		if (amountOwed - penny >= 0) {
			int pennyOwed = (int) (amountOwed / penny);
			if (pennyOwed == 1) {
				result += " 1 penny,";
			} else {
				result += pennyOwed + " pennies,";
			}
			amountOwed = amountOwed - (penny * pennyOwed);

		}

		return result.substring(0, result.length() - 1) + ".";
		
	}
}
