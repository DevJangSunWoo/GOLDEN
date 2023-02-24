package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice_2908 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
		
		
		String[] arr=br.readLine().trim().split(" ");
		
		int[] compareArr = new int[2]; // null 조심하자 new String 써야함
		
		for(int j=0;j<arr.length;j++) {
			//문자를 역순시켜야함.
			//임시배열이 필요
		//일단 arr[0] 은  String형이며  예시로  734로 있다고 가정
		String [] test=arr[j].trim().split("");  //test 배열 생성 현재 상태 [7,3,4]
		//임시 배열 생성
		String []tempo=new String[test.length];
		//count 선언
		int count=test.length-1;
		for(int i=0;i<test.length;i++) {		
			tempo[i]=test[count];
			count--;
		}	
		
		String saveData="";
		for(int i=0;i<tempo.length;i++) {
			saveData+=tempo[i];
		}
		//System.out.println(saveData);		
		
		compareArr[j]=Integer.parseInt(saveData);
		}	
		//System.out.println(Arrays.toString(compareArr));
		if(compareArr[0]<compareArr[1]) {
			System.out.println(compareArr[1]);
			
		}else if(compareArr[0]>compareArr[1]) {
			System.out.println(compareArr[0]);
		}
		
		
	}

}
