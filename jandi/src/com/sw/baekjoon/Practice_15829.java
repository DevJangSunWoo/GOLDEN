package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Practice_15829 {

	public static void main(String[] args) throws IOException {
		//해싱함수 임의의 길이를 갖는 데이터를 고정된 길이의 데이터로 변환시켜주는 함수   -> 보통 암호화 많이 사용됨
		// 아스키 코드 사용
		//반례  50 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));		
		int L = Integer.parseInt(br.readLine()); // 첫쨰줄
		String S = br.readLine(); // 둘쨰줄
		long result = 0;
		long pow = 1;
		for(int i = 0; i < L; i++) {
			result += ((S.charAt(i) - 96) * pow);
			//pow는 31을 매번 곱해준다. 곱해줄때마다 1234567891을 나눠주면 long을 넘지 않을 것이다.
			pow = (pow * 31) % 1234567891; // i가 일일떄 pow 는 31
		}
		System.out.println(result % 1234567891);
		
		
	}

}
//int num=Integer.parseInt(br.readLine());		
//String str=br.readLine();		
//char [] strArr=str.toCharArray();
////System.out.println(Arrays.toString(strArr));
//int [] intArr=new int [strArr.length];
//
//for(int i=0;i<strArr.length;i++) {
//	intArr[i]=strArr[i]-96;
//	
//}
//
////System.out.println(Arrays.toString(intArr));
//
//
//// 문제에서 r은 31로 고정해주었음
////  곱하는 단계마다  % 1234567891 을 적용시켜야함
//long outPut=0;
//for(int i=0;i<num;i++) {
//	outPut+=((intArr[i]*Math.pow(31, i))%1234567891);
//	
//}
//System.out.println(outPut);