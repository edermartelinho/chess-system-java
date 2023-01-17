package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
    //vamos instaciar uma partida de xadrez e imprimir o tabuleiro dessa partida
		
		ChessMatch chessMatch = new ChessMatch();
		
	// esta e a funcao para imprimir as pecas da partida
	// criaremos uma classe UI(UserInterface)
		
		UI.printBoard(chessMatch.getPieces());
		
		
	}

}
