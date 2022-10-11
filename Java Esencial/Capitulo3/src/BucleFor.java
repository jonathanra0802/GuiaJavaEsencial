import java.util.Scanner;

public class BucleFor {
    public static void main(String[] args) {
        //usamos el bucle for cuando repetir una accion una cierta cantidad numero de veces
        //EJEMPLO: multiplicar dos numeros que el usuario ingrese
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduzca el primer numero");
        int primerNumero=scanner.nextInt();
        System.out.println("Por favor introduzca el segundo numero");
        int segundoNumero = scanner.nextInt();
        int resultado = 0;

        // El => int = 0; es la condicion de inicializacion desde comienza el bucle
        //El => i < segundo numero: es el numero de acciones que va a realizar hasta alcanzar el valor limite que se estable.
        // EL => es la forma que se va avanzar de una interaccion a otra para este caso despues de cada una de suma una mas.
        for (int i=0; i<segundoNumero; i++){
            System.out.println("Iteracion numero: " +i);
            resultado = resultado+ primerNumero;
        }
        System.out.println("El resultado de multiplicar "+primerNumero+" por "+segundoNumero+" es " +resultado);

    }
}
