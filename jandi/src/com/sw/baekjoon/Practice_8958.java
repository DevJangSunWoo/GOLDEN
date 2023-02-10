package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_8958 {

	public static void main(String[] args) throws IOException,NumberFormatException{
		// TODO Auto-generated method stub
		// 입력 로직과 출력로직을 따호 따호  처리해도 무방하다.	
		
		//누적점수 , x나오면  누적점수초기화  
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
			int num=Integer.parseInt(br.readLine());
			
		
			
			//point1  먼저 입력문자를 대문자로 만들기
			//point2  누적점수를 생각하지 말고  그냥  O의 갯수 만큼 숫자 출력 
			//point3  새로운 변수를 선언해야하나  int pointNum;    int count;  
			
			
			for(int i=0;i<num;i++) {
				
				String str=br.readLine(); //현재 문자열 상태
				str.toUpperCase();
				System.out.println(str);
				if(str.contains("O")) {
					System.out.println(5);
				}
				System.out.println("일단점수 : ");
				
				
				
				
			}
			
			
		
		
	}

}
