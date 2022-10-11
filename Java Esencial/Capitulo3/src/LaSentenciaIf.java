import java.sql.SQLOutput;
import java.util.Scanner;

public class LaSentenciaIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroPensado = 5;
        System.out.println("Adivina el numero pensado del 1 al 10");
        int numeroIntroducido=scanner.nextInt();
        //El string color le va a dar color a lo que muestre la compuradora cuando se llame a la informacion
        String color;

        //El if se encarga de mostrar solo "SI" se cumple la condicion solicitada
        if (numeroIntroducido == numeroPensado){
            //Forma de escribir el color verde en el sout
            color = "\033[0;32m";
            System.out.println(color +"Enhorabuena es el numero pensado");}
        //El Else es la condicion que hace "SINO" se cumple la primera. Por consecuencia arroja este resultado si no es el primer resultado que se estaba buscando
        else{
            color = "\033[0;31m";
            System.out.println(color+ "Lo sentimos el numero en el que estamos pensando es el: "+numeroPensado);}

    }
}
