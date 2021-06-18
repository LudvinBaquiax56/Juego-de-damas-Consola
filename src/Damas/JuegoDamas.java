package src.Damas;

public class JuegoDamas{

	Tablero tabla = new Tablero();

	public JuegoDamas(){
        tabla.llenarCasillas();
        tabla.imprimirTablero();		
	}
}
