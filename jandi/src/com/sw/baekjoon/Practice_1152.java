package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_1152 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		 String brStr=br.readLine();
		
		if(!brStr.equals(" ")) {
			String[] temp =brStr.trim().split(" ");
			
			
			System.out.println(temp.length);	
			
		}else {
			
			System.out.println(0);
		}
		
		
		
		
		
	}

}
