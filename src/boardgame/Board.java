package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		
		//Programacao defensiva
		
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error: there must be at least 1 row and 1 column");
		}
		
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
		
	}

	public int getRows() {
		return rows;
	}
	
	/* retirado para manter intacto as linhas
	public void setRows(int rows) {
		this.rows = rows;
	}
	*/

	public int getColumns() {
		return columns;
	}
	
    /*retirado para manter intacto as colunas
	public void setColumns(int columns) {
		this.columns = columns;
	}
	*/
	
	
	
	public Piece piece(int row, int column) {
		//Programacao defensiva
		
		if (!positionExists(row, column)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		//Programacao defensiva
		
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
	  return pieces[position.getRow()][position.getColumn()] ;
	
	}
	
	// Atribuicao da peca a posicao no tabuleiro
	
	public void placePiece(Piece piece, Position position) {
		//Programacao defensiva
		
		if (thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position" + position);
		}
		 pieces[position.getRow()][position.getColumn()] = piece;
		 piece.position = position;
	}
	
	public Piece removePiece(Position position) {
		
		//Programacao defensiva
		
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		if (piece(position) == null) {
			return null;
		}
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		return aux;
	}
	
	private boolean positionExists(int row, int column) {
		return row >=0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		//Programacao defensiva
		
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
	}
		
}
