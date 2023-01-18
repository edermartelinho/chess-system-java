package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

//Esta classe  tem as regras do jogo

public class ChessMatch {

//O tabuleiro da partida
	
	private Board board;
	
//	O dimencionamento do jogo (row, column) deve ser dominado pelo ChessMatch
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	//Esse metodo retorna uma matriz do jogo
	// libera as pecas do metodo chesspices
	//O programa  so deve enchergar as chesspieces e nao a pieces do tabuleiro
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
	/* vamos percorrer a matriz de pecas do tabuleiro(board)
	e cada peca do tabuleirofara DownCache para ChessPice[][] 
	Faremos um for para percorrer a matriz e dentro desse for tera outro for para percorrer
    as colunas da matriz
	*/
		
		for (int i = 0; i<board.getRows(); i++ ) {
			for(int j = 0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece)board.piece(i, j);
			}
		}
		
		//retornando minha matriz mat
		
		return mat;
    }
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup() {
		placeNewPiece('b', 6, new Rook(board, Color.RED));
		placeNewPiece('e', 8, new King(board, Color.GREEN));
		placeNewPiece('e', 1, new King(board, Color.RED));


		
	}
}
    