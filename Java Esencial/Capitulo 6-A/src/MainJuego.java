public class MainJuego {
    public static void main(String[] args) {
        Juego juego = new Juego(4);

        Juego.Contador contadorJuego = juego.new Contador();

        System.out.println("La puntuacion de juego al incio es: " + juego.obtenerPuntuacion());

        contadorJuego.incrementarPuntuacion(500);
        System.out.println("La puntuacion de juego despues de incrementar la puntuacion es " + juego.obtenerPuntuacion());
    }
}
