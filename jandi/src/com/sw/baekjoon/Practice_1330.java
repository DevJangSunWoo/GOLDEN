package com.sw.baekjoon;

import java.util.Scanner;

public class Practice_1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		String str=sc.nextLine();
		
		String  [] arr=str.split(" ");
		
		int num1=Integer.parseInt(arr[0]);
		int num2=Integer.parseInt(arr[1]);
		
		if(num1>num2) {
			System.out.println(">");
			
		}else if(num1<num2) {
			
			System.out.println("<");
		}else {
			
			System.out.println("==");
		}
		
		
		
	}

}
