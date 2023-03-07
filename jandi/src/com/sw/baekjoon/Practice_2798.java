package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Practice_2798 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken()); // M값의 기준이

		String secondStr = br.readLine();
		String[] arrStr = secondStr.trim().split(" ");
		int[] array = new int[arrStr.length];
		for (int i = 0; i < arrStr.length; i++) {
			array[i] = Integer.parseInt(arrStr[i]); // [ 5 6 7 8 9]
		}

		// 원소중 3개를 뽑을 조합은 어떻게 될까?
		// 조합은 뽑은 원소가 중복되면 안되기 때문에 앞에서부터 차례대로 원소를 뽑아본다.
		// 단순하게 for 를 3번 돌면 된다. // 삼중 포문
		int n = array.length; // 원소의 개숫

		int sum = 0;
		int count = 0; // lastArr 배열의 인덱스 번호를 명시할 변수
		int nCrNum = combination(n, 3);// 조합의 경우의수
		// System.out.println("조합의 경우의수"+nCrNum);
		int[] lastArr = new int[nCrNum]; // 조합의 합을 담은 새로운 배열을 선언

		for (int i = 0; i < n; i++)

			for (int j = i + 1; j < n; j++)

				for (int k = j + 1; k < n; k++) {

					sum = array[i] + array[j] + array[k];
					count++;
					// System.out.println(count+" "+"합 "+sum); // 합이 순착적으로 증가하면서 나올수도 있고 안나올수도 있으니
					// 정렬 필요함
					lastArr[count - 1] = sum;
				}

		Arrays.sort(lastArr); // 정렬을 해서 값을 순차적으로 만든다.

		int rValue = M;
		int outPutNum = 0;
		for (int i = 0; i < lastArr.length; i++) {
			if (lastArr[i] <= rValue) {
				outPutNum = lastArr[i];
			}

		}
		System.out.println(outPutNum);

	}

	private static int combination(int n, int r) { // 조합의 경우의 수를 표출하는 메소드

		if (n == r || r == 0)
			return 1;
		return combination(n - 1, r - 1) + combination(n - 1, r);

	}

}
