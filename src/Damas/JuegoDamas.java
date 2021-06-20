package src.Damas;

import src.Jugadores.Jugador;

public class JuegoDamas{

	private Tablero tabla = new Tablero();
	private Jugador jugador1;
	private Jugador jugador2;

	public JuegoDamas(Jugador jugador1, Jugador jugador2){
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
        tabla.llenarCasillas();
        tabla.imprimirTablero();		
	}

	public JuegoDamas(){
		tabla.llenarCasillas();
        tabla.imprimirTablero();
	}
}
