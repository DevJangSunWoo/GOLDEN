package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_1259 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 브론즈1  1259 팰린드롬수  역순 , break 이용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String str=br.readLine();
			
			if(str.equals("0")) break;
			String[] arr = str.trim().split(" ");

			int[] compareArr = new int[2]; // null 조심하자 new String 써야함

			for (int j = 0; j < arr.length; j++) {
				// 문자를 역순시켜야함.
				// 임시배열이 필요
				// 일단 arr[0] 은 String형이며 예시로 734로 있다고 가정
				String[] test = arr[j].trim().split(""); // test 배열 생성 현재 상태 [7,3,4]
				// 임시 배열 생성
				String[] tempo = new String[test.length];
				// count 선언
				int count = test.length - 1;
				for (int i = 0; i < test.length; i++) {
					tempo[i] = test[count];
					count--;
				}
				
				String saveData="";
				for(int i=0;i<tempo.length;i++) {
					saveData+=tempo[i];
				}
				//System.out.println(saveData);
				
				if(str.equals(saveData)) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}			
			}
		}
		
		
	}
}
