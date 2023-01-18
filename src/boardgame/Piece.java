package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	//O getboard foi transformado em protected pois somente classe do mesmo pacote e subclasse vao poder
    //acessar o tabuleiro de uma peca
	
	protected Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();
	
	//Hook methods, metodo concreto usando um metodo abstrato(faz um gancho com a subclass
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][]mat = possibleMoves();
		for(int i=0; i<mat.length; i++) {
		    for(int j=0; j<mat.length; j++) {
		    	if (mat[i][j]) {
		    		return true;
		    	}
		    }
		}
		return false;
	}
	
	
}
	


