package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_5622 {

	public static void main(String[] args) throws IOException{
		// 5622  문자열  브론즈2   다일얼문제  스트링 토큰 나이저로 할수 있을것 같은데...
		BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
		String str=br.readLine();		
		int outPutSum=0;
		String[] arrStr=str.trim().split("");
		
		for(int i=0;i<arrStr.length;i++) {
			if(arrStr[i].equals("A")||arrStr[i].equals("B")||arrStr[i].equals("C")) {
				outPutSum+=2;
			}else if(arrStr[i].equals("D")||arrStr[i].equals("E")||arrStr[i].equals("F")) {
				outPutSum+=3;				
			}else if(arrStr[i].equals("G")||arrStr[i].equals("H")||arrStr[i].equals("I")) {
				outPutSum+=4;				
			}else if(arrStr[i].equals("J")||arrStr[i].equals("K")||arrStr[i].equals("L")) {
				outPutSum+=5;				
			}else if(arrStr[i].equals("M")||arrStr[i].equals("N")||arrStr[i].equals("O")) {
				outPutSum+=6;				
			}else if(arrStr[i].equals("P")||arrStr[i].equals("Q")||arrStr[i].equals("R")||arrStr[i].equals("S")) {
				outPutSum+=7;				
			}else if(arrStr[i].equals("T")||arrStr[i].equals("U")||arrStr[i].equals("V")) {
				outPutSum+=8;				
			}else if(arrStr[i].equals("W")||arrStr[i].equals("X")||arrStr[i].equals("Y")||arrStr[i].equals("Z")) {
				outPutSum+=9;				
			}
		
		}
		System.out.println(outPutSum+arrStr.length);
		
		
	}

}
