package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_2562 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] strArr=new String[9];
		for(int i=0;i<9;i++){
			strArr[i]=br.readLine();		
		}
		
		
		int[] numArr=new int[9];
		for(int i=0;i<9;i++) {
			numArr[i]=Integer.parseInt(strArr[i]);
		}
		int max = Integer.MIN_VALUE;
		for(int i=0;i<numArr.length;i++) {
			if(numArr[i]>max) {
				max=numArr[i];
			}
		}
		System.out.println(max);
		for(int i=0;i<numArr.length;i++) {
			if(numArr[i]==max) {
				System.out.println(i+1);
			}
			
		}	
	}
}