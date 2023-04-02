package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Practice_10814 {

	public static void main(String[] args) throws IOException {
		// 실버5 나이순 정렬  sort Comparator
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		String[][] arr = new String[num][2];
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken(); // 나이
			arr[i][1] = st.nextToken(); // 이름
		}

		Arrays.sort(arr, new Comparator<String[]>() {
			// 나이순으로 정렬
			@Override
			public int compare(String[] s1, String[] s2) { //주소 비교
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}

		});

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < num; i++) {
			sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
		}

		System.out.println(sb);

	}

}