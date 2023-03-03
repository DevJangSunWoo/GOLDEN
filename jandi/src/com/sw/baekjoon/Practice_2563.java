package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_2563 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
//		가로세로가 길이가 100인 도화지  좌표로 따지면   x는 0부터 10까지 가능   y는   x는 0부터 10 가능
//		우선 이 도화지를 나타낼 boolean형 배열을 크기가 [101][101]인 배열 arr을 선언한다.   
//		만약에 어떤 수 x, y에 대해 arr [x][y]가 true면 그 부분은 색종이가 붙어져 있다는 것을 의미한다.

//		for-loop을 이용해서 색종이 N개를 입력받는다. 
//		그리고 색종이의 왼쪽 변의 점 x, y가 주어지면 (x, y)부터 (x + 9, y + 9)까지 색종이가 붙어져 있다는 것을 의미한다. //예시 내가 (1,1)을 받으면 (10,10)까지 색종이를 차지하고 있다는 의미
//		따라서 이중 for-loop을 이용해 arr [x][y]부터 arr [x+9][y+9]를 true로 시켜준다.  // 그좌표들을 이루는 영역을  true로 변환시켜준다.
//		그리고 맨 마지막에 true인 개수를 출력하면 된다. // 좌표들의 개수를 출력하면 그것은 결국 영역 넓이가 값이 된다.
		
		int count = 0;  // 좌표들의 개수 검은 영역의 넓이
        int n = Integer.parseInt(br.readLine());  //색종이 개수
        boolean[][] arr = new boolean[101][101];  //도화지
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            //(x,y)부터 (x+9, y+9)까지의 영역을 하나씩 체크한 후 총 넓이에 더해준다
            for (int j = x; j < x+10; j++) { // 예시 (x,y)가  (1,1)이면   (10,10) 까지의 영역을 하나씩 체크하고  count 에 더해주기
                for (int k = y; k < y+10; k++) {
                    if (!arr[j][k]) { // arr[j][k] 가 false 일떄만 즉 비어있을떄만
                        arr[j][k] = true;  // arr[j][k]를 true로 만들어라.
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
		
	}

}
//생각시도
//애초에 차이가 10보다 작으면 겹친다
//x,y  하나라도 차이가 10이상이면 안겹친다.	
	
//	3
//	3 7
//	15 7
//	5 2

//int num= Integer.parseInt(br.readLine());
//int[][] arr=new int[num][2]; 
//
//for(int i=0;i<num;i++ ) {
//	String str=br.readLine();  //3 7 
//	String [] strArr=str.trim().split(" ");//[3,7]
//	for(int j=0;j<strArr.length;j++) {
//			arr[i][j]=Integer.parseInt(strArr[j]);				
//	}
//}
////System.out.println(Arrays.toString(arr[0]));
////System.out.println(Arrays.toString(arr[1]));
////System.out.println(Arrays.toString(arr[2]));
//
////내가 비교해야하는 거는(0.0) (1,0) (2,0)
//for(int i=0;i<arr[0].length;i++) {// 0 1 
//	for(int j=0;j<arr.length;j++) {// 0 1 2
//		System.out.println(arr[j][i]);
//		
//	}
//}