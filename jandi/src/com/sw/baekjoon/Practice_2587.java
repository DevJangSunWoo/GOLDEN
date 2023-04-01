package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice_2587 {

	public static void main(String[] args) throws IOException{
		// 브론즈2 대표값
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num=0;
		int [] arr=new int[5];
		int sum=0;
		for(int i=0;i<5;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			sum+=arr[i];
		}
		Arrays.sort(arr);
		StringBuilder sb =new StringBuilder();
		sb.append(sum/5).append("\n").append(arr[2]);
		System.out.println(sb);
	}

}
