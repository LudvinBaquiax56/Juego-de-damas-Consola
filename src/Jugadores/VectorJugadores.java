package src.Jugadores;

import java.util.*;

public class VectorJugadores {

	private Jugador[] jugadores;
	private Scanner scanner;

	public VectorJugadores() {
		jugadores = new Jugador[0];
		scanner = new Scanner(System.in);
	}

	public VectorJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}

	public Jugador[] getJugadores() {
		return jugadores;
	}

	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}

	public void agregarJugador() {
		System.out.println("Ingresa el nombe del jugador");
		String nombre = scanner.nextLine();
		agregarJugador(new Jugador(nombre));
	}

	public void agregarJugador(Jugador jugador) {
		Jugador aux[] = new Jugador[jugadores.length + 1];
		for (int i = 0; i < jugadores.length; i++) {
			aux[i] = jugadores[i];
		}
		aux[jugadores.length] = jugador;
		jugadores = aux;
	}

	public boolean validar2Jugadores() {
		return jugadores.length >= 2 ? true : false;
	}

	public Jugador seleccionarJugador() {
		mostrarJugadoresEleccion();
		System.out.println("Selecciona el indice del jugador que eres");
		int index = scanner.nextInt();
		Jugador aux = jugadores[index - 1];
		return aux;
	}

	public int size() {
		return jugadores.length;
	}

	public void mostrarJugadoresEleccion() {
		System.out.println();
		for (int i = 0; i < jugadores.length; i++) {
			System.out.println((i + 1) + ". " + jugadores[i].getNombre());
		}
	}

	public void mostrarJugadores() {
		System.out.println();
		for (int i = 0; i < jugadores.length; i++) {
			System.out.println((i + 1) + ". " + jugadores[i].mostrarDatos());
		}
	}

	public void ordenarAscendente() {
		for (int i = 1; i < jugadores.length; i++) {
			for (int j = 0; j < jugadores.length - i; j++) {
				if (jugadores[j].getGanados() < jugadores[j + 1].getGanados()) {
					Jugador aux = jugadores[j];
					jugadores[j] = jugadores[j + 1];
					jugadores[j + 1] = aux;
				}
			}
		}
	}

	public void ordenarDescendente() {
		for (int i = 1; i < jugadores.length; i++) {
			for (int j = 0; j < jugadores.length - i; j++) {
				if (jugadores[j].getGanados() > jugadores[j + 1].getGanados()) {
					Jugador aux = jugadores[j];
					jugadores[j] = jugadores[j + 1];
					jugadores[j + 1] = aux;
				}
			}
		}
	}
}