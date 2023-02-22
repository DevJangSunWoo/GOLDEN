package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_10813 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String firstLine=br.readLine();
		
		String[] arr1=firstLine.trim().split(" ");
		
		int N=Integer.parseInt(arr1[0]);
		int M=Integer.parseInt(arr1[1]);
		
		int bucket[] =new int[N];
		
		for(int i=0;i<N;i++) {
			bucket[i]=i+1;
			//System.out.println(bucket[i]);
		}
		
		int exchangeNum=0;
		for(int i=0;i<M;i++) {
			 String testLine=br.readLine();
			 String [] testArr=testLine.trim().split(" ");
			 int numS=Integer.parseInt(testArr[0]);
			 int numE=Integer.parseInt(testArr[1]);
			//  point 1 :바뀌기 전에 numS를 변수에 담가둔다.
			 //point 2 : 배열의 index 번호.
			 exchangeNum=bucket[numS-1]; 
			 bucket[numS-1]=bucket[numE-1];
			 bucket[numE-1]=exchangeNum;	 
			}
		for(int i=0;i<N;i++) {
			System.out.print(bucket[i]+" ");
		}
		
	}

}
