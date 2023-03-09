package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice_2775 {

	public static int[][] APT = new int[15][15]; // 2차원 배열의 공간을 1515 로 만든다.

	public static void main(String[] args) throws IOException {

		// 동적프로그래밍 dp 큰 문제를 작은문제로 나누어 푸는 문제를 일컫는 말
		// Dp는 겹치는 문제가 발생하기 떄문에 메모이제이션이 필요

		// 다이나믹 프로그램의 조건
		// 작은 문제가 반복이 일어나는 경우
		// 같은 문제는 구할 때마다 정답이 같다.

//		가장 첫 줄에 테스트 케이스가 주어진다
//		테스트 케이스(첫 줄) 다음부터 두 줄씩 묶어 k 와 n 이 주어진다.
//		아파트에는 0층부터 있고, 각 층에는 1호부터 시작한다.
//		알고리즘     k 층 n 호 = ( k - 1 ) 층 1 호 + ( k - 1 ) 층 2 호 + ⋯ + ( k - 1 ) 층 n 호				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); // 출력또한 결과를 모아두었다가 한 번에 출력하도록 하기 위해

		make_APT(); // 아파트 만들기 // 이시점에서는 각 호 와 층에 데이터가 삽입됨

		int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수를 받는다.

		for (int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			sb.append(APT[k][n]).append('\n');
		}
		System.out.println(sb);
	}

	public static void make_APT() {
		// 아파트 생성

		for (int i = 0; i < 15; i++) { // 일단 초기화를 시킨다.
			APT[i][1] = 1; // i층 1호
			APT[0][i] = i; // 0층 i호
		}

		for (int i = 1; i < 15; i++) { // 1층부터 14층까지

			for (int j = 2; j < 15; j++) { // 2호부터 14호까지
				APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
			}
		}
	}
}
