package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_11050 {
	// 이항계수 -> 조합을 이용
	// 메모이제이션 : 프로그램이 동일한 계산을 반복해야 할 떄, 이전에 계산한 값을 메모리에
	// 저장함으로써 동일한 계산의 반복 수행을 제거하여 프로그램 실행 속도를 빠르게 하는 기술이다.
	// 동적 계획법의 핵심이 되는 기술이다.

	static int[][] dp;
	
	public static void main(String[] args)throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		dp= new int[N+1][K+1];
		
		System.out.println(BC(N,K));	
	}
	static int BC(int n,int k) {
		// 이미 풀었던 sub문제일 경우 값을 재활용
				if (dp[n][k] > 0) {  //이미 배열에 값이 있다면 재활용한다.
					return dp[n][k];
				}
				
				//1번과 2번 성질의 이용하여  조합의 재귀함수를 만든다.
				
				// 2번 성질   nC0 = nCn = 1
				if (k == 0 || n == k) {
					return dp[n][k] = 1;
				}
				
				// 1번 성질   // nCr = n-1Cr-1 + n-1Cr
				return dp[n][k] = BC(n - 1, k - 1) + BC(n - 1, k);
	}
	
	
	
}
