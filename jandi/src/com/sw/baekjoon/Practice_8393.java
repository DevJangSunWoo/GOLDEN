package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_8393 {

	public static void main(String[] args) throws IOException{
		// 8393 브론즈 5
		BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}	

}
