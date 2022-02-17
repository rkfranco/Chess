package boardgame;

public class Position {
	private int row;
	private int column;

	public Position(int row, int column) {
		this.setValues(row, column);
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public void setValues(int row, int column) {
		if (row >= 0 && row <= 7 && column >= 0 && column <= 7) {
			this.row = row;
			this.column = column;
		} 
	}

	@Override
	public String toString() {
		return row + ", " + column;
	}
}