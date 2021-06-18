package src.Jugadores;

import java.util.*;

public class VectorJugadores{

	private Jugador [] jugadores;

	public VectorJugadores (){
		jugadores = new Jugador[0];
	}	

	public VectorJugadores(Jugador[] jugadores){
		this.jugadores = jugadores;
	}

	public Jugador[] getJugadores(){
		return jugadores;
	}

	public void setJugadores(Jugador [] jugadores){
		this.jugadores = jugadores;
	}

	public void agregarJugador(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el nombe del jugador");
		String nombre = scanner.nextLine();
        agregarJugador(new Jugador(nombre));
	}

	public void agregarJugador (Jugador jugador){
        Jugador aux [] = new Jugador[jugadores.length + 1];
        for (int i = 0; i < jugadores.length ; i++ ) {
            aux[i] = jugadores[i];
        }
        aux[jugadores.length] = jugador;
        jugadores = aux;
    }

    public void mostrarJugadores(){
    	for (int i = 0; i < jugadores.length ; i++ ) {
    		System.out.println((i+1) + ". " + jugadores[i].mostrarDatos());
    	}
    }
}