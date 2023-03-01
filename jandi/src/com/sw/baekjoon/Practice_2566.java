package com.sw.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_2566 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] grid =new int[9][9];
		
		//System.out.println(grid.length);
		
		for(int i=0;i<grid.length;i++) {
			String strRow=br.readLine();
			String[] arrRow=strRow.trim().split(" ");
			int [] arrRowInt=new int[arrRow.length]; 
			for(int j=0;j<arrRow.length;j++) {
				arrRowInt[j]=Integer.parseInt(arrRow[j]);
				grid[i][j]=arrRowInt[j];			
			}			
		}
		
		int max=Integer.MIN_VALUE;
		int rowNum=0;
		int colNum=0;
		for(int i=0; i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) { // grid[i].length
				if(grid[i][j]>max) {
					max=grid[i][j];
					 rowNum=i+1;   // 인덱스번호 고려해서 +1 하기
					 colNum=j+1;
				}	
			}					
		}
		System.out.println(max+"\n"+rowNum+" "+colNum);  // 개행문자 "\n"		
	}
}