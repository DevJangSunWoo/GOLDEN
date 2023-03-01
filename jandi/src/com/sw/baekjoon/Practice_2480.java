package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Practice_2480 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));	
		StringTokenizer st =new StringTokenizer(br.readLine());
		
		int[] arrInt=new int[3]; 
		for(int i=0;i<arrInt.length;i++) {
			arrInt[i]=Integer.parseInt(st.nextToken());    
		}
		
		
		
		int count=0;
		int duplicatedNum=0;
		for (int i = 0; i < arrInt.length; i++) {
		        int numO = arrInt[i];
		        for (int j = 0; j < arrInt.length; j++) {
		            if (i == j) continue;// continue를 만나면 해당 반복부분만 탈출하고 다음번 반복을 이어서한다.
		            int numC = arrInt[j];
		            if (numO==numC) {
		                count++; 
		            	//System.out.println("중복 => " + i + ". " + numO+" "+"중복개수"+count);		                 
		            	duplicatedNum=numO;
		            	break;
		            }
		        }
		    }
		//System.out.println("카운트 확인해보자 :"+count);
		// 모든 다른 눈이 나온 경우  count  0
		//같은 눈이 2개인 경우 count 2
		//같은눈이  3개인 경우 count 3
	
		Arrays.sort(arrInt); // 정렬하는 이유는 모든 눈이 다른 경우 나온 수의 최댓값을 구하기해서
		// 아니면  int max = Integer.MIN_VALUE;  을이용하여 최댓값을 구할 수 도 있다.
		int price=0;
		switch(count) {
			case 0:  price = arrInt[2]*100;
			         break;
			case 2:  price = 1000+duplicatedNum*100;
			         break;
			case 3:  price = 10000+duplicatedNum*1000;
					 break;
		
		}
		System.out.println(price);
		
		
		
//		if(arrInt[0]==arrInt[1]&&arrInt[1]==arrInt[2]) {
//			price=10000+(arrInt[0])*1000;
//			System.out.println(price);
//		}	
	}
}