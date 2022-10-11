public class Casteo {
    public static void main(String[] args) {
        //transformacion de un tipo de dato a otro
        int variableDeTipoInt = 10;
        float variableDeTipoFloat = variableDeTipoInt;
        double variableDeTipoDoueble = variableDeTipoFloat;

        // Conversion forzada de manera manual
        double otraVariableTipoDouble = 2.76;
        //Como int no es compatible con double se debe de castear el valor
        //metiendo los valores dentro de un () como el casteo es de
        //tipo double a int se perderan las decimales marcadas
        int otraVariableTipoInt = (int)otraVariableTipoDouble;
        System.out.println("El resultado del casteo es "+ otraVariableTipoInt);


        //otro ejemplo
        byte variable1 = 5;
        byte variable2 = 10;
        /*Como el valor de la suma se genera en tipo int
        * y queremos devolver un byte se debe de casteqr el resultado */
        byte suma = (byte) (variable1 + variable2);
    }
}
