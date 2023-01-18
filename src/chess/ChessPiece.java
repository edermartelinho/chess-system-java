package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece {

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	//apagamos o set para que a cor nao seja modificada
	//public void setColor(Color color) { 
	//	this.color = color;
	
	
	
}
