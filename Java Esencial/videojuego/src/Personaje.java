public class Personaje {
    //variables de instancia
    protected int puntosDeVida =100;
    protected int posicionX=0;
    protected int posicionY=0;
    //Creacion del contructor
    public Personaje(int posicionX, int posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }
    //creacion de metodos
    public void recibirdano(int puntos){
        puntosDeVida -= puntos;
    }
    public void moverALaDerecha(int unidades){
        posicionX +=unidades;
    }
    public void moverALaIzquierda(int unidades){
        posicionY -=unidades;
    }
//con override se sobreescirbe el metodo a la subclase
    public void emitirSonidoDeDolor(){
        System.out.println("¡Au!");
    }
}
