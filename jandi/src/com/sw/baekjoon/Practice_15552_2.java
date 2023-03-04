package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Practice_15552_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
 
		int N = Integer.parseInt(br.readLine());
        
		StringTokenizer st;
 
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
		}
		br.close();
        
		bw.flush(); // 필수적으로 버퍼를 비운 뒤(flush) 닫아줘야한다(close).
		bw.close();
	}

}
