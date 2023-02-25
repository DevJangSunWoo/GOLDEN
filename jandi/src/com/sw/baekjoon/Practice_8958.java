package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Practice_8958 {

	public static void main(String[] args) throws IOException{		
		//O의 개수가 점수에 영향을 준다, O가연속됬을경우 연속된 갯수가 점수가 된다.
		//O의 연속이 끊어졌으면 초기화된다.
		// 배열을 이용한다.
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int testNum=Integer.parseInt(br.readLine());
		
		for(int j=0;j<testNum;j++) {
			String  str=br.readLine();// 예제 OOXXOXXOOO	
			String[] arr =str.trim().split(""); // 현재 상태 [O,O,X,X,O,X,X,O,O,O]
			//System.out.println(Arrays.toString(arr));
			int point[]=new int[arr.length];//점수를 담을 배열선언
			int  count=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i].equals("O")) {
					//System.out.println(i+"번쨰는"+"O이다");
					count++;// 이구문을 거치면 현재 카운트는 1이다
					point[i]=count;
				}else if(arr[i].equals("X")) {
					//System.out.println(i+"번쨰는"+"X이다");
					count=0;
				}						
			}
			//System.out.println(Arrays.toString(point));
			int sum=0;
			for(int i=0;i<point.length;i++) {
				sum+=point[i];
			}
			System.out.println(sum);
		}	
		
		
	}

}