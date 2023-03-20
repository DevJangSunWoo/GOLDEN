package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class windmillSoft_2 {

	public static void main(String[] args) throws IOException {
		//삼각형의 밑변과 높이가 주어졌을떄,삼각형의 넓이를 구하는 프로그램 작성		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));		
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int a=Integer.parseInt(st.nextToken()) ; //밑변의 길이 a
		//System.out.println("밑변의 길이 a: "+a);
		int h=Integer.parseInt(st.nextToken()) ; //높이의 길이 h
		//System.out.println("높이의 길이 길이 a: "+h);		
		br.close();
		double dimension=a*h/2;		
		System.out.println(Math.round(dimension*10)/10.0);
		
	}

}
