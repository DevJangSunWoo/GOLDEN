package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Practice_4153 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	while(true) {
		String str=br.readLine();
		String[] strArr=str.trim().split(" ");
		int [] intArr =new int[strArr.length];
		for(int i=0;i<strArr.length;i++) {
			intArr[i]=Integer.parseInt(strArr[i]);			
		}
		
		Arrays.sort(intArr);
	//	System.out.println(Arrays.toString(intArr));
		if(intArr[0] == 0 && intArr[1] == 0 && intArr[2] == 0) break;
		if(intArr[0]>0&&intArr[1]>0&&intArr[2]>0) {
			if(intArr[2]*intArr[2]==(intArr[0]*intArr[0]+intArr[1]*intArr[1])) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
				}
			
			}
		}	
	}
}
//while(true) {
//	StringTokenizer st = new StringTokenizer(br.readLine()," ");
//	
//	int x = Integer.parseInt(st.nextToken());
//	int y = Integer.parseInt(st.nextToken());
//	int z = Integer.parseInt(st.nextToken());
//	
//	
//	// 0 0 0 을 입력받으면 종료
//	if(x == 0 && y == 0 && z == 0) break;
//	
//	
//	if((x * x + y * y) == z * z) {
//		System.out.println("right");
//	}
//	else if(x * x == (y * y + z * z)) {
//		System.out.println("right");
//	}
//	else if(y * y == (z * z + x * x)) {
//		System.out.println("right");
//	}
//	else {
//		System.out.println("wrong");
//	}
//	
//}