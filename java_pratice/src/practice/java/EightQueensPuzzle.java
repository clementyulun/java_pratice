package practice.java;

import java.util.ArrayList;
import java.util.Arrays;

public class EightQueensPuzzle {
	
	private ArrayList<String> results = new ArrayList<String>();
	
	private class Board{
		private byte[][] board; // Nothing=0, Prohibited=num_queen
		private byte num_queens;
		private int lastQueen_r, lastQueen_c;
		public int try_num = 0;
		
		Board(){
			board = new byte[8][8];
			for(var row : board) {
				Arrays.fill(row, (byte)0);
			}
			num_queens = 0;
			lastQueen_r = 0;
			lastQueen_c = 0;
		}
		
		boolean placeQueen(int num_row, int num_column) {
			if(board[num_row - 1][num_column - 1] == 0) {
				// Place the Queen
				num_queens ++;
				lastQueen_r = num_row;
				lastQueen_c = num_column;
				// Assign the prohibited squares 
				for(int r = 0; r < 8; r++) {
					for(int c = 0; c < 8; c++) {
						if(r == num_row - 1 || c == num_column - 1 || Math.abs(r - (num_row-1)) == Math.abs(c - (num_column-1))) {
							if(board[r][c] == 0) board[r][c] = num_queens;
						}
					}
				}	
				return true;
			}else{
				return false;
			}
			
		}
		
		void replaceLastQueen() {	
			// Unassign the prohibited squares 
			for(int r = 0; r < 8; r++) {
				for(int c = 0; c < 8; c++) {
					if(board[r][c] == num_queens) {
						board[r][c] = 0;
					}
				}
			}
			num_queens--;
		}
		
		public int getNum_Queens() {
			return num_queens;
		}
		
		public String toString() {
			StringBuffer s = new  StringBuffer();
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j++) {
					s.append(String.format("%d ", board[i][j]));
				}
				s.append(String.format("%n"));
			}
			s.append(String.format("%n"));
			return s.toString();
		}
			
	}
	
	private void placeNextQueen(Board board) {
		for(int i = 1; i <= 8; i++) {
			for(int j = 1; j <= 8; j++) {
				if(board.placeQueen(i, j)) {
					board.try_num ++;
					if(board.num_queens == 8) {
						results.add(board.toString());
						board.replaceLastQueen();
						break;
					}else {
						placeNextQueen(board);
					}	
				}
			}
		}
		board.replaceLastQueen();
	}	
	
	public static void main(String[] args) {
		EightQueensPuzzle puzzle = new practice.java.EightQueensPuzzle();
		Board board = puzzle.new Board();
		puzzle.placeNextQueen(board);
//		for(var result : puzzle.results) {
//			System.out.print(result);
//		}
		System.out.printf("%d results.", puzzle.results.size());
		System.out.printf("try %d times", board.try_num);
	}

}
