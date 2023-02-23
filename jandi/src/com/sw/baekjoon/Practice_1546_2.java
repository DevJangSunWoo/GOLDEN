package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_1546_2 {

	public static void main(String[] args) throws IOException {
		 Double score [] = new Double[1001];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(String.valueOf(br.readLine()));	// 과목의 개수
		
		// 과목 점수 입력 받기
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double maxScore = 0;
		for(int i = 0; i < n; i++)
		{
			score[i] = Double.parseDouble(st.nextToken());
			maxScore = Double.max(maxScore, score[i]);
		}		
		
		double sum = 0.0;
		for(int i = 0; i < n; i++)
			sum += score[i] / maxScore * 100;
		
		double ans = sum / n;
		System.out.println(ans);
	}

}
