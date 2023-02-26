package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_11720 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int firstNum=Integer.parseInt(br.readLine());
		
		String secondLine=br.readLine();
		String[] arr=secondLine.trim().split("");
		int[] arrNum=new int[firstNum];		
		int sum=0;
		for(int i=0;i<firstNum;i++) {
			arrNum[i]=Integer.parseInt  ( arr[i]);
			sum+=arrNum[i];
		}
		System.out.println(sum);
		
		
	}

}
