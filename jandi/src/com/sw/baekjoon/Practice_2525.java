package com.sw.baekjoon;

import java.util.Scanner;

public class Practice_2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		
		int h=sc.nextInt();  // 시
		int m=sc.nextInt();  // 분
		int n=sc.nextInt();  // 더하는 수
		
		
		double standard=((m+n)/60);
		int standardNum=(int)standard;
		
		if(m+n<60) {
			
			System.out.println(h+" "+(m+n));
			
		}else  {// m+n이 60이거나 60보다 클떄
			
			if(h+standardNum<24) {
			System.out.println((h+standardNum)+" "+(m+n-(60*standardNum)));
			}else if(h+standardNum>=24) {
				System.out.println((h+standardNum-(24))+" "+(m+n-(60*standardNum)));
				
			}
		
		
		}
		

	}

}
