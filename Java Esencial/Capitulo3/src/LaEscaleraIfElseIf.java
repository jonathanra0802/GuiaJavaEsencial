import java.util.Scanner;
/*
Pedirle al usuaurio que introduzca un numero y usar un if else if para saber donde esta el valor de su numnero
*/
public class LaEscaleraIfElseIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero entero y te dare informacion sobre el");
        int numeroIntroducido = scanner.nextInt();
        //Si el numero que se introduce es 1 o 2 se ejecuta este codogo de linea
        if (numeroIntroducido<3){
            System.out.println("El numero introducido es menor a 3");
            //Si el numero que se introduce es 3 o 4 se ejecuta este codogo de linea
        } else if (numeroIntroducido < 5) {
            System.out.println("El numero introducido se encuentra entre el 3 y el 5");
            //Si el numero que se introduce es 5,6,7 se ejecuta este codogo de linea
        } else if (numeroIntroducido < 8) {
            System.out.println("El numero introducido se encuentra entre el 5 y el 8");
            //Si el numero que se introduce es igual o mayor a el valor de 8 se ejecuta este codigo de linea
        } else {
            System.out.println("El numero es mayor o igual a 8");
        }
    }
}
