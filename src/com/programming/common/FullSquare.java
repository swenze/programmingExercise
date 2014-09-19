package com.programming.common;

import java.util.Scanner;

public class FullSquare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		input();

	}
	public static void input(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int  m = sc.nextInt();
			System.out.println(getNumCount(n,m));
		}
	}
	public static int getNumCount(int n,int m){
		
		int sqrtN = (int) Math.sqrt(n);
		int sqrtM = (int)Math.sqrt(m);
		
		int count = sqrtM - sqrtN;
		if(n == m && n == sqrtN * sqrtN){
			return 1;
		}
		if(n == m && n != sqrtN * sqrtN){
			return 0;
		}
		if(n == sqrtN * sqrtN){
			return count+1;
		}
		return count;
	}
}

