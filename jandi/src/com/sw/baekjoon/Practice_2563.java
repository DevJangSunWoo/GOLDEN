package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice_2563 {

//생각시도
//애초에 차이가 10보다 작으면 겹친다
//x,y  하나라도 차이가 10이상이면 안겹친다.	
	
//	3
//	3 7
//	15 7
//	5 2
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int num= Integer.parseInt(br.readLine());
		int[][] arr=new int[num][2]; 
		
		for(int i=0;i<num;i++ ) {
			String str=br.readLine();  //3 7 
			String [] strArr=str.trim().split(" ");//[3,7]
			for(int j=0;j<strArr.length;j++) {
					arr[i][j]=Integer.parseInt(strArr[j]);				
			}
		}
//		System.out.println(Arrays.toString(arr[0]));
//		System.out.println(Arrays.toString(arr[1]));
//		System.out.println(Arrays.toString(arr[2]));
		
		//내가 비교해야하는 거는(0.0) (1,0) (2,0)
		for(int i=0;i<arr[0].length;i++) {// 0 1 
			for(int j=0;j<arr.length;j++) {// 0 1 2
				System.out.println(arr[j][i]);
				
			}
		}
		
		
		
	}

}
