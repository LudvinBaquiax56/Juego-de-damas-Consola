package src.Damas;

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

	public void iniciarTablero() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				if ((i + j) % 2 == 0) {
					tablero[i][j].setFichaCasilla(new Ficha(true));
				}
			}
		}

		for (int i = 5; i < 8; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				if ((i + j) % 2 == 0) {
					tablero[i][j].setFichaCasilla(new Ficha(false));
				}
			}
		}
	}

	public void imprimirTablero() {
		iniciarTablero();
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