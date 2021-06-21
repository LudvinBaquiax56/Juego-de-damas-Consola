package src.Damas;

import src.Jugadores.Jugador;

public class JuegoDamas{

	private Tablero tabla = new Tablero();
	private Jugador jugador1;
	private Jugador jugador2;

	public JuegoDamas(Jugador jugador1, Jugador jugador2){
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		jugador1.llenarFichas();
		jugador2.llenarFichas();
        tabla.llenarCasillas();

		tabla.iniciarTablero(jugador1, jugador2);
		imprimirJugadores();
        tabla.imprimirTablero();		
	}

	public JuegoDamas(){
		tabla.llenarCasillas();
        tabla.imprimirTablero();
	}

	public void imprimirJugadores(){
		System.out.println( jugador1.getNombre() + " Juegas con el color " + colorFicha(jugador1.getColorFicha())); 
		System.out.println( jugador2.getNombre() + " Juegas con el color " + colorFicha(jugador2.getColorFicha())); 
	}

	public String colorFicha(boolean color){
		return color ? "Negro" : "Blanco";
	}
}
