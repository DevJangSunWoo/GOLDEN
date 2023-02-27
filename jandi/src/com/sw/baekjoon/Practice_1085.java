package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice_1085 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String[] strArr=str.trim().split(" ");
		int [] intArr =new int[strArr.length];
		int[] lengths=new int[4];
		for(int i=0;i<strArr.length;i++) {
			intArr[i]=Integer.parseInt(strArr[i]);  //[1 1 5 5]
			if(i==0) {
				lengths[i]=intArr[i];
			}else if(i==1) {
				lengths[i]=intArr[i];
			}else if(i==2) {
				lengths[i]=intArr[i]-intArr[i-2];
			}else {
				lengths[i]=intArr[i]-intArr[i-2];
			}
		
		}
		//int testNum=intArr[2]-intArr[0];
		//int testNum2=intArr[3]-intArr[1];
		//System.out.println(Arrays.toString(lengths));
		
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<lengths.length;i++) {			
			if(lengths[i]<min) {
				min=lengths[i];
			}
		}
		System.out.println(min);
		
		
	}

}
