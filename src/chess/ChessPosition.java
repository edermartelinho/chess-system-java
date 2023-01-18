package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
<<<<<<< HEAD
	
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
=======
	public ChessPosition(char column, int row) {
		
		//Programacao defensiva
		
		if (column < 'a' || column > 'h' || row < 1 || row > 8 ) {
			throw new ChessException("Error instantiating ChessPosition. valid values are from a1 to h8.");
>>>>>>> 734502d52f6787b06dda1cb3aa92c693aaff62d0
		}
		this.column = column;
		this.row = row;
	}
<<<<<<< HEAD

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

=======
	public char getColumn() {
		return column;
	}
	/*Remove para linhas e colunas nao seren alteradas
	 * 
	public void setColumn(char column) {
		this.column = column;
	}
	*/
	public int getRow() {
		return row;
	}
	/*Remove para linhas e colunas nao seren alteradas
	public void setRow(int row) {
		this.row = row;
	}
	*/
	
>>>>>>> 734502d52f6787b06dda1cb3aa92c693aaff62d0
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
<<<<<<< HEAD
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
=======
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());		
>>>>>>> 734502d52f6787b06dda1cb3aa92c693aaff62d0
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
<<<<<<< HEAD

}
=======
	








}









>>>>>>> 734502d52f6787b06dda1cb3aa92c693aaff62d0
