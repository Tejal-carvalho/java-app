package com.techlab.game.test;

import java.util.Scanner;

import com.techlab.game.Board;
import com.techlab.game.CellAlreadyMark;
import com.techlab.game.Mark;
import com.techlab.game.Result;
import com.techlab.game.ResultAnalyzer;

public class GameTest {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String[][] board;
		int cellno;
		boolean resultflag = false;
		Board b = new Board();
		b.setInitialBoard();
		board = b.getBoard();
		printboard(board);
		for (int i = b.getStartIteration(); i < b.getMaxIteration(); i++) {
			if (i % 2 == 0) {
				System.out.println("Player 1 \nEnter cell(1-9)");
				cellno = sc.nextInt();
				try {
					b.setBoard(cellno, Mark.X);
				} catch (CellAlreadyMark e) {
					i--;
					System.err.println(e);
				}

				board = b.getBoard();
				printboard(board);
				if (checkForWinner(board, Mark.X) == Result.win) {
					System.out.println("Plyaer 1 " + Result.win);
					resultflag = true;
					break;
				}

			} else {
				System.out.println("Player 2 \nEnter cell(1-9)");
				cellno = sc.nextInt();
				try {
					b.setBoard(cellno, Mark.O);
				} catch (CellAlreadyMark e) {
					i--;
					System.err.println(e);
				}
				board = b.getBoard();
				printboard(board);
				if (checkForWinner(board, Mark.O) == Result.win) {
					System.out.println("Plyaer 2 " + Result.win);
					resultflag = true;
					break;
				}

			}

		}
		if (resultflag == false) {
			if (checkForWinner(board, Mark.X) == Result.win) {
				System.out.println("Plyaer 1 " + Result.win);
			} else if (checkForWinner(board, Mark.O) == Result.win) {
				System.out.println("Plyaer 2 " + Result.win);
			} else
				System.out.println(Result.draw);
		}

	}

	private static Result checkForWinner(String[][] board, Mark mark) {
		ResultAnalyzer robj = new ResultAnalyzer();
		if (robj.checkDiagonalCells(board, mark) || robj.checkHorizotalcells(board, mark)
				|| robj.checkVerticalcells(board, mark))
			return Result.win;
		else
			return null;
	}

	private static void printboard(String[][] board) {
		Board b = new Board();
		for (int i = b.getStartIteration(); i < b.getRowSize(); i++) {
			System.out.println();
			for (int j = b.getStartIteration(); j < b.getColSize(); j++) {
				System.out.print("  " + board[i][j]);
			}
			System.out.println();

		}

	}
}
