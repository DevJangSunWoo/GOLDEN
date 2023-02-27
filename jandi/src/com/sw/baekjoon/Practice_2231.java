package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice_2231 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 약수개념과는 조금 다른듯?

		// 198 = 198 + 1 + 9 + 8 = 216
		// 예로들어 198 이라는 생성자가 주어졌을 때 198 의 분해합은 198 + 1 + 9 + 8 = 216 이다.
		// 반대로 216의 생성자는 여러가지 198 이 될 수도 있고 207 이 될 수도 있다.

		// 즉 생성자는 1개 이상이다. 최솟값을 찾이 위해서는 작은 수 부터 찾아야 한다는 것을 알 수 있다.

		// 가장 기본적인 방법은 1 부터 입력받은 N까지 한 개 씩 모두 대입해보는 것이다.
		// 브루트 포스 방식

		// 만약 탐색 도중 생성자를 찾은면 종료하고 해당 생성자를 출력하며,N을 넘길 떄 까지 생성자를 잦지 못하면 0을 출력한다

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		String str;
		String[] strArr;
		int ParseNum = 0;
		int decompositionSum = 0; // 분해합 변수
		int[] creationArr = new int[N + 1];// 생성자를 담을 배열
		int outPutCount = 0; // 생성자가 없을떄를 판별하는 변수
		for (int i = 1; i <= N; i++) {
			str = Integer.toString(i); // 예를들어 i가 198이고
			strArr = str.trim().split(""); // 이상태에서는 String 배열 [1,9,8]
			decompositionSum = i; // 분해합 변수에 일단 자기자신을 넣어준다.
			for (int j = 0; j < strArr.length; j++) {
				ParseNum = Integer.parseInt(strArr[j]);// 이상태면 int 형 배열 [1,9,8 ]
				decompositionSum += ParseNum;// 분해합 변수에 추가적으로 각 자리의 숫자를 더해준다.
			}
			if (decompositionSum == N) {
				// System.out.println(i);
				creationArr[i] = i;// 생성자를 담을 배열에 조건에 맞는 i를 집어넣는다.
				outPutCount++;
			}
		}
		// System.out.println(Arrays.toString(creationArr));

		// 물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다. 반대로, 생성자가 여러 개인 자연수도 있
		// 첫째 줄에 답을 출력한다. 생성자가 없는 경우에는 0을 출력한다.
		// 만약에 조건에 맞는 i가 없을 경우 creationArr 배열 내부 요소의 값들은 모두 0이 되겠지

		int min = Integer.MAX_VALUE; // 2147483647
		if (outPutCount > 0) {
			for (int i = 0; i < creationArr.length; i++) { // [0,0]
				if (creationArr[i] < min && creationArr[i] != 0) {
					min = creationArr[i];
				}
			}
			System.out.println(min);
		} else {
			System.out.println(0);
		}
	}
}

//숏코딩
//Scanner scan=new Scanner(System.in);
//int N=scan.nextInt();  //216
//for(int i=N/2;i<N;i++) 108<= i <216
//{
		//	int a=i; 108
		//	int sum=a; 108
		//	while(a>0) 108>0 이니까 true
		//	{
		//		sum=sum+a%10;   108+ 108%10 -> 116
		//		a/=10; 108/10    -> 10
		//	}
		//	if(sum==N)
		//	{
		//		System.out.println(i);
		//		return;
		//	}
//}
//System.out.println(0);
