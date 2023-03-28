package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Practice_1181 {

	public static void main(String[] args) throws IOException {
		// 1.길이가 짧은 것부터
		// 2. 길이가 같으면 사전 순으로
		// 3. 중복된 단어는 하나만 남기고 제거해야 한다.
		// 알고리즘 흐름도
		// 입력받기->순서대로 정렬하기-> 중복 제거하기-> 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String[] arr = new String[num];

		for (int i = 0; i < num; i++) {
			arr[i] = br.readLine();
		}

		// Arrays.sort는 기본적으로 인자를 2가지를 받는다.
		// Arrays.sort(arr,new Comparator<>)
		// 보편적으로 하나만 줄 경우 Comparator은 default 값으로 적용되어 실행이 되는 것

		// 그러나 문자열을 정렬하기 위해서는 따로 재정의 필요

		Arrays.sort(arr, new Comparator<String>() {// Comparator객체를 생성하여 삽입
			// Comparator에 있는 메서드인 compare 오버 라이딩하기
			// arr[0] ,arr[1] || arr[1] ,arr[2] || arr[2] ,arr[3]
			// String s1, String s2 에 들어가게 된다.
			@Override
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) {
					// 문자열을 길이가 같다면
					// 사전순으로 정렬하기
					return s1.compareTo(s2);// compareTo는 Comparator 내부에 있는 메서드
				} else {
					return s1.length() - s2.length();
					// 문자열 길이 정렬하기
					// 해당 반환값이 양수면 s1이 큰값이 된다.
				}

			}
		});

		// 중복제거
		System.out.println(arr[0]); //0번 인덱스 배열은 출력해야지
		for (int i = 1; i < num; i++) {// 반복문을부터 1부터 돌리는 이유는 0번 인덱스 배열의 값은 중복고려를 안해도 되니까   
			if (!arr[i].equals(arr[i - 1])) {//arr[1]과 arr[0]이 같지 않다면 출력해라
				System.out.println(arr[i]);
			}
		}

	}
}