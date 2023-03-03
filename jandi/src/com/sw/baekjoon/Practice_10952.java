package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_10952 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringTokenizer st =new StringTokenizer(br.readLine());
			
			
			int tokenInteger=0;
			int sum=0;
			while(st.hasMoreTokens()) {
			  tokenInteger=Integer.parseInt(st.nextToken());
				sum+=tokenInteger;
			}
			
			if(sum==0) break;			
			System.out.println(sum);
		
		
		}
	
		
		
	}

}
