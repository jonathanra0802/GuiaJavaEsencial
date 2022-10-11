import java.util.Scanner;

public class BucleDoWhile {
    public static void main(String[] args) {
        //El uso del bucle DO WHILE hace que por lo menos haga la interaccion una vez.
        Scanner scanner = new Scanner(System.in);
        double numero;
        do {
            System.out.println("introduzca un numero y le mostraremos la raiz cuandra \n Para salir introduzca el numero 0");
            numero = scanner.nextDouble();
            if (numero == 0){
                System.out.println("Muchas gracias hasta la proxima");
            }else {
                System.out.println("La raiz cuadrada de "+numero+" es "+Math.sqrt(numero));
            }
            //se repetira la accion Do hasta que el numero que se introduce es 0, solo asi corta la linea de mensajes que nuestra al usuario
        } while(numero !=0);
    }
}
