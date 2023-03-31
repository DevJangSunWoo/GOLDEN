package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice_2750 {

	public static void main(String[] args)throws IOException {
		//브론즈2 수정렬하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int [] arr= new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		StringBuilder sb =new StringBuilder();
		
		for(int i=0;i<num;i++) {
			sb.append(arr[i]).append("\n");
		}
		System.out.println(sb);
	}

}
