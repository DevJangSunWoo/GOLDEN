package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_10951 {
	public static void main(String[] args) throws IOException {
//		BufferedReader 클래스
//		BufferedReader는 Scanner와 달리 EOF를 처리하는 내장 함수는 없습니다.
//		그래서 BufferedReader는 아래와 같이 EOF를 처리합니다.
		// br.readLine()으로 입력값을 계속 읽되, 읽은 값이 null이 되면 반복문을 종료하는 방식입니다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;
 
		while( (str=br.readLine()) != null&&!str.isEmpty() ){   //isEmpty 할당은 됬으나 사이즈가 0인것
		    // eof 처리시  (str=br.readLine()) != null&&!str.isEmpty()
			st = new StringTokenizer(str," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			//System.out.println(a+" "+b);
			sb.append(a+b).append("\n");		
			
			
		}
		System.out.print(sb);
		
	}
}