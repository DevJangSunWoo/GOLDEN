package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_10810 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		String firstLine=br.readLine();
		
		String[] arr1=firstLine.trim().split(" ");
		//System.out.println(arr1[0]);
		
		int N=Integer.parseInt(arr1[0]);
		int M=Integer.parseInt(arr1[1]);
		
		int bucket[]=new int[N];
		
		for(int i=0;i<M;i++) {
		 String testLine=br.readLine();
		 String [] testArr=testLine.trim().split(" ");
		 int numS=Integer.parseInt(testArr[0]);
		 int numE=Integer.parseInt(testArr[1]);
		 int numM=Integer.parseInt(testArr[2]);
		 	for(int j=numS-1;j<numE;j++) {//point
		 		bucket[j]=numM;
		 	}	 
		}
		
		for(int i=0;i<N;i++) {
			System.out.print(bucket[i]+" ");
		}		
	}
}