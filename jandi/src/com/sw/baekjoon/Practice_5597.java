package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Practice_5597 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		Integer[] classArr=new Integer[3];  //28
//		for(int i=0;i<classArr.length;i++){
//			classArr[i]=Integer.parseInt(br.readLine());		
//		}
//		
//		Integer[]dbArr=new Integer[5]; //30
//		for(int i=0;i<dbArr.length;i++) {			
//			dbArr[i]=i+1;
//		}
		
		//boolean 배열을 이용하여 문제 풀기
		//배열의 31 선언한 이유는  이래야 번지가 30까지 나오고  java.lang.ArrayIndexOutOfBoundsException를 막을수 있기 떄문에
		boolean stuChk[]=new boolean[31];
		
		for(int i=0;i<28;i++) { //28번 시행
			stuChk[Integer.parseInt(br.readLine())]=true;
		}
		for(int i=1;i<=30;i++) {
			if(!stuChk[i])//  stuChk[i]  false 이면 출력해라!
				System.out.println(i);
		}
		
		
	
	}
}