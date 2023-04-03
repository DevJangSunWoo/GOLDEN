package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice_2309 {

	public static void main(String[] args) throws IOException {
		// 처음생각 내가 뽑을수 있는 조합의 수는 9개중 7개 뽑는것 //9C7
		// 두번쨰 생각
		// 먼저 9명의 값을 더한 다음에 두명의 값을 sum에서 뺸다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) { // i가 0일때 j는 1 // i가 1일떄 j는 2
				if (sum - arr[i] - arr[j] == 100) {
					arr[i] = 0; // 거짓된 값을 0으로 초기화 하고
					arr[j] = 0; // 거짓된 값을 0으로 초기화 한다.
					Arrays.sort(arr); // 정렬
				}
			}
		}		
		StringBuilder sb=new StringBuilder();
		for(int k = 2; k < 9; k++) {
			sb.append(arr[k]).append("\n");			
		}
		System.out.println(sb);
	}

}
