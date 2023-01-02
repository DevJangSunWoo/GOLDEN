package com.sw.baekjoon;

import java.util.Scanner;

public class Practice_2441 {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		int numb=sc.nextInt();
		
		for(int i=0;i<numb;i++) {
		
		for(int j=0;j<numb;j++) {
			if(i>j) {
				System.out.print(" ");
			}else {
				System.out.print("*");
			}
			
		}
		System.out.println();
		
	}
		
		
		
		
	}

}
