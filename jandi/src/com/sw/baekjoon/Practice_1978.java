package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_1978 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		int sosuCount = 0;
		while (st.hasMoreTokens()) {
			int sosu = Integer.parseInt(st.nextToken());

			int count = 0;
			for (int i = 1; i <= sosu; i++) {
				if (sosu % i == 0) {
					count++;
				}
			}
			if (count == 2) {

				// System.out.println(sosu + "는 소수입니다.");
				sosuCount++;
			}
		}
		
		System.out.println(sosuCount);
	}

}
