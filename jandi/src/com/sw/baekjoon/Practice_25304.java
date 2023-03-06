package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_25304 {

	public static void main(String[] args) throws IOException {
		// 25304 브론즈5 반복문 br.close(); StringTokenizer
		BufferedReader br= new  BufferedReader(new InputStreamReader(System.in));
		int totalPrice=Integer.parseInt(br.readLine());// 총가격
		int N = Integer.parseInt(br.readLine());  // 구매한 물건의 총가격 순
		
		StringTokenizer st;
		int sumNum=0;
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			sumNum+=(Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken()));
			
		}
		br.close();
		//System.out.println(sumNum);
		if(sumNum==totalPrice) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
	}

}
