public class Orco extends Enemigo{
    public Orco(int posicionX, int posicionY){
        super(posicionX,posicionY);
    }

    @Override
    public void emitirSonidoDeDolor() {
        System.out.println("NOOOOO!");
    }
}
