import java.util.Scanner;

public class OperadorInterrogante {
    public static void main (String[] args){
        //El operador interrogante es una sustitucion basica de la funcion if else
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int dividendo = scanner.nextInt();
        System.out.println("Introduce otro numero entero");
        int divisor= scanner.nextInt();
        int resultado ;

        //Tambien se le conoce como metodo Elvis
        //Si divisor es igual a cero se ejecuta lo que esta a lado izquierdo de resultado  osea divisor == 0 se ejecuta
        // Si divisor no es igual a cero entonces se ejecuta la linea de codigo que esta a la derecha
        resultado=divisor == 0?0: dividendo/divisor;
        System.out.println("El resultado de dividir "+dividendo+ " entre "+divisor+" es: "+resultado);
    }
}
