public class Literales {
    public static void main(String[] args) {
        int enteroDecimal=100;
        int enteroOctal=0100;
        int enteroHexadecimal=0x100;

        System.out.println("enteroHexadecimal = " + enteroHexadecimal);

        long numeroLong=100L;
        double numeroDouble = 2.5;
        float numeroFloat = 2.5f;
        int numeroConGuiones = 23_23_32_23;
        System.out.println("numeroConGuiones = " + numeroConGuiones);

        char miChar= 'b';
        char miOtroChar = '\u0062';
        System.out.println("miOtroChar es = " + miOtroChar);

    }
}
