package com.programming.dp;

import java.util.Scanner;

/**
 *  problem http://hero.csdn.net/OnlineCompiler/Index?ID=580&ExamID=575&from=4
 * @author swenze
 *
 */
public class StringDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();
	}
	public static void input(){
		Scanner sc = new Scanner(System.in);
		while(true){
			String src = sc.nextLine();
			String target = sc.nextLine();
			System.out.println(getLeastChang(src,target));
		}
	}
	public static int getLeastChang(String src,String target){
		
		char[] srcs = src.toCharArray();
		char[] targets = target.toCharArray();
		
		int dp[][] = new int[src.length()+1][target.length()+1];
		
		for(int i = 1; i <= srcs.length; i++){
			dp[i][0] = i;
		}
		
		for(int j = 1; j <= targets.length; j++){
			dp[0][j] = j;
		}
		for(int i = 1; i <= srcs.length; i++){
			for(int j = 1; j <= targets.length; j++){
				
				if(srcs[i-1] == targets[j-1]){
					dp[i][j] = dp[i-1][j-1];
				}else{
					int min = dp[i-1][j] < dp[i][j-1] ? dp[i-1][j]:dp[i][j-1];
					dp[i][j] = min + 1;
				}
			}
		}
		return dp[srcs.length][targets.length];
	}
}
