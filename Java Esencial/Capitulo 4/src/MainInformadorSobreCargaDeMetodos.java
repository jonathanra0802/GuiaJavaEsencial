public class MainInformadorSobreCargaDeMetodos {
    public static void main(String[] args) {

        InformadorSobreCargaDeMetodos informador = new InformadorSobreCargaDeMetodos();
        //SOBRECARGA TIPO INT
        informador.mostrarPorPantalla(3);

        //SOBRECARGA TIPO INT YA QUE NO TENEMOS TIPO BYTE SE MUESTRA DE LA MANERA QUE MAS SE ACERCA
        byte unByte =2;
        informador.mostrarPorPantalla(unByte);

        //SOBRECARGA TIPO DECIMAL
        informador.mostrarPorPantalla(5.43);
        // SOBRECARGA CON COLOR EN EL STRING
        informador.mostraPorPantalla("hola", InformadorSobreCargaDeMetodos.COLOR_NEGRO );
        //SOBRECARGA TIPO STRING
        informador.mostrarPorPantalla("Holis");
    }
}
