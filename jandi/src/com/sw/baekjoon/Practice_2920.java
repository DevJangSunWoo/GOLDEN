package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_2920 {
		// 순차적으로 숫자가 올라가면   ascending    순차적으로 숫자가 내려가면 descending  그외의 경우는 mixed 
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int[] arr = new int[8];  //배열 선언
	        //StringTokenizer 띄어쓰기를 기준으로 문자열을 분리
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        //배열에 입력받기
	        for (int i = 0; i < 8; i++) {
	            arr[i] = Integer.parseInt(st.nextToken());
	        }
	        
	        //불리언 변수 선언
	        boolean asc = true;
	        boolean dsc = true;
	        for (int i = 0; i < 7; i++) {
	            //다음 숫자가 더 크면 descending은 안 된다
	            if (arr[i+1] > arr[i]) 
	            {dsc = false;}
	            //다음 숫자가 더 작으면 ascending은 안 된다
	            if (arr[i+1] < arr[i]) 
	            {asc = false;}
	        }
	        //위과정이 거치고도 아직도 true이면
	        if (asc) {
	            System.out.print("ascending");
	        } else if (dsc) {
	            System.out.print("descending");
	        } else {
	            //asc, dsc 둘 다 아니면 mixed 출력
	            System.out.print("mixed");
	        }

	}

}
