package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice_2738 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//예제 이해
		
		//A의 들어갈 데이터
		//111 
		//222
		//010
		
		//B에 들어갈 데이터
		//3 3 3
		//4 4 4
		//5 5 100
		
		//출력할것  A+B
		// 4 4 4 
		// 6 6 6
		// 5 6 100
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String[] strArr=str.trim().split(" ");
		int [] intArr=new int[strArr.length]; 
		for(int i=0;i<strArr.length;i++) {
			intArr[i]=Integer.parseInt(strArr[i]);
		}
		int N=intArr[0];
		int M=intArr[1];
		
		int[][]A=new int[N][M];
		int[][]B=new int[N][M];
		
		
			for(int i=0;i<N;i++) {
				String strN=br.readLine();
				String[] arrN=strN.trim().split(" ");
				int [] arrNInt=new int[arrN.length]; 
				for(int j=0;j<arrN.length;j++) {
					arrNInt[j]=Integer.parseInt(arrN[j]);
					A[i][j]=arrNInt[j];
				
				}			
			}		
			
			for(int i=0;i<N;i++) {
				String strN=br.readLine();
				String[] arrN=strN.trim().split(" ");
				int [] arrNInt=new int[arrN.length]; 
				for(int j=0;j<arrN.length;j++) {
					arrNInt[j]=Integer.parseInt(arrN[j]);
					B[i][j]=arrNInt[j];
				
				}			
			}		
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					int outPutNum=A[i][j]+B[i][j];
					System.out.print(outPutNum+" ");
				}				
				System.out.println();
			}
		
		
		
	}
}