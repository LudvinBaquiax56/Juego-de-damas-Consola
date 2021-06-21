package src.Jugadores;

import java.util.*;

public class VectorJugadores{

	private Jugador [] jugadores;
	private Scanner scanner;

	public VectorJugadores (){
		jugadores = new Jugador[0];
		scanner = new Scanner(System.in);
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

	public boolean validar2Jugadores(){
		return jugadores.length >=2 ? true : false;
	}

	public Jugador seleccionarJugador (){
		mostrarJugadores();
		System.out.println("Selecciona el indice del jugador que eres");
		int index = scanner.nextInt();
		Jugador aux = jugadores[index - 1];
		return aux;
	}

	public int size (){
		return jugadores.length;
	}

    public void mostrarJugadores(){
		System.out.println();
    	for (int i = 0; i < jugadores.length ; i++ ) {
    		System.out.println((i+1) + ". " + jugadores[i].mostrarDatos());
    	}
    }
}