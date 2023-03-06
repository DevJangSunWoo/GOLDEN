package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_2609 {
		// 유클리드 호제법
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub     최대공약 최소공배수 재귀방식 유클리드 호제법
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());          
		int a= Integer.parseInt(st.nextToken());  //24
		int b= Integer.parseInt(st.nextToken());  //18
		int d = gcd(a, b);	// 최대공약수
		 
		System.out.println(d);
		System.out.println(a * b / d); // 최소공배수
		
	}

	// 최대공약수 재귀 방식
		public static int gcd(int a, int b) {
			if (b == 0)
				return a;
	            
			// GCD(a, b) = GCD(b, r)이므로 (r = a % b)
			return gcd(b, a % b);   //(18,6)  -> (6,0) 이상태에서 위 이프문에 걸리면  결국에 반환되는 값은 a이다. 
		}
		
		
		
}


//		int first=x%y;	 // 나머지	
//		int second=y%first;  //나머지2
//		//System.out.println(first+" "+second);
//		int maxCommonNum=0; //최대 공약수
//		
//		if(second==0) {
//			//System.out.println(first);
//			maxCommonNum=first;
//		}else if(second!=0) {
//			if((first%second)==0) {
//				//System.out.println(second);
//				maxCommonNum=second;
//			}
//		}
//		
//		//최소공배수
//		int minCommonNum=(x/maxCommonNum)*(y/maxCommonNum)*maxCommonNum ;
//		
//		System.out.println(maxCommonNum);
//		System.out.println(minCommonNum);