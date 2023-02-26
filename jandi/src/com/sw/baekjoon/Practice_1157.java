package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Practice_1157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine().toLowerCase();
	
		char arr[]=str.toCharArray();
		
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		for(int i=0;i<arr.length;i++) {
			if(!hm.containsKey(arr[i])) {
				hm.put(arr[i], 0);				
			}
			
			hm.put(arr[i], hm.get(arr[i])+1);
		}
		
		
		
		int keyCount=0;
		for(Character ch :hm.keySet()) {
			System.out.println(ch+" "+hm.get(ch));
//			p 1
//			s 4
//			i 4
//			m 1
			keyCount++;
			
		}
		
			//새로운 맵을 만들까
		
		
	}

}

//String[] arr=str.trim().split("");//예제 baa [b,a,a,]
////count 배열?
////hash Map 이용해서  key 값 b   value값 1   
////value 값은 count를 이용할까?
////중복 카운트된 수를 배열로?
//
//String[] alphabet=new String[arr.length];
//int[] duplicatedNum=new int[arr.length];
//
//int cnt=0;//필터 변수
//for(int i=0;i<arr.length;i++) {
//	for(int j=1;j<arr.length;j++) {
//		if(arr[i]==arr[j]) cnt++;		
//		
//		if(cnt>=2) {
//			System.out.println(arr[i]+" "+cnt);
//		
//		}
//	}//두번재 포문		
//}
