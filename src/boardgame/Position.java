package boardgame;

public class Position {
	private int row;
	private int column;

	public Position(int row, int column) {
		this.setValues(row, column);
	}

	public void setValues(int row, int column) {
		if (row >= 0 && row < 8 && column >= 0 && column < 8) {
			this.setRow(row);
			this.setColumn(column);
		} else {
			throw new IllegalArgumentException();
		}
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

	@Override
	public String toString() {
		return row + ", " + column;
	}

}
