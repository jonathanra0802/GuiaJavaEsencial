package com.jra.cajero;
import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) {
        //nuevos metodos agregados del capitulo 4
        System.out.println("Por favor introduzca su numero de identificacion");
        Scanner scanner = new Scanner(System.in);
        String identifcador = scanner.nextLine();
        System.out.println("Por favor introduzca su contraseña");
        String contraseña = scanner.nextLine();
        CajeroAutomatico cajero = new CajeroAutomatico(identifcador,contraseña);


    int opcionSeleccionada;
        do {
                    System.out.println("CREACION DE INTERFAZ DE CAJERO AUTOMATICO\n");
                    System.out.println("Escribe 1 para consultar tu saldo");
                    System.out.println("Escribe 2 para ingresar dinero");
                    System.out.println("Escribe 3 para sacar dinero");
                    System.out.println("Escribe 4 para consultar los ultimos movimientos");
                    System.out.println("Para salir escriba cualquuier otro numero \n");
                    System.out.println("UNA VEZ ESCRITA LA SELELECCION DE SU PREFERENCIA PRESIONA LA TECLA ENTER");
                    //le pedimos al usuario que tecle una opcion
                    //Con el parse int hacemos que el valor de la cadena se conviernta en un numero para que nuestro switch pueda leer el valor introducido
            opcionSeleccionada = scanner.nextInt();

            //El switch va a realizar todos los metodos que tenemos agregados en cajero automatico
                    switch (opcionSeleccionada){
                        case 1:
                           cajero.mostrarSaldo();
                            break;
                        case 2:
                            cajero.ingresarDinero();
                            break;
                        case 3:
                            cajero.sacarDinero();
                            break;
                        case 4:
                          cajero.consultarUltimosMovimientos();
                            break;
                        default:
                            cajero.salir();
                }

        }while (opcionSeleccionada == 1 ||  opcionSeleccionada == 2 || opcionSeleccionada == 3 || opcionSeleccionada == 4 );
    }
}