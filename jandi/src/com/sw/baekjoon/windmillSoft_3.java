package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class windmillSoft_3 {

	public static void main(String[] args) throws IOException{
		// 버스 추천하기
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));		
		//첫번쨰줄
		String firstStr=br.readLine();  //현재 시간 입력
		String [] currentTimeArr= firstStr.split(":");
		int currentTotalTime=Integer.parseInt(currentTimeArr[0])*60+Integer.parseInt(currentTimeArr[1]);//현재 시간을 분으로
		
		
		//두번쨰줄
		String secondStr=br.readLine();
		String []secondArr=secondStr.split(" ");
		// 임시배열 temp
		String[] temp=new String[2];
		//최종분을 담는 배열
		int []resultM=new int [secondArr.length];
		for(int i=0;i<secondArr.length;i++) {
		 temp=secondArr[i].split(":");
		 resultM[i]=Integer.parseInt(temp[0])*60+Integer.parseInt(temp[1]);		
		}
		
		Arrays.sort(resultM);// 오름차순으로 정렬
		//System.out.println(Arrays.toString(resultMinite));
		
		br.close();
		
		
		for(int i=0;i<resultM.length;i++) {
			if(resultM[i]>currentTotalTime) {
				System.out.println(resultM[i]-currentTotalTime);  break;
				//break문을 선언해야지   출력값 하나만 출력 가능  
			}					
			
		}

		
	
	}

}
