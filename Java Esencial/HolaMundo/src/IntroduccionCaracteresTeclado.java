import java.util.Scanner;

public class IntroduccionCaracteresTeclado {
    public static void main(String[] args) {
        //Esta linea hace que lea lo que el usuario escriba con el teclado
        Scanner scanner =new Scanner(System.in);
        //Esta linea de codigo pinta en la terminal como se llama el usuario
        System.out.println("¿Como te llamas?");
        // Esta linea guarda los datos que introdujo el usuario
        String nombre=scanner.nextLine();
        //Mostramos en pantalla el Hola mas lo que guardo en nombre mas el bienvenido
        System.out.println("Hola " +nombre+ " bienvenido");
        System.out.println("Introduce tu edad");
        int edad = scanner.nextInt();
        System.out.println("Tu edad es "+edad+ " años");
    }
}
