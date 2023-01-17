package application;

import chess.ChessPiece;

public class UI {

	public static void printBoard(ChessPiece[][] pieces) {
		/*construindo a logica para imprimir o tabuleiro
		 * 
		 *  8 - - - - - - - -
		 *  7 - - - - - - - -
		 *  6 - - - - - - - -
		 *  5 - - - - - - - -
		 *  4 - - - - - - - -
		 *  3 - - - - - - - -
		 *  2 - - - - - - - -
		 *  1 - - - - - - - -
		 *    a b c d e f g h 
		 * 
		 *  no referido formato*/
		
		for (int i=0; i<pieces.length; i++) {
			System.out.print((8 - i) + " ");
			for(int j=0; j<pieces.length; j++) {
				printPiece(pieces[i][j]);	
			}
			System.out.println();
        }
		System.out.println("  a b c d e f g h");
	}   
	
	    //metodo para imprimir uma peca
	
	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print("-");
		}
		else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}
	
}
