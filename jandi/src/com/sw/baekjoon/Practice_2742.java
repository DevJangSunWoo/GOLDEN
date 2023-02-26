package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_2742 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int firstNum=Integer.parseInt(br.readLine());
		for(int i=firstNum;i>=1;i--) {
			System.out.println(i);
		}
		
	}

}
