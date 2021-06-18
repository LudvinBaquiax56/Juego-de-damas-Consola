package src.Damas;

  

public class Ficha {

	//Reset
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

	private boolean colorNegro;
	private boolean vivo;

	public Ficha(){
		colorNegro = true;
		vivo = true;
	}

	public Ficha (boolean colorNegro){
		this.colorNegro = colorNegro;
	}
	
	public boolean getVivo(){
		return vivo;
	}

	public void setVivo(boolean vivo){
		this.vivo = vivo;
	}

	public boolean getColorNegro(){
		return colorNegro;
	}

	public void setColorNegro (boolean colorNegro){
		this.colorNegro = colorNegro;
	}

	public String pintarFicha(){
		if (colorNegro) {
			return ANSI_BLACK + "#" + ANSI_RESET;
		} else {
			return ANSI_WHITE + "#" + ANSI_RESET;
		}
	}

}
