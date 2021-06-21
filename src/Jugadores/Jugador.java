package src.Jugadores;

import src.Damas.*; 

public class Jugador {

	private String nombre;
	private int jugados;
	private int ganados;
	private int perdidos;
	private boolean colorFicha;

	//Jugabilidad
	private boolean posibilidadComer;
	private Ficha[] fichas;

	public Jugador(String nombre) {
		this.nombre = nombre;
		jugados = 0;
		ganados = 0;
		perdidos = 0;
		posibilidadComer = false;
	}

	public Jugador(String nombre, int jugados, int ganados, int perdidos) {
		this.nombre = nombre;
		this.jugados = jugados;
		this.ganados = ganados;
		this.perdidos = perdidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getJugados() {
		return jugados;
	}

	public void setJugados(int jugados) {
		this.jugados = jugados;
	}

	public int getGanados() {
		return ganados;
	}

	public void setGandos(int ganados) {
		this.ganados = ganados;
	}

	public int getPerdidos() {
		return perdidos;
	}

	public void setPerdidos(int perdidos) {
		this.perdidos = perdidos;
	}

	public boolean getPosibilidadComer(){
		return posibilidadComer;
	}

	public void setPosibilidadComer(boolean posibilidadComer){
		this.posibilidadComer = posibilidadComer;
	}

	public Ficha[] getFichas(){
		return fichas;
	}

	public void setFichas(Ficha[] fichas){
		this.fichas = fichas;
	}

	public boolean getColorFicha(){
		return colorFicha;
	}

	public void setColorFicha(boolean colorFicha){
		this.colorFicha = colorFicha;
	}

	public boolean validarFichasVivas(){
		for (int i = 0; i < fichas.length; i++) {
			if (fichas[i] != null) {
				return true;
			}
		}
		return false;
	}

	public void llenarFichas(boolean color){

	}
	
	public String mostrarDatos() {
		return "Nombre: " + nombre + ", Jugados: " + jugados + ", Ganados: " + ganados + ", Perdidos: " + perdidos;
	}
}