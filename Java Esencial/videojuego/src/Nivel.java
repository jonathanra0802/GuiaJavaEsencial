public class Nivel {
    public static void main(String[] args) {
        Personaje enemigo= new Personaje(5,5);
        enemigo.emitirSonidoDeDolor();

        Protagonista protagonista = new Protagonista(0,0,"Jonathan");
        protagonista.emitirSonidoDeDolor();
    }
}
