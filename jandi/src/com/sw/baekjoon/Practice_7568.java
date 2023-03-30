package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Practice_7568 {

	public static void main(String[] args) throws IOException {
		// 덩치는 몸무게와 키가 모두 클 떄 크다고 판별
		// 자기보다 덩치가 큰 인원의 갯수 k
		// 덩치 등수는 k+1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		int[] kg = new int[num];
		int[] height = new int[num];

		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			kg[i] = Integer.parseInt(st.nextToken());
			height[i] = Integer.parseInt(st.nextToken());
		}

		// System.out.println(Arrays.toString(kg));
		// System.out.println(Arrays.toString(height));
		int countK = 0;
		int bruteKg=0; 
		int bruteheight=0;
		for (int i = 0; i < num; i++) {
			 bruteKg = kg[i];
			 bruteheight = height[i];
			for (int j = 0; j < num; j++) {
				if (bruteKg > kg[j] && bruteheight > height[j]) {
					countK++;
				}
			
			}
			System.out.println(countK);
			countK=0;
		}

	}

}
