package src.Jugadores;

public class Jugador {

	private String nombre;
	private int jugados;
	private int ganados;
	private int perdidos;

	public Jugador(String nombre){
		this.nombre = nombre;
		jugados = 0;
		ganados = 0;
		perdidos = 0;
	}

	public Jugador(String nombre, int jugados, int ganados, int perdidos){
		this.nombre = nombre;
		this.jugados = jugados;
		this.ganados = ganados;
		this.perdidos = perdidos;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public int getJugados(){
		return jugados;
	}

	public void setJugados(int jugados){
		this.jugados = jugados;
	}


	public int getGanados(){
		return ganados;
	}

	public void setGandos(int ganados){
		this.ganados = ganados;
	}

	public int getPerdidos(){
		return perdidos;
	}

	public void setPerdidos(int perdidos){
		this.perdidos = perdidos;
	}

	public String mostrarDatos(){
		return "Nombre: " + nombre +", Jugados: " + jugados + ", Ganados: " + ganados + ", Perdidos: " + perdidos;
	}
}