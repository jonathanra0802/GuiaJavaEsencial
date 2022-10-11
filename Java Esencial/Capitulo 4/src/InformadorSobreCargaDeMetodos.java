public class InformadorSobreCargaDeMetodos {
    //Utilizamos constantes que seran invocados al String de color
    public static final String COLOR_POR_DEFECTO ="\u001B[0m";
    public static final String COLOR_NEGRO ="\u001B[30m";
    public static final String COLOR_ROJO ="\u001B[31m";
    public static final String COLOR_VERDE ="\u001B[32m";
    public static final String COLOR_AMARILLO ="\u001B[33m";
    public static final String COLOR_AZUL ="\u001B[34m";
    //LA PRIMER SOBRECARGA NOS MOSTRARA EL VALOR SI ES VALOR ES TIPO ENTERO
    void mostrarPorPantalla(int entero){
        System.out.println("Mostrando el entero: " + entero);
    }
    //LA SEGUNDA SOBRECARGA NOS MOSTRARA EL VALOR EN DECIMAL
    void mostrarPorPantalla(double decimal){
        System.out.println("Mostrando el decimal: " + decimal);
    }
    //LA TERCERA SOBRECARGA MOSTRARA MOSTRARA EL VALOR EN TIPO STRING
    void mostrarPorPantalla(String palabra){
        System.out.println("Mostrando la palabra: " + palabra);
    }
    //A DIFERENCIA DE LA TERCERA LA CUARTA SOBRECARGA MOSTRARA LA PALABRA PERO CON LA INVOCACION DEL COLOR QUE SOLICITE EL USUARIO
    void mostraPorPantalla(String palabra, String color){
        System.out.println(color + "Mostrando una palabra con color: " + palabra + COLOR_POR_DEFECTO);
    }

}
