package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
    //vamos instaciar uma partida de xadrez e imprimir o tabuleiro dessa partida
		
		ChessMatch chessMatch = new ChessMatch();
		
	// esta e a funcao para imprimir as pecas da partida
	
		while (true) {
		    UI.printBoard(chessMatch.getPieces());
		    System.out.println();
		    System.out.print("Source: ");
		    ChessPosition source = UI.readChessPosition(sc);
		    
		    System.out.println();
		    System.out.print("Target: ");
		    ChessPosition target = UI.readChessPosition(sc);
		    
		    ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}
	}

}
