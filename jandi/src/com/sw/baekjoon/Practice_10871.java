package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_10871 {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		//첫번쨰  입력 값으로 배열을 만든다.
		//split 함수를 이용하여 N과  X를 구분 짓는다.
		
		String str1=br.readLine();
		String[] arr=str1.trim().split(" ");
		int N=Integer.parseInt(arr[0]);  // 정수N개
		int X=Integer.parseInt(arr[1]);  // X
		
		String str2=br.readLine();
		
		String[] arr2=new String[N];//배열 생성
		arr2=str2.trim().split(" ");// 두번쨰 입력값들 배열에 할당됨
		
		int[]numArr=new int[arr2.length];
		for(int i=0;i<arr2.length;i++) {
			numArr[i]=Integer.parseInt(arr2[i]);
		}
		
		for(int i=0;i<numArr.length;i++) {
			if(numArr[i]<X) {
				System.out.print(numArr[i]+" ");
			}
		}
		
		
		
	}

}
