public class Enemigo extends Personaje{
    private static final int PUNTOS_DE_DAÑO =10;

    public Enemigo(int posicionX, int posicionY){
        super(posicionX, posicionY);
    }
    public int obtenerPuntosDeDaño(){
        return PUNTOS_DE_DAÑO;
    }
    public void emitirSonidoDeFuria(){
        System.out.println("Grrrrr");
    }
}
