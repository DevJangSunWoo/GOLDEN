package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_2739 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//2739  브론즈 5
		//2 * 1 = 2
		BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		
		for(int i=1;i<=9;i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		}
		
		
		
	}

}
