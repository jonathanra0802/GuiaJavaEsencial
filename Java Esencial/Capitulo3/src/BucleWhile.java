import java.util.Scanner;

public class BucleWhile {
    public static void main(String[] args) {

        //EJEMPLO: OBTENER LA RAIZ CUADRADA DE UN NUMERO TECLEADO POR EL USUARIO USANDO WHILE
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduzca el numero que quiera realizar su raiz cuadrada");
        double numero = scanner.nextDouble();
        double candidatoARaizCuadrada = 0.0;
        //En el bucle while se repite siemore y cuando se cumpla la condicion se usa el while cuando no se sabe el numero de interaccion
        while (candidatoARaizCuadrada * candidatoARaizCuadrada <= numero){
            candidatoARaizCuadrada += 0.01;
            System.out.println("Sera el numero " +candidatoARaizCuadrada+ " ?" +"Su cuadrado es" + candidatoARaizCuadrada);
        }
        candidatoARaizCuadrada -= 0.01;
        System.out.println("La raiz cuadra que hemos calculado es " + candidatoARaizCuadrada);
        System.out.println("La raiz cuadrada es: "+ Math.sqrt(numero));
    }
}
