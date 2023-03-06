package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_2292 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 벌집 2292  
		//		N 	 / 벌집 개수 /count  
		//	  2~7	/ 	6 	  /  2
		//   8~19	/ 	12 	  /  3
		//   20~37	/ 	18 	  /  4
	    //   38~61	/ 	24 	  /  5
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int N = Integer.parseInt(br.readLine());
		int count = 1; // 겹 수(최소 루트)
		int range = 2;	// 범위 (최솟값 기준) 
 
		if (N == 1) {
			System.out.print(1);  // 1은 규칙에 예외니 분기 처리
		}																																																																																																																																																																																						
 
		else {
			while (range <= N) {	// 범위가 N보다 커지기 직전까지 반복   // 만약 8이 들어오면
				//System.out.println("전range값"+range);
				range = range + (6 * count);  //    8=  2 +(6*1)      20= 8 +(6*2)
				//System.out.println("후range값"+range);
				//System.out.println("전"+count);
				count++;					
				//System.out.println("후"+count);   //  2	3
			
			}
			System.out.print(count);
		}
	}

}
