package com.sw.baekjoon;

import java.util.Scanner;

public class Practice_2440 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int numb=sc.nextInt();
		
//		for(int i=0;i<numb;i++) {
//			
//			for(int j=0;j<numb;j++) {
//				if(i+j<=numb-1) {
//					System.out.print("*");
//				}
//				
//			}
//			System.out.println();
//			
//		}
		
		
		
		
		for(int i=0;i<numb;i++) {
			
			for(int j=0;j<numb-i;j++) {
				 
					System.out.print("*");
				
				
				}
			System.out.println();
			
		}
		
		
		
		
	}

}
