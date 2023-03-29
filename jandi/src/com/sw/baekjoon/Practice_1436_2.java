package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_1436_2 {

	public static void main(String[] args)  throws IOException{
		//브루트 포스 알고리즘
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
 
		int num = 666;
		int count = 1;
        
		while(count != N) { //내가 입력한수와 count가  다를떄 실행  //N=2일떄 
			
			num++;  //667  668  669 ....     
			//1666 
			if(String.valueOf(num).contains("666")) {
				count++;// count는 여전히 1 
				//num이 1666일때  count는 2가된다.
			}
			//그러니 while문 다시 반복됨
		}
		System.out.println(num);  // 내가 1을 입력했으면 666을 출력한다.
		

	}

}
