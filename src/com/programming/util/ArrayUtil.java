package com.programming.util;


public class ArrayUtil {

	public static  void swap(char[] array,int a, int b){
		
		if(a >= array.length || b >= array.length)
			return;
		
		char tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}

	public static  void reverse(char[] array,int start,int end){
		
		for(int i = start, j = end; i < j; i++,j--){
			swap(array,i,j);
		}
	}
}
