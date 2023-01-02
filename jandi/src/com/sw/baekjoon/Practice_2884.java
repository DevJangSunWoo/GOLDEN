package com.sw.baekjoon;

import java.util.Scanner;

public class Practice_2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int H=sc.nextInt();
		int M=sc.nextInt();
		
		if(H!=0) {
			if(M>=45&M<=59) {
				System.out.println(H+" "+(M-45));
				
			}else if(M<=44&M>=0) {
				
				
				System.out.println((H-1)+" "+(M+60-45));
				
			}
		}else {
			if(M>=45&M<=59) {
				System.out.println(H+" "+(M-45));
				
			}else if(M<=44&M>=0) {
				
				
				System.out.println(23+" "+(M+60-45));
				
			}
			
			
		}
	
	
	
	
	
	}

}
