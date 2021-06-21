package src.Menu;

import src.Jugadores.*;
import src.PPT.PiedraPapelTijera;

import java.util.*;
import src.Damas.*;

public class Menu{

	private VectorJugadores jugadores;
	private JuegoDamas juego;
    private PiedraPapelTijera miniJuego;

	public Menu (){
		jugadores = new VectorJugadores();
	}

	public void mostrarMenu(){
		boolean salir = true;
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("-----------------------------------------------");
            System.out.println("Bienvenido a Juego de damas");
            System.out.println("Seleccione la accion que desea hacer: ");
            System.out.println("1. Jugar");
            System.out.println("2. Ingresar Jugadores");
            System.out.println("3. Mostrar Jugadores");
            System.out.println("4. Ordenar Jugadores Ascendente");
            System.out.println("5. Ordenar Jugadores Descendente");
            System.out.println("6. Salir");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    jugar();
                    break;
                case 2:
                    jugadores.agregarJugador();
                    break;
                case 3:
                	jugadores.mostrarJugadores();
                    break;
                case 4:
                	System.out.println("Ordenar Ascendente");
                    break;
                case 5:
                	System.out.println("Ordenar Descendente");
                    break;
                case 6:
                    System.out.println("Gracias por Jugar");
                    salir = false;
                    break;
                default:
                    System.out.println("Error opcion incorrecta");
                    break;
            }

        } while (salir);
	}

    public void jugar(){
        if (jugadores.validar2Jugadores()) {
            Jugador J1 = jugadores.seleccionarJugador();
            Jugador J2 = jugadores.seleccionarJugador();
            miniJuego = new PiedraPapelTijera(J1, J2);
            int gandor = miniJuego.jugar();
            System.out.println(gandor);
            juego = new JuegoDamas();    
        } else {
            System.out.println("No hay mas de dos jugadores, agrega los jugadores en la opcion 2");
            System.out.println("Numero de jugadores registrados: " + jugadores.size());
        }
    }
}