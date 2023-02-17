package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_10807 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));				
		int  numb = Integer.parseInt(br.readLine());				
		String[] arr = new String[numb]; //입력받은수 만큼의 배열의 공간 생성
		
			
		String br2Str=br.readLine();	
		 arr=br2Str.trim().split(" ");// trim 으로 앞뒤 공백제거 후 split() 함수를 이용해서 		
		 // 스트링 배열 인트형 배열으로 형변환
		//int 형 배열 생성
		 int[] numArr=new int[arr.length];
		 for(int i=0;i<arr.length;i++) {
			 numArr[i]=Integer.parseInt(arr[i]);
		 }
		 
		 
		
		 int  numb2 = Integer.parseInt(br.readLine());	
		 
		 int count=0;
		 for(int i=0;i<numArr.length;i++) {
			 
			 if(numArr[i]==numb2) {
				 count++;
			 }
			 
		 }
		 
		 System.out.println(count);
		 
		
	}

}
