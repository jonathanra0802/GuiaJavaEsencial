import java.util.Scanner;

public class EstructuraSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduzca el dia de la semana en que quiere su cita");
        String dia = scanner.nextLine();
        /*Lo que hace la sentencia de seleccion switch es que dependiendo del caso que se seleccione es el resultado que va obtener.
        Si el usuario no elige alguna de las opciones que se le presentan se le mostrara el resultado que se tiewne por default */
        switch (dia){
            case "lunes":
                System.out.println("El lunes puede venir de 11 a 12");
                break;
            case "martes":
                System.out.println("El martes puede venir de 1 a 2");
                break;
            case "miercoles":
                System.out.println("El miercoles puede venir de 2 a 3 ");
                break;
            case "jueves":
                System.out.println("El jueves puede venir de 4 a 5 de la tarde");
                break;
            case "viernes":
                System.out.println("El viernes puede venir de 3 a 4");
                break;
            case "sabado":
                System.out.println("Sabado no abrimos");
                break;
            case "domingo":
                System.out.println("El domingo no abrimos");
                break;
            default:
                System.out.println("Usted ha introducido un dia de la semana no valido");
        }
    }
}
