package src.Menu;

import src.Jugadores.*;
import java.util.*;

public class Menu{

	private VectorJugadores jugadores;

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
            System.out.println("4. Ordenar Jugadores");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("jugar");
                    break;
                case 2:
                    jugadores.agregarJugador();
                    break;
                case 3:
                	jugadores.mostrarJugadores();
                    break;
                case 4:
                	System.out.println("Ordenar");
                    break;
                case 5:
                    System.out.println("Gracias por Jugar");
                    salir = false;
                    break;
                default:
                    System.out.println("Error opcion incorrecta");
                    break;
            }

        } while (salir);
	}
}