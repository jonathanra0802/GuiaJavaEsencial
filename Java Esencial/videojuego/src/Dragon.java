public class Dragon extends Enemigo{
    private static final int PUNTOS_DE_DANO = 80;
    public Dragon(int posicionX, int posicionY){
        super(posicionX,posicionY);
    }

    @Override
    public int obtenerPuntosDeDaño() {
        return PUNTOS_DE_DANO;
    }
}
