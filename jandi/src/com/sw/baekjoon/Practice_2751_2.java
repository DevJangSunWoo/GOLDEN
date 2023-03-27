package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Practice_2751_2 {

	public static void main(String[] args) throws IOException {
		//Arrays.sort 로 풀면 시간초과가 난다.
		//Arrays.sort() 의 경우 dual-pivot Quicksort 알고리즘을 사용한다고 했다.
		//물론 평균 시간복잡도가 O(nlogn) 이고 매우 빠른 알고리즘인 것은 맞다.
		//최악의 경우 시간복잡도는 O(n2) 이라는 점을 기억해야한다.						
		//O(n2)이 걸리도록 저격한 데이터가 있다  그 데이토에 걸리면 데이터가  에러가 난다.
		
		//최악의 경우에도 O(nlogn) 을 보장하거나 혹은, O(n) 에 가까운 정렬 알고리즘을 사용해야 한다.
		
		//1.첫번쨰는 Collections.sort()를 쓰는 방법이다. Timesort이다. 
		// Timesort의 경우 합병 및 삽입정렬 알고리즘을 사용한다.
		//이헐게 두가지 섞여있는 정렬 알고리즘을 hybrid sorting algorithm 이라고 함.
		
		//합병 정렬(Merge Sort)의 경우 최선,최악 모두 O(nlogn)을 보장하고
		//삽입정렬(Insertion sort)의 경우 최선의 경우는 O(n) , 최악의 경우는 O(n2) 이다.
		
		//두 정렬 모두 안정 정렬(stable sort)이기 때문에 Timsort를 hybrid stable sorting algorithm이라고도 한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		// list 계열 중 하나를 쓰면 된다.
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		
		for(int value : list) {
			sb.append(value).append('\n'); // 정렬된 값과 개행문자를 append 한다. 
		}
		System.out.println(sb);
		
		
		
	}

}
