package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class windmillSoft_4 {

	public static void main(String[] args) throws IOException {
		// 카드 관리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		boolean reserveCheck=false;// 대기목록유무
		ArrayList<Integer> reserveList = new ArrayList<Integer>();
		
		for (int i = 0; i < m; i++) {
			StringTokenizer stSecond = new StringTokenizer(br.readLine());
			String category = stSecond.nextToken();
			int won = Integer.parseInt(stSecond.nextToken());
			
			if (category.equals("deposit")) {
				n += won;
			} else if (category.equals("pay")) {
				if (won > n) {
					n -=0;
				} else {
					n -= won;
				}
			}else if(category.equals("reservation")) {
				if(won>n||reserveCheck==true) {
					n -=0;// 거래되지 않는다.
					reserveList.add(won); //대기목록에 추가
					reserveCheck=true; // 대기목록의 유무 있음으로 변경
				}else if(n>=reserveList.get(0)) { // #contains 써야할지도
					n-=reserveList.get(0);   // 첫번쨰 대기목록 금액 결제 
					reserveList.remove(0);// 대기목록에서 삭제
				}
			}
		
		}
		System.out.println(n);
	}

}
