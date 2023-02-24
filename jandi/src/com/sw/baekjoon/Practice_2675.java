package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_2675 {

	public static void main(String[] args)throws IOException{		
		//첫번재 입력문은 출력하는 횟수
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int numFirst=Integer.parseInt(String.valueOf(br.readLine()));
		
		int arrSNum=0;
		String arrStr;
		String[] outPutStr;
		String outPutString="";
		
		for(int i=0;i<numFirst;i++) {
			String[] arrS=br.readLine().trim().split(" ");
			//예제 3 ABC 입력시  arrS[0]은 3   arrS[1] 은  ABC가 들어감 
			// arrS[0] 은 int형으로 바꾸어야 겠지
			arrSNum=Integer.parseInt(arrS[0]);
			//arrS[1]을 가지고 또다른 배열을 만들어야 겠지
			 arrStr=arrS[1];
			 outPutStr=arrStr.trim().split("");
			// outPutStr 이제 이상태 [A,B,C]   이배열 내부에 있는 요소들을 arrSNum수 만큼 출력해주면된다.
			 for(int j=0;j<outPutStr.length;j++) {
				 for(int k=0;k<arrSNum;k++) {
					 outPutString+=outPutStr[j];			 
				 }				 
			 }					 
			 outPutString+="\n";
		}		
		System.out.println(outPutString);
	}
}