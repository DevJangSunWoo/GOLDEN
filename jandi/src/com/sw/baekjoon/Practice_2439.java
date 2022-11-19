package com.sw.baekjoon;

import java.util.Scanner;

public class Practice_2439 {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	System.out.print("숫자를 입력하세요 :");
	
	int num=sc.nextInt();
	
	
	for(int i=0;i<num;i++) {
		
		for(int j=0;j<num;j++) {		
			if((i+j)>=num-1) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
		
	
	}
	
//	//i가 0일떄
//	System.out.print(" ");
//	System.out.print(" ");
//	System.out.print(" ");
//	System.out.print(" ");
//	System.out.print("*");
//	
//	System.out.println();
//	
//	
//	//j가 1일떄
//	System.out.print(" ");
//	System.out.print(" ");
//	System.out.print(" ");
//	System.out.print("*");
//	System.out.print("*");
//	
//	System.out.println();
//	
//	
//	
//	//j가 1일떄
//	System.out.print(" ");
//	System.out.print(" ");
//	System.out.print(" ");
//	System.out.print("*");
//	System.out.print("*");
//		
//	System.out.println();
//	
//	
//	
//	//j가2일떄
//	System.out.print(" ");
//	System.out.print(" ");
//	System.out.print("*");
//	System.out.print("*");
//	System.out.print("*");
//		
//	System.out.println();
//	
//	
//	//j가3일떄
//	System.out.print(" ");
//	System.out.print("*");
//	System.out.print("*");
//	System.out.print("*");
//	System.out.print("*");
//			
//	System.out.println();
//	
//	//j가 4일떄
//	System.out.print("*");
//	System.out.print("*");
//	System.out.print("*");
//	System.out.print("*");
//	System.out.print("*");
//				
//	System.out.println();
	
	
	
	
	
	

	}

}
