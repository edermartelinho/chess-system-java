package boardgame;

public class Piece {
	
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

	// public void setBoard(Board board) foi removido para o tabuleiro nao ser alterado
	
	}
	


