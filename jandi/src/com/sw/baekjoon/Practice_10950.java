package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_10950 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 브론즈5 10950 반복문  개행문자 \n
		BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb =new StringBuilder();
		int sum=0;
		for(int i=0;i<num;i++) {
			st=new StringTokenizer(br.readLine()," ");
			sum+=(Integer.parseInt(st.nextToken()))+(Integer.parseInt(st.nextToken()));
			sb.append(sum).append("\n");
			sum=0;
		}
		br.close();
		System.out.println(sb);
	}

}
