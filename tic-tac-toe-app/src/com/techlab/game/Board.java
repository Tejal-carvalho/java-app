package com.techlab.game;

public class Board {
	private final String[][] board = new String[3][3];
	private final int maxIteration = 9;
	private final int rowsize = 3;
	private final int colsize = 3;
	private final int cellzero=0;
	private final int cellone=1;
	private final int celltwo=2;
	private final int cellthree=3;
	private final int cellfour=4;
	private final int cellfive=5;
	private final int cellsix=6;
	private final int cellseven=7;
	private final int celleight=8;
	private final int cellnine=9;

	public int getMaxIteration() {
		return maxIteration;
	}
	public int getRowSize() {
		return rowsize;
	}
	public int getColSize() {
		return colsize;
	}
	public int getStartIteration() {
		return cellzero;
	}
	public int getCellZero() {
		return cellzero;
	}
	public int getCellOne() {
		return cellone;
	}
	public int getCellTwo() {
		return celltwo;
	}

	public void setInitialBoard() {
		for (int i = cellzero; i < rowsize; i++) {
			for (int j = cellzero; j < colsize; j++) {
				board[i][j] = "-";
			}
		}
	}

	public String[][] getBoard() {
		return board;
	}

	public boolean checkForAlreadyMarkedCell(String b) {
		if (b.equals(Mark.X.toString()) || b.equals(Mark.O.toString()))
			return false;
		else
			return true;

	}

	public void setBoard(int cellno, Mark mark) throws CellAlreadyMark {

		if (cellno == cellone)
			if (!this.checkForAlreadyMarkedCell(board[cellzero][cellzero]))
				throw new CellAlreadyMark("cell is already mark");
			else
				board[cellzero][cellzero] = mark.toString();
		if (cellno == celltwo)
			if (!this.checkForAlreadyMarkedCell(board[cellzero][cellone]))
				throw new CellAlreadyMark("cell is already mark");
			else
				board[cellzero][cellone] = mark.toString();
		if (cellno == cellthree)
			if (!this.checkForAlreadyMarkedCell(board[cellzero][celltwo]))
				throw new CellAlreadyMark("cell is already mark");
			else
				board[cellzero][celltwo] = mark.toString();
		if (cellno == cellfour)
			if (!this.checkForAlreadyMarkedCell(board[cellone][cellzero]))
				throw new CellAlreadyMark("cell is already mark");
			else
				board[cellone][cellzero] = mark.toString();
		if (cellno == cellfive)
			if (!this.checkForAlreadyMarkedCell(board[cellone][cellone]))
				throw new CellAlreadyMark("cell is already mark");
			else
				board[cellone][cellone] = mark.toString();
		if (cellno == cellsix)
			if (!this.checkForAlreadyMarkedCell(board[cellone][celltwo]))
				throw new CellAlreadyMark("cell is already mark");
			else
				board[cellone][celltwo] = mark.toString();
		if (cellno == cellseven)
			if (!this.checkForAlreadyMarkedCell(board[celltwo][cellzero]))
				throw new CellAlreadyMark("cell is already mark");
			else
				board[celltwo][cellzero] = mark.toString();
		if (cellno == celleight)
			if (!this.checkForAlreadyMarkedCell(board[celltwo][cellone]))
				throw new CellAlreadyMark("cell is already mark");
			else
				board[celltwo][cellone] = mark.toString();
		if (cellno == cellnine)
			if (!this.checkForAlreadyMarkedCell(board[celltwo][celltwo]))
				throw new CellAlreadyMark("cell is already mark");
			else
				board[2][2] = mark.toString();
	}

}
