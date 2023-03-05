package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_10250 {
	//브론즈3 acm 호텔 // W 는 그냥 버린다. N % H == 0 나머지 0일떄 분기처리
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 브론즈3 ACM호텔
		// 필요개면 유추 -> 좌표 , 2차원 배열
		// YYXX -> YY는 층수 XX 엘레베이터서의 걸음걸이
		// 조건 1 거리가 같을떄는 아래층 방 선호
		// 조건2실질적으로 내가 걷는걸음수를 고려 -> 층의 수와 상관없이 걷는걸이 즉 XX를 기준으로

		// 시도1 Arrays.fill() 함수 이용하기
//		boolean [][] acm=new boolean[12][6] ;
//		for(int i=0; i<10;i++) {
//			Arrays.fill(acm[i],true);
//		}
//		
//		 System.out.println(Arrays.toString(acm[2]));

		// 시도2 수학적 규칙이용 나머지와 나눈수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());	// 테스트 케이스
 
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
			int H = Integer.parseInt(st.nextToken());
			st.nextToken();			// W 는 그냥 버린다.
			int N = Integer.parseInt(st.nextToken());
 
			if (N % H == 0) {
				sb.append((H * 100) + (N / H)).append('\n');
 
			} else {
				sb.append(((N % H) * 100) + ((N / H) + 1)).append('\n');
			}
		}
		System.out.print(sb);
		
		
	}
}
//Y층 구하기
//Ndmf H로 나눈 나머지 값이 층 수 이다.
//유의 할점은 나머지 가 0 일떄
//  호수는 YXX 또는 YYXX 에서 볼 수 있듯이 최소 100의 자릿수부터 시작하므로, Y 에 100을 곱해주면 된다.
//int Y;
//if(N%H==0) {
//	Y=H*100;
//}else {
//	Y=(N%H)*100;
//}
//X거리구하기
//( N / H ) + 1 이 X 
//유의할점  N = 6 이고, H = 6 이라면?
//X는 1이어야하지만  답이 2가 나와버림
//N % H = 0 일 때는 + 1 을 더해주지 않고 그냥 ( N / H ) 만 해주면 된다.

//int X;
//if(N%H==0) {
//	X=N/H;
//}else {
//	X=(N/H)+1;
//}