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
		
		//덩치 순위를 담을 배열 생성
		int[] dungchiRank = new int[num];
		 // 배열 i값과 배열 나머지값 비교하며 순위 설정
        for (int i = 0; i < num; i++) {
        	dungchiRank[i] = 1;  //   1로 초기화 한다.
        	for (int j = 0; j < num; j++) {  //  같은 순위가 나오는 것도 고려가능
            	// 배열의 i값보다 큰 값이 있으면 i값에 해당하는 순위 배열의 i값을 1씩 올려준다.
        		if (kg[i] < kg[j]&&height[i] < height[j]) { //  몸무게와  키를 고려
        			dungchiRank[i] = dungchiRank[i] + 1;
        		}
        	}
        }
        StringBuilder sb= new StringBuilder();
		for(int i=0;i<num; i++) {
			sb.append(dungchiRank[i]).append(" ");
		}
		System.out.println(sb);

	}

}
