package src.Damas;

public class Casilla{

	public static final String ANSI_RESET = "\u001B[0m";
  	//Colores de letra
  	public static final String ANSI_BLACK = "\u001B[30m";
  	public static final String ANSI_RED = "\u001B[31m";
  	public static final String ANSI_GREEN = "\u001B[32m";
  	public static final String ANSI_YELLOW = "\u001B[33m";
  	public static final String ANSI_BLUE = "\u001B[34m";
  	public static final String ANSI_PURPLE = "\u001B[35m";
  	public static final String ANSI_CYAN = "\u001B[36m";
  	public static final String ANSI_WHITE = "\u001B[37m";
  	//Colores de fondo
  	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
  	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
  	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
  	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
  	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
  	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
  	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
  	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

	Ficha fichaCasilla;

	public Casilla(){

	}

	public Casilla(Ficha fichaCasilla){
		this.fichaCasilla = fichaCasilla;
	}

	public String imprimirCasilla(int x, int y){
		if (x%2 ==0 && y%2==0) {
			if (Ficha == null) {
				return ANSI_RED_BACKGROUND + "|   |";
			} else {
				return ANSI_RED_BACKGROUND + "| " + fichaCasilla.pintarFicha() + " |";
			}	
		} else {
			if (Ficha == null) {
				return ANSI_GREEN_BACKGROUND + "|   |";
			} else {
				return ANSI_GREEN_BACKGROUND + "| " + fichaCasilla.pintarFicha() + " |";
			}	
		}
		
	}
}