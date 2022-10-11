public class Animal {
    private String especie;
    private int numeroDePatas;

    public Animal(String especie, int numeroDePatas) {
        this.especie = especie;
        this.numeroDePatas = numeroDePatas;
    }
    public String obtenerEspecie(){
        return especie;
    }
    public int obtenerNumeroDePatas(){
        return numeroDePatas;
    }
}
