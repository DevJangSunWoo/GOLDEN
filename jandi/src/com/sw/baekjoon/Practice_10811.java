package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_10811 {

	public static void main(String[] args)throws IOException {
		//1차원 배열  point 역순
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		String firstLine=br.readLine();		
		String[] arr1=firstLine.trim().split(" ");
		int N=Integer.parseInt(arr1[0]);
		int M=Integer.parseInt(arr1[1]);
		int bucket[]=new int[N+1];
		
		for(int i=0;i<N+1;i++) {
			bucket[i]=i;
			//System.out.print(bucket[i] +" ");
		}
		
		
		for(int i=0;i<M;i++) {
			 String testLine=br.readLine();
			 String [] testArr=testLine.trim().split(" ");
			 int numS=Integer.parseInt(testArr[0]);
			 int numE=Integer.parseInt(testArr[1]);
			 
			 //처음 시도는 바뀌기전에 데이터를 담을 저장공간을 생성하는 규칙을 찾는거였으나
			 //임시 배열을 선언해서  할당하는 것이 더 효율적일 수 있음.
			 //임시배열 선언
			 int tempoArr[]=new int[N+1];
			 int count=numE;
			 
			 //k 지정안한 범위 데이터 그대로 넣어주기 
			 for(int k=1;k<=numS-1;k++ ) {				 
				 tempoArr[k]=bucket[k];
			 }
			 
			//5 1
			 //1 4
			 //역순된 데이터를 집어 넣는다.
			 //4 3 2 1 0
			//이 시점에서의 tempoArr은  지정한범위는  역순으로 데이터가 들어가고 
			 //지정외의 부분은으로 대체  		 
			 for(int j=numS;j<=numE;j++) {
				 //numS 1 이고 numE 4이면
				 //tempArr[1]=bucket[4]
				 //tempArr[2]=bucket[3]
				 //tempArr[3]=bucket[2]
				 //tempArr[4]=bucket[1]
				   tempoArr[j]=bucket[count];
				   count--;				   
			 }		
			 
			 //m  지정안한 범위 데이터 그대로 넣어주기 
			 for(int m=numE+1;m<=N;m++ ) {				 
				 tempoArr[m]=bucket[m];
			 }			 
			 //bucket 배열에 과 종합된  tempoArr 배열을 일치시킨다.
			 bucket=tempoArr;
		}
		//출력부
		
		for(int i=1;i<N+1;i++) {
			System.out.print(bucket[i]+" ");
		}
		
		
	}

}
