package com.programming.bit;

/**
 * http://taop.marchtea.com/01.02.html
 * 
 * @author swenze
 * 
 */
public class StringContain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a = "D";
		String b = "A";
		isContain(a, b);
	}

	public static boolean isContain(String a, String b) {
		int hash = 0;
		for (int i = 0; i < a.length(); ++i) {
			hash |= (1 << (a.charAt(i) - 'A'));
		}
		for (int i = 0; i < b.length(); ++i) {
			if ((hash & (1 << (b.charAt(i) - 'A'))) == 0) {
				return false;
			}
		}
		return true;
	}
}
