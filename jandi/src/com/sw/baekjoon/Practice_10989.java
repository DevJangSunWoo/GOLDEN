package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice_10989 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new  BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int [] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(br.readLine());  
		}
		Arrays.sort(arr);
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<N;i++) {
			sb.append(arr[i]).append("\n");
		
		}
		br.close();
		System.out.println(sb);
		
	}

}
