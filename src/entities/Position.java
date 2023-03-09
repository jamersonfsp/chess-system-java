package entities;

class Position {

	private Integer row;
	private Integer column;
	
	public Position() {
		
	}
	
	public Position(int row, int column) {
		
	}

	public Integer getRow() {
		return row;
	}

	public Integer getColumn() {
		return column;
	}
	
	public void setValues(int row, int column) {
		this.row	=	row;
		this.column = column;
	}
	
}
