package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_25314 {

	public static void main(String[] args) throws IOException {
		// 2023-03-04[golden]반복문 브론즈5 append
		BufferedReader br= new  BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine())/4; // 입력한수의 4를 나눈수  즉  num을 기준으로 long을 추가해주면됨
		 
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<num;i++) {
			sb.append("long").append(" ");
		}
		sb.append("int"); // 포문 밖에다가  "int"를 append 한다. 
		br.close();
		System.out.println(sb);
	}

}
