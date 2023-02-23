package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Practice_2577 {

	public static void main(String[] args) throws IOException{		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	int num1=Integer.parseInt(String.valueOf(br.readLine()));
	int num2=Integer.parseInt(String.valueOf(br.readLine()));
	int num3=Integer.parseInt(String.valueOf(br.readLine()));
	
	int resultNum=num1*num2*num3;
	  String resultStr=String.valueOf(resultNum);
	  
	  String [] resultArr=resultStr.trim().split("");
	  //이 배열의 저장공간은
	// System.out.print(Arrays.toString(resultArr)); 
	  int saveArr[] =new int[resultArr.length];
	  for(int i=0; i<resultArr.length;i++) {
		  saveArr[i]=Integer.parseInt(resultArr[i]);		  
	  }
	 // System.out.println(Arrays.toString(saveArr));  	  
	  int outPutArr[]=new int[10];
	 
	  for(int i=0;i<saveArr.length;i++) {
		  outPutArr[saveArr[i]]=outPutArr[saveArr[i]]+1;
	  }		  
	 //System.out.print(Arrays.toString(outPutArr)); 
	
	  for(int i=0;i<outPutArr.length;i++) {
		  System.out.println(outPutArr[i]);
	  }
	
	}
}	  	  
	  //세수의 곱은 최소 7자리  최대 9자리
	  //7자리와 8자리 9자리 일떄 분기 처리를 해여함	  
//	 if(resultNum>=1000000&&resultNum<=9999999) {
//		 saveArr=new int[7];	 
//	 }else if(resultNum>=10000000&&resultNum<=99999999) {		 
//		 saveArr=new int[10];		
//		//point  입력값을 index로 사용한다. 
//		 for(int i=0;i<10;i++) {			 
//		//saveArr[Integer.parseInt(resultArr[i])]=saveArr[Integer.parseInt(resultArr[i])]+1;
//			
//			 
//		 }
//		 
//	 }else if(resultNum>=100000000&&resultNum<=997002999) {
//		 saveArr=new int[9];
//		 for(int i=0;i<9;i++) {
//			 saveArr[i]=Integer.parseInt(resultArr[i]);
//			// System.out.println(saveArr[i]);
//		 }
//		 
//		 
//	 }
	  	
