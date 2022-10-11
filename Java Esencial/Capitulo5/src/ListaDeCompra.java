import java.util.ArrayList;

public class ListaDeCompra {
    public static void main(String[] args) {
        /*Un array list nos permite crear un arreglo vacio y poder agregar nosotros los valores que nesecitemos*/
        ArrayList<String>  miListaDeLaCompra = new ArrayList<String>();
        miListaDeLaCompra.add("Patatas");
        miListaDeLaCompra.add("leche");
        miListaDeLaCompra.add("Manzanas");
        System.out.println("Mi lista contiene");

        ArrayList<String> miListaDeEnero= new ArrayList<String>(miListaDeLaCompra);
        System.out.println("miListaDeCompra: " +miListaDeLaCompra+" y miListaDeEnero"+miListaDeEnero);

        //con el metodo SET el numero 1 selecciona el valor que sera remplzado, en este caso sera 0,1 que es leche y sera sustituido por el siguiente valor "leche entera"
        miListaDeEnero.set(1, "Leche entera");
        System.out.println("Mi lista de enero: " +miListaDeEnero);

        //Con el metodo "REMOVE" escribrimos la palabra que queremos quitar del arreglo
        miListaDeEnero.remove("manzanas");

        //el metodo SIZE dice el tamaño con el que esta compuesto el arreglo hecho
        miListaDeEnero.size();
    }
}
