package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Practice_10798 {

	public static void main(String[] args)throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[][] arr= new String[5][15];
		
		
		for(int i=0;i<arr.length;i++) {
			String strRow=br.readLine();
			String[] arrRow=strRow.trim().split("");
			for(int j=0;j<arrRow.length;j++) {
				arr[i][j]=arrRow[j];
			}			
		}
		//System.out.println(Arrays.toString(arr[1]));  비어있는 공간은 null값으로 들어감
		
		//String 변수 선언
		String outPut="";
		//(0,0) (0,1) (0,2)    ....   (0,15)
		//(1,0) (1,1) (2,2)	 	 .... (1,15)
		//(2,0) (2,1) (2,2)		 .... (2,15)
		
		//arr[0].length  길이나  arr[1].length arr[i].length 나 같다
		//outPut에 들어가는 변수 고려하기 
		for(int i=0;i<arr[0].length;i++) {			   //0    14			
			for(int j=0;j<arr.length;j++) {  //0          4
				if(arr[j][i]!=null) {// 입력이안된 비어있는  부분은 null 이므로   분기 처리한다.
					outPut+=arr[j][i];	
				}
				
			}
		
		}
		System.out.println(outPut);
		
	}

}