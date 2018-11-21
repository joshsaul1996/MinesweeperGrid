package minesweeperGrid;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class MineSweeperGrid {
	
	public static void main(String[] args) {
		Random r = new Random();
//		//Scanner s = new Scanner(System.in);
//		System.out.println("How many rows would you like in the grid?");
//		int gridRows = s.nextInt();
//		System.out.println("How many columns would you like in the grid?");
//		int gridColumns = s.nextInt();
//		System.out.println("How many mines would you like?");
//		int mineAmount = s.nextInt();
//		
		char[][] mineGrid = new char [10][10];
		
//		for (char[] n : mineGrid){
//			Arrays.fill(n, '0');
//		}
		
		for(int i = 0; i < 10; i++) {
			for( int j =0; j <10; j++) {
				mineGrid[i][j] = 'O';
				
				
			}
		}
		
		int mineAmount = r.nextInt(10) + 1;
		for(int i = 0; i < mineAmount; i++){
			int x = r.nextInt(10)+1;
			int y = r.nextInt(10+1);
			mineGrid[x][y] = 'X';}
				
		for(int i = 0; i < 10; i++) {
			System.out.println();
			for( int j =0; j <10; j++) {
				System.out.print(mineGrid[i][j]);}}
		
		
	}
}
