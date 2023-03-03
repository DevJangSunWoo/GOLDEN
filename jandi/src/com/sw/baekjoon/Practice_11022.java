package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_11022 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {
			String str = br.readLine();
			String[] strArr = str.trim().split(" ");
			int[] intArr = new int[strArr.length];
			int sum = 0;
			for (int j = 0; j < strArr.length; j++) {
				intArr[j] = Integer.parseInt(strArr[j]);
				sum += intArr[j];
			}
			System.out.println("Case #" + (i + 1) + ":" + " " + intArr[0] + " + " + intArr[1] + " = " + sum);

		}

	}
}