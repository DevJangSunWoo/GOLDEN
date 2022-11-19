package com.sw.baekjoon;

import java.util.Scanner;

public class Practice_sosu {

	//설계한다
	//패턴확인
	//필요하다면 변수 및 필요한 것들 선어해야한다.
	
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("수를 입력하세요 :");
		int x=sc.nextInt();
		
		

		
		
			int count=0;
			for(int i=1;i<=x;i++) {
				
//				System.out.println(x%i);
				if(x%i==0) {
					count++;
					}	
			}
		
//			System.out.println("소수의 갯수"+count);
			
			
			if(count==2) {
				
				System.out.println(x+"는 소수입니다.");
			}
			
			else {
				
				System.out.println(x+"는 소수가아닙입니다.");
			}
			
			
			
			
	}

}
