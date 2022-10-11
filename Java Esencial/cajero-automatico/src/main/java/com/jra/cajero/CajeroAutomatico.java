package com.jra.cajero;

import com.jra.banco.CuentaBancaria;
import com.jra.mock.GeneradorAleatorioDeMovimientos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CajeroAutomatico {

        private CuentaBancaria cuentaBancariaActual;
        protected CajeroAutomatico(String identificador, String contraseña){
        //creacion de una cuenta falsa para hacer la prueba
            //el threadLocalRandom genera un valor alatorio desde 0 hasta los 50,000
        double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0,50000);
        cuentaBancariaActual = new CuentaBancaria("Nombre Cualquiera", cantidadAleatoria);
    }
    protected void mostrarSaldo(){
        System.out.println("Su saldo es " + cuentaBancariaActual.obtenerSaldo());
    }
    protected void ingresarDinero(){
        System.out.println("¿Cuanto dinero quiere ingresar?");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextDouble();
        cuentaBancariaActual.ingresarDinero(cantidad);
    }
    protected void sacarDinero(){
        System.out.println("¿Cuanto dinero quiere sacar?");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextDouble();
        cuentaBancariaActual.sacarDinero(cantidad);
    }
    protected void consultarUltimosMovimientos(){
            GeneradorAleatorioDeMovimientos generadorAleatorioDeMovimientos = new GeneradorAleatorioDeMovimientos();
        System.out.println("Cuantos movimientos quiere consultar");
        Scanner scanner = new Scanner(System.in);
        int numeroDeMovimientos = scanner.nextInt();
        ArrayList<String> movimientos = generadorAleatorioDeMovimientos.obtenerMovimientos(numeroDeMovimientos, "euros");
    }
    private void mostrarMovimientos(ArrayList<String>movimientos){
            for (String movimiento: movimientos){
                System.out.println(movimiento);
            }
    }

    void salir(){
        System.out.println("Muchas gracias por utilizar nuestros servicios");
    }
}

