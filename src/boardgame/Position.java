package boardgame;

public class Position {
	
	//Encapsulationn
	
	private int row;
	private int column;
	
	//Constructors
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	
	//to string para mostrar a posicao na tela linha e coluna
	//@overraid por ser uma sobreposicao
	//A classe objeto e uma superclasse de todas as classes
	
	@Override
	public String toString() {
		return row + " , " + column;
	}
	
	

}
