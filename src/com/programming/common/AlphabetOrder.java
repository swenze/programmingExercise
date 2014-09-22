package com.programming.common;

import com.programming.util.ArrayUtil;

/**
 * http://taop.marchtea.com/01.06.html
 * @author swenze
 *
 */
public class AlphabetOrder {

	public static boolean calcAllPermutation(char[] chars){
		int i, j ;
		for( i = chars.length - 2; i >= 0 && chars[i] > chars[i+1]; i--){
			
		}
		if(i < 0){
			return false;
		}
		for(j = chars.length - 1; j > i && chars[j] <= chars[i]; j--){
			
		}

		ArrayUtil.swap(chars,i,j);
		ArrayUtil.reverse(chars, i+1, chars.length-1);
		return true;
	}
	
	public static void main(String[] args) {
		String str = "123";
		char[] chars = str.toCharArray();
		
		System.out.println(chars);
		while(calcAllPermutation(chars)){
			System.out.println(chars);
		}
	}
	
}
