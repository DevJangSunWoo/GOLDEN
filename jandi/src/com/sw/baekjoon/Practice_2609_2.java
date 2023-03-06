package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_2609_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub  최대공약 최소공배수 재귀방식 유클리드 호제법 다른 풀이법
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
 
		int d = gcd(a, b);
 
		System.out.println(d);
		System.out.println(a * b / d);
	}
	// 최대공약수 반복문 방식
		public static int gcd(int a, int b) {
	 
			while (b != 0) {  // 즉 b가 0이 아니면 계속 반복한다.   어느순간  b가 0이면 빠져나와  a를 반환한다.
				int r = a % b; // 나머지를 구해준다.
	 
				// GCD(a, b) = GCD(b, r)이므로 변환한다.
				a = b;
				b = r;
			}
			return a;
		}
}
