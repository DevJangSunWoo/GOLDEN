package com.sw.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();  
		
		int[] arr=new int[N];
		
		for(int i=0;i<N;i++) {
			
			 arr[i]=sc.nextInt();  	
		}
		 
	
		
	
		int max=Integer.MIN_VALUE; 
		int min=Integer.MAX_VALUE;
		
		
		Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[arr.length-1]);			
	}

}
