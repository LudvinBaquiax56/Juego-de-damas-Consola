package src.Damas;

import src.Jugadores.Jugador;

public class Tablero {

	Casilla[][] tablero = new Casilla[8][8];

	public Tablero() {

	}

	public void llenarCasillas() {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				tablero[i][j] = new Casilla();
			}
		}
	}

	public void iniciarTablero(Jugador J1, Jugador J2) {
		if (J1.getColorFicha()) {
			iniciarTableroBlancas(J1);
			iniciarTableroNegras(J2);
		} else {
			iniciarTableroBlancas(J2);
			iniciarTableroNegras(J1);
		}
	}
	public void iniciarTableroNegras(Jugador jugadorNegras) {
		int contador = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				if ((i + j) % 2 == 0) {
					tablero[i][j].setFichaCasilla(jugadorNegras.getFichas()[contador]);
					contador ++;
				}
			}
		}
	}

	public void iniciarTableroBlancas (Jugador jugadorBlancas){
		int contador = 0;
		for (int i = 5; i < 8; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				if ((i + j) % 2 == 0) {
					tablero[i][j].setFichaCasilla(jugadorBlancas.getFichas()[contador]);
					contador ++;
				}
			}
		}
	}

	public void imprimirTablero() {
		imprimirNumeros();
		for (int i = 0; i < tablero.length; i++) {
			System.out.print((i + 1) + " ");
			for (int j = 0; j < tablero[0].length; j++) {
				System.out.print(tablero[i][j].imprimirCasilla(i, j));
			}
			System.out.println(" " + (i + 1));
			// System.out.println("");
		}
		imprimirNumeros();
	}

	public void imprimirNumeros() {
		System.out.print("  ");
		for (int i = 0; i < tablero.length; i++) {
			System.out.print("  " + (i + 1) + "  ");
		}
		System.out.println("");
	}
}