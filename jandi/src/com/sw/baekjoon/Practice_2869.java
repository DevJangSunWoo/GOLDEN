package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_2869 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new  StringTokenizer(br.readLine());
		int A=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		int V=Integer.parseInt(st.nextToken());
		
		int actualDistance=0;  // 실제거리
		int count=0;   // 도착하는데 걸린날짜
		while(true) {  // 와일문을 이용해 자동으로  실거리를 구한다.
			actualDistance+=A;   // 실제거리를 구한다.
			count++;
			if(actualDistance>=V) break;  // 만약에  V 거리에  도달했다면  while문을 빠져나온다.
			actualDistance-=B;  // 달팽이가 자면서 내려온다.
		}
		
		System.out.println(count);
		
	}

}
