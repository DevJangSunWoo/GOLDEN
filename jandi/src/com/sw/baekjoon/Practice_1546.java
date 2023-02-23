package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_1546 {
	
		public static void main (String[] args)throws IOException {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			int firstLineNum=Integer.parseInt(br.readLine());
			
			String secondLine=br.readLine();
			
			double point[]=new double[firstLineNum];
			String []arr=secondLine.trim().split(" ");
			
			for(int i=0;i<firstLineNum;i++) {
				point[i]=Integer.parseInt(arr[i]);// 원본 점수 배열 완성
		//	System.out.println("원본 점수 배열 확인중"+point[i]);
			}
			
			//이제 최댓값을 찾자
			double max=Integer.MIN_VALUE;
			
			for(int i=0;i<point.length;i++) {
				if(point[i]>max) {
					max=point[i];				
				}
			}
			
		//	System.out.println("원본 점수 중 최댓값"+max);
			
			//점수 조작된 배열을 만든다.
			double manipulatedPoint[]=new double[firstLineNum];
			for(int i=0;i<point.length;i++) {				
				manipulatedPoint[i]=(point[i]/max)*100;
		//		System.out.println("조작된 점수"+manipulatedPoint[i]);
			}
			
			//조작된 배열의 합
			double sum = 0; 
			for(int i=0;i<manipulatedPoint.length;i++) {
				sum+=manipulatedPoint[i];
			}
			
			//새로운 평균 구하기
			System.out.print(sum/manipulatedPoint.length);
			
			
		}
	

}
