package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_15552 {

	
	//StringBuilder 로 하나의 문자열로 계속 연결시킨 뒤 가장 마지막에 연결된 하나의 문자열을 출력시키는 방법.
//알고리즘에서는 사용자가 집적 필요에 따라 파싱(parsing)하는게 더욱 빠르기 때문에 BufferedReader을 쓰게 되는 것이다.	
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
        
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
        
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append('\n');
		}	// append 로 계속 데이터를 추가해준다.
		br.close();  //  BufferedReader  종료해준다.
 
		System.out.println(sb);
		
	}
}
