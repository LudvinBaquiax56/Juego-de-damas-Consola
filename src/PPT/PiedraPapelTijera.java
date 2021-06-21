package src.PPT;

import src.Jugadores.Jugador;

public class PiedraPapelTijera {

    private final int piedra = 0;
    private final int papel = 1;
    private final int tijera = 2;

    private Jugador jugador1;
    private Jugador jugador2;

    public PiedraPapelTijera(Jugador jugador1, Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public int jugar() {
        int armaJ1 = aleatorio();
        int armaJ2 = aleatorio();
        System.out.println(jugador1.getNombre() + " tu arma es " + arma(armaJ1));
        System.out.println(jugador2.getNombre() + " tu arma es " + arma(armaJ2));
        if (armaJ1 == armaJ2) {
            System.out.println("Empate");
            return jugar();
        } else if (armaJ1 == piedra && armaJ2 == tijera) {
            System.out.println("El ganador es " + jugador1.getNombre());
            return 1;
        } else if (armaJ1 == papel && armaJ2 == piedra) {
            System.out.println("El ganador es " + jugador1.getNombre());
            return 1;
        } else if (armaJ1 == tijera && armaJ2 == papel) {
            System.out.println("El ganador es " + jugador1.getNombre());
            return 1;
        } else {
            System.out.println("El ganador es " + jugador2.getNombre());
            return 2;
        }
    }
    private String arma(int eleccion){
        if (eleccion == piedra){
            return "Piedra";
        } else if ( eleccion == papel ){
            return "Papel";
        } else {
            return "Tijera";
        }
    }
    public int aleatorio() {
        return (int) (Math.random() * 2);
    }
}