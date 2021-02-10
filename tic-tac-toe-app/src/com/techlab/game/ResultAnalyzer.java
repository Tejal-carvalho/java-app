package com.techlab.game;

public class ResultAnalyzer {
	private boolean result = false;
	Board b = new Board();

	public boolean checkHorizotalcells(String[][] board, Mark mark) {

		for (int i = b.getStartIteration(); i < b.getRowSize(); i++) {
			if (board[i][b.getCellZero()].equals(mark.toString()) && board[i][b.getCellOne()].equals(mark.toString())
					&& board[i][b.getCellTwo()].equals(mark.toString())) {
				result = true;
				break;
			}
		}
		if (result == true)
			return true;
		else
			return false;
	}

	public boolean checkVerticalcells(String[][] board, Mark mark) {
		for (int i = b.getStartIteration(); i < b.getColSize(); i++) {
			if (board[b.getCellZero()][i].equals(mark.toString()) && board[b.getCellOne()][i].equals(mark.toString())
					&& board[b.getCellTwo()][i].equals(mark.toString())) {
				result = true;
				break;
			}
		}
		if (result == true)
			return true;
		else
			return false;
	}

	public boolean checkDiagonalCells(String[][] board, Mark mark) {
		if ((board[b.getCellZero()][b.getCellZero()].equals(mark.toString())
				&& board[b.getCellOne()][b.getCellOne()].equals(mark.toString())
				&& board[b.getCellTwo()][b.getCellTwo()].equals(mark.toString()))
				|| (board[b.getCellZero()][b.getCellTwo()].equals(mark.toString())
						&& board[b.getCellOne()][b.getCellOne()].equals(mark.toString())
						&& board[b.getCellTwo()][b.getCellZero()].equals(mark.toString())))
			result = true;

		if (result == true)
			return true;
		else
			return false;
	}

}
