package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_2588 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 입출력과 사칙연산 브론즈3 곱셈  어떤 자릿수 규칙이 있을것 같긴한데
		
		BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
		int firstNum=Integer.parseInt(br.readLine());
		String secondStr=br.readLine();
		int secondNum=Integer.parseInt(secondStr);
		String[] arr=secondStr.trim().split("");
		//arr[0];  100의 자릿수
		//arr[1];	10의 자릿수
		//arr[2];	 1의 자릿수		
		int sum=0; //뭔가  규칙을 찾아서 이용할 수 있을것 같기는 한데 ....
		for(int i=arr.length-1;i>=0;i--) {
			//내가 출력해야할것 순서
			// arr[2] * firstNum  1의 자릿수
			// arr[1] * firstNum  10의 자릿수
			// arr[0] * firstNum  100의 자릿수
			System.out.println(Integer.parseInt(arr[i])*firstNum);
			
		}
		System.out.println(firstNum*secondNum);
	}

}
