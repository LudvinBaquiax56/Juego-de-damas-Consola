package src.Damas;

import java.util.Scanner;

import src.Jugadores.Jugador;

public class JuegoDamas {

	private Tablero tabla = new Tablero();
	private Jugador jugador1;
	private Jugador jugador2;
	private Scanner scanner;

	public JuegoDamas(Jugador jugador1, Jugador jugador2) {
		scanner = new Scanner(System.in);
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		jugador1.llenarFichas();
		jugador2.llenarFichas();
		jugador1.setJugados(jugador1.getJugados() + 1);
		jugador2.setJugados(jugador2.getJugados() + 1);
		tabla.llenarCasillas();

		tabla.iniciarTablero(jugador1, jugador2);
		imprimirJugadores();
		tabla.imprimirTablero();
		jugar();
	}

	public void jugar() {
		Casilla[][] casillas = tabla.getTablero();
		while (jugador1.validarFichasVivas() && jugador2.validarFichasVivas()) {
			if (jugador1.validarFichasVivas() && jugador2.validarFichasVivas()) {
				
				int[] coordenadas = pedirCasilla(jugador1);
				//Valida si esta el jugador no se ha rendido 
				//valida si la casilla inicila esta ocupada 
				//valida que la casilla ocupada del color correspendiente al jugador
				if (validarPerdida(coordenadas) && casillas[coordenadas[0] - 1][coordenadas[1] - 1].ocupado()
						&& casillas[coordenadas[0] - 1][coordenadas[1] - 1].getFichaCasilla().getColorNegro() == jugador1
								.getColorFicha()) {

					if (jugador1.getColorFicha()) {
						// negro
						if (validarMovimientoValido(coordenadas,jugador1.getColorFicha())) {
							Casilla [][] aux  = tabla.getTablero();
							Ficha auxFicha  = aux [coordenadas[0]-1][ coordenadas[1]-1].getFichaCasilla();
							aux [coordenadas[0]-1][ coordenadas[1]-1].setFichaCasilla(null);
							aux [coordenadas[2]-1][ coordenadas[3]-1].setFichaCasilla(auxFicha);
						}
					} else {
						// blango
						if (validarMovimientoValido(coordenadas,jugador1.getColorFicha())) {
							Casilla [][] aux  = tabla.getTablero();
							Ficha auxFicha  = aux [coordenadas[0]-1][ coordenadas[1]-1].getFichaCasilla();
							aux [coordenadas[0]-1][ coordenadas[1]-1].setFichaCasilla(null);
							aux [coordenadas[2]-1][ coordenadas[3]-1].setFichaCasilla(auxFicha);
						}
					}
					tabla.imprimirTablero();
				}
			}
			if (jugador2.validarFichasVivas() && jugador1.validarFichasVivas()) {
				int[] coordenadas = pedirCasilla(jugador2);

				if (validarPerdida(coordenadas) && casillas[coordenadas[0] - 1][coordenadas[1] - 1].ocupado()
						&& casillas[coordenadas[0] - 1][coordenadas[1] - 1].getFichaCasilla().getColorNegro() == jugador2
								.getColorFicha()) {

					if (jugador2.getColorFicha()) {
						// negro
						if (validarMovimientoValido(coordenadas,jugador2.getColorFicha())) {
							Casilla [][] aux  = tabla.getTablero();
							Ficha auxFicha  = aux [coordenadas[0]-1][ coordenadas[1]-1].getFichaCasilla();
							aux [coordenadas[0]-1][ coordenadas[1]-1].setFichaCasilla(null);
							aux [coordenadas[2]-1][ coordenadas[3]-1].setFichaCasilla(auxFicha);
						}
					} else {
						// blango
						if (validarMovimientoValido(coordenadas,jugador2.getColorFicha())) {
							Casilla [][] aux  = tabla.getTablero();
							Ficha auxFicha  = aux [coordenadas[0]-1][ coordenadas[1]-1].getFichaCasilla();
							aux [coordenadas[0]-1][ coordenadas[1]-1].setFichaCasilla(null);
							aux [coordenadas[2]-1][ coordenadas[3]-1].setFichaCasilla(auxFicha);
						}
					}
					tabla.imprimirTablero();
				}

			}
		}
		scanner.nextLine();
		declararGandor();
	}

	private boolean validarMovimientoValido(int[] coordenadas, boolean subir) {
		int a = Math.abs(coordenadas[0] - coordenadas[2]);
		int b = Math.abs(coordenadas[1] - coordenadas[3]);
		if (subir) {
			if (coordenadas[1] - coordenadas[3] > 0
					&& a == b) {
				return true;
			}
		} else {
			if (coordenadas[1] - coordenadas[3] < 0
					&& a == b) {
				return true;
			}
		}
		return false;
	}

	public void declararGandor() {
		if (jugador1.validarFichasVivas()) {
			System.out.println("El ganador es " + jugador1.getNombre());
			jugador1.setGanados(jugador1.getGanados() + 1);
			jugador2.setPerdidos(jugador2.getPerdidos() + 1);
		} else {
			System.out.println("El ganador es " + jugador2.getNombre());
			jugador2.setGanados(jugador2.getGanados() + 1);
			jugador1.setPerdidos(jugador1.getPerdidos() + 1);
		}
	}

	public void imprimirJugadores() {
		System.out.println(jugador1.getNombre() + " Juegas con el color " + colorFicha(jugador1.getColorFicha()));
		System.out.println(jugador2.getNombre() + " Juegas con el color " + colorFicha(jugador2.getColorFicha()));
	}

	public String colorFicha(boolean color) {
		return color ? "Negro" : "Blanco";
	}

	public int[] pedirCasilla(Jugador jugador) {
		String cordenadas;
		int[] cordenadasInt = new int[4];
		do {
			System.out.println(jugador.getNombre() + " Juegas con el color " + colorFicha(jugador.getColorFicha()));
			System.out.println("Ingresa la casilla incio y fin");
			System.out.println("Ejemplo \"X1,Y1-X2,Y2\"");
			cordenadas = scanner.nextLine();
			if (cordenadas.equalsIgnoreCase("R")) {
				jugador.rendirse();
				llenarNulos(cordenadasInt);
				return cordenadasInt;
			}
			String[] parCordenas = cordenadas.split("-");
			cordenadasInt = cordenadasIndividuales(parCordenas);
		} while (!(cordenadas.length() == 7 && validarRango(cordenadasInt)));
		return cordenadasInt;
	}

	private void llenarNulos(int[] cordenadasInt) {
		for (int i = 0; i < cordenadasInt.length; i++) {
			cordenadasInt[i] = -1;
		}
	}

	// Valida si un jugador ha decido abandonar la partida
	private boolean validarPerdida(int[] cordenadas) {
		for (int i = 0; i < cordenadas.length; i++) {
			if (cordenadas[i] == -1) {
				return false;
			}
		}
		return true;
	}

	public int[] cordenadasIndividuales(String[] parCordenadas) {
		String[] parInicio = cordenadasXY(parCordenadas[0]);
		String[] parFin = cordenadasXY(parCordenadas[1]);
		int[] cordenadas = new int[4];
		cordenadas[0] = Integer.parseInt(parInicio[0]);
		cordenadas[1] = Integer.parseInt(parInicio[1]);
		cordenadas[2] = Integer.parseInt(parFin[0]);
		cordenadas[3] = Integer.parseInt(parFin[1]);
		return cordenadas;
	}

	public String[] cordenadasXY(String cordenada) {
		String[] par = cordenada.split(",");
		return par;
	}

	public boolean validarRango(int[] cordenadas) {
		for (int i = 0; i < cordenadas.length; i++) {
			if (!validarRango(cordenadas[i])) {
				return false;
			}
		}
		return true;
	}

	public boolean validarRango(int valor) {
		return (valor >= 1 && valor <= 8) ? true : false;
	}
}
