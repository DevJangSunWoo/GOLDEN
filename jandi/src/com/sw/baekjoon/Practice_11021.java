package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_11021 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		
		int tokenInteger=0;
		int sum=0;
		for(int i=0;i<num;i++) {
			StringTokenizer st= new StringTokenizer(br.readLine()); 
			while(st.hasMoreTokens()) { // token이 있을떄
				tokenInteger=Integer.parseInt(st.nextToken());
				sum+=tokenInteger;				
				
			}
			System.out.println("Case #"+(i+1)+":"+" "+sum);  //Case #1: 2
			sum=0; // sum 을 0으로 초기화해줘야함  안그러면 sum 값이 계속 누적됨
		}
	
	
	}

}
