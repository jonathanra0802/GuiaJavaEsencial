package com.jra.banco;
import java.math.BigDecimal;
import java.util.Scanner;

/*
Programa que pida por pantalla introducir una cantidad en euros y devuelva la conversion en Us el mensaje sera: **** euros equivalen a  *** US dolares
 */
public class Conversor {
    public static void main(String[] args) {
        System.out.println("CONVERSION DE MONEDAS");
           Scanner scanner = new Scanner(System.in);
           System.out.println("Introduce la cantidad de euros que quieras que sean convertidos a dolares: ");
           double conversion = scanner.nextDouble();
           System.out.println("La cantidad de euros introducida es: "+conversion+ "\n y su conversion a US es: "+(conversion*1.09));

           //usar la funcion BigDecimal
        /*
        String eurosString =Double.toString(euros);
        BigDecimal eurosBigDecimal = new BigDecimal(eurosString);
        double tasaDeCambio = 1.09;
        String tasaDeCambioString = Double.toString(tasaDeCambio);
        BigDecimal tasaDeCambioBigDecimal= new BigDecimal(tasaDeCambioString);

        //Metodo de la clase BigDecimal
        BigDecimal dolaresBigDecimal = eurosBigDecimal.multiply(tasaDeCambioBigDecimal);
        System.out.println(euros + " euros equivalen a "+dolaresBigDecimal.toString()+"US dolares");
        */

    }
}
