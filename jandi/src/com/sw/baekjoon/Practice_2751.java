package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice_2751 {

	public static void main(String[] args)throws IOException {
		//Arrays.sort 로 풀면 시간초과가 난다.
		//Arrays.sort() 의 경우 dual-pivot Quicksort 알고리즘을 사용한다고 했다.
		//물론 평균 시간복잡도가 O(nlogn) 이고 매우 빠른 알고리즘인 것은 맞다.
		//최악의 경우 시간복잡도는 O(n2) 이라는 점을 기억해야한다.
				
		//
		
		BufferedReader br= new  BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int[] arr=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<num;i++) {
			sb.append(arr[i]).append("\n");
		}
	
		System.out.println(sb);
		
	} 
}