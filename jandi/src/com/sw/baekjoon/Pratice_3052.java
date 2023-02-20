package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Pratice_3052 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//나머지로 나눈  결과 값들을 어떤 1차원 배열에 집어넣는다.
		int[] arr=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=(Integer.parseInt(br.readLine())%42);
		//System.out.println(arr[i]+" ");
		}
		
		//배열내부의 중복된 요소를 제거한다.
		
		// 중복이 배제된 값을 저장받을 배열
		int[] temp = new int[10];
		
		
	      // 중복이 배제된 회수
			int count = 0;
			
	        	// 중복을 걸러주는 부분
			for(int i = 0; i < arr.length; i++){
				boolean flag = false;
				for(int j = 0; j < temp.length; j++){
					if(arr[i] == temp[j]){
						flag= true;
						//System.out.println(Arrays.toString(temp));
					}
				}
	            	// 중복이 배제된 값이 저장.
				if(!flag){
					temp[count++] = arr[i];
				}
			}		
		//	System.out.println("temp 배열"+Arrays.toString(temp));
			
			
			// 0을 배제 해주기 위한 부분
			int[] result = new int[count];
			for(int i = 0; i < result.length; i++){
				result[i] = temp[i];
			}			
		//	System.out.println("result 배열"+Arrays.toString(result));
			//System.out.println(result.length);
			
			boolean  bl=false;
			for(int  chkZero:arr ) {   // arr을 가지고 돌려야함!!!!
			  if(chkZero==0) {
				  bl=true;
			  }
			}
		
		
		if(bl==true){
			System.out.println(result.length+1);
		}else {
			System.out.println(result.length);
		}
		
		
		
		
		
		
		
		
			 
		
	}

}
