public class TiposDeDatosPrimitivos {
    public static void main(String[] args) {
        //valor que puede contener Byte
        byte elMenorByte = Byte.MIN_VALUE;
        byte elMayorByte = Byte.MAX_VALUE;
        System.out.println("El tipo byte de un numero entero es de 8 bits con signo. Esta comprendido desde " + elMenorByte +" y " + elMayorByte);
        //Para el valor de short
        System.out.println("El tipo short de un numero entero es de 16 bits con signo. Esta comprendido desde " + Short.MIN_VALUE +" y " + Short.MAX_VALUE);
        //Para el valor de int
        System.out.println("El tipo int de un numero entero es de 32 bits con signo. Esta comprendido desde " + Integer.MIN_VALUE +" y " + Integer.MAX_VALUE);
        //Para el valor de long
        System.out.println("El tipo long de un numero entero es de 64 bits con signo. Esta comprendido desde " + Long.MIN_VALUE +" y " + Long.MAX_VALUE);
        /* Cual es la diferencia entre float y double
        La principal diferencia es el tipo de presicion del resultado para float solo muestra hasta 7 decimales mientras que un double muestra entre 15 y 16 digitos
        FLOAT ocupa solo 32 bit mientras que
        DOUBLE ocupa 64 bits*/

        //Para float y double
        float variableF=5.6f;
        System.out.println("El valor de float es: "+variableF);
        double variableD = 5.6;
        System.out.println("El valor de double es: " + variableD);
        //char se utiliza cuando quieres leer caracteres
        char caracterA = 'a';
        System.out.println("El valor del caracter es:  "+ caracterA);

        //Boolean se utiliza cuando quieres saber si los valores son verdaderos o falsos

        //TRUE para valores verdaderos
        boolean trueBoolean =true;
        System.out.println("trueBoolean = " + trueBoolean);
        //FALSE para valores falsos
        boolean falseBoolean = false;
        System.out.println("falseBoolean = " + falseBoolean);

    }
}
