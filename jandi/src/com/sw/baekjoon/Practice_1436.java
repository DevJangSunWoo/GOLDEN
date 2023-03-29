package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practice_1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 종말의 수란 어떤 수에 6이 적어도 3개 이상 연속으로 들어가는 수를 말한다.
		// 일반화해서 생각하면, N번째 영화의 제목은 세상의 종말 (N번째로 작은 종말의 수) 와 같다.
		// 첫번째 영화 666은 666이 들어가 있는 수중 첫번쨰로 작은수
		// 두번째 영화 1666은 666이 들어가 있는 수중 두번쨰로 작은수
		// (3,2666) (4,3666) (5,4666) (6,5666) // 5666 다음 6666이 아니라 6660 부터 시작해야한다.
		// (7,6660) (8,6661) (9,6662) (10,6663) (11,6664) (12,6665) (13,6666) (14,6667)
		// (15,6668) (16,6669) (17,6669)

		// 5자릿수도 마찬가지이다.
		// 10666, 11666, 12666, 13666, 14666, 15666,
		// 16660, 16661, 16662, ⋯, 16669, 17666, ⋯

		// 다만 5자릿수의 경우는 경우의 수가 더 추가된다.
		// 64666, 65666, 66600, 66601, ⋯, 66659, 66660, ⋯

//		이때 1 을 prev_digit (가장 선수에 있는 자릿수) 라고 하고, prev_digit 을 증가시키면서 count를 센다.
//
//		그러다가 prev_digit 이 6이 될 경우 6660 이라고 가정하여 따로 반복문에 0~9 까지 count 를 증가시킨다. 해당 반복문이 종료되면 다시 prev_digit 을 증가시킨다.
//
//		그 다음에는 prev_digit이 66 일경우 위와 같이 하되, 0~100까지 반복하면서 count를 돌려준다.
//
//		위 과정중에 N 이 count 랑 같아지면 prev_digit 뒤에 나머지 수를 붙여 출력하면 된다.
//
//		 
//
//		이런식으로 prev_digit 의 경우에 따라 조건문을 달아 반복하면 된다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		if (N > 1) {
			func(N);
		} else {
			System.out.println(666);
		}

	}

	public static void func(int n) {
		int count = 1;
		int prev_digit = 0; // 선수 자릿수
		int num = 0; // 선수 자릿수를 제외한 나머지 뒷 자릿수

		/*
		 * 
		 * 설명 표현 방법 '_'(언더바)를 기준으로 표현한다. ex) (prev_digit) _ num 이 때, 자릿수에 따라서 num 은 0 또는
		 * 600, 660, 666 을 갖는다.
		 * 
		 */
		while (true) {

			/*
			 * 선수 자릿수가 X...666X 이면서 X...6666 이 아닐 경우 (ex. 6660_000, 6660_001, ...)
			 */
			if (((prev_digit % 10000) / 10) == 666 && prev_digit % 10 != 6) {
				for (int i = 0; i < 1000; i++) {
					if (count == n) {
						System.out.print(prev_digit * 1000 + num);
						return;
					}
					num++;
					count++;
				}
				prev_digit++;
			}

			// 선수 자릿수가 X...666 일 경우 (ex. 666_000, 1666_004, ...)
			else if (prev_digit % 1000 == 666) {
				num = 0;
				for (int i = 0; i < 1000; i++) {

					if (count == n) {
						System.out.print(prev_digit * 1000 + num);
						return;
					}
					count++;
					num++;
				}
				prev_digit++;
			}

			// 선수 자릿수가 X...66 일 경우 (ex. 66_600, 166_600, ...)
			else if (prev_digit % 100 == 66) {
				num = 600;
				for (int i = 0; i < 100; i++) {
					if (count == n) {
						System.out.print(prev_digit * 1000 + num);
						return;
					}
					count++;
					num++;
				}
				prev_digit++;

			}

			// 선수 자릿수가 X...6 일 경우 (ex. 6_660, 16_663, ...)
			else if (prev_digit % 10 == 6) {
				num = 660;
				for (int i = 0; i < 10; i++) {
					if (count == n) {
						System.out.print(prev_digit * 1000 + num);
						return;
					}
					num++;
					count++;
				}
				prev_digit++;
			}

			// 그 외의 경우 (ex. 241_666, 23_666 ...)
			else {
				num = 666;
				if (count == n) {
					System.out.print(prev_digit * 1000 + num);
					return;
				}
				count++;
				prev_digit++;

			}
		}
	}

}