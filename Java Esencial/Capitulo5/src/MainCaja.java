public class MainCaja {
    public static void main(String[] args) {
        CajaTipoGenerico <String> caja1 = new CajaTipoGenerico<>("Hola");

        Integer numero = 5;
        CajaTipoGenerico<Integer> caja2 = new CajaTipoGenerico<>(numero);
        String miObjeto= "Perro";
        System.out.println("¿La variable caja1 contiene un objeto cuyo elemento es de la misma clase que miObjeto?" + caja1.perteneceElContenidoALaMismaClase(miObjeto));
        System.out.println("¿La variable caja2 contiene un objeto cuyo elemento es de la misma clase que miObjeto?" + caja2.perteneceElContenidoALaMismaClase(miObjeto));
    }
}
