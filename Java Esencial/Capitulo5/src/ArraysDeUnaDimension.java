public class ArraysDeUnaDimension {
    public static void main(String[] args) {
        //UN arrays es una coleccion de variables del mismo tipo
        //los corchetes "[]" hace que se sepa que es un array
        //los arrays siempre se copmioenza desde cero "0"
        String diasDelaSemana[]= new String[7];
        diasDelaSemana[0]="Lunes";
        diasDelaSemana[1]="Martes";
        diasDelaSemana[2]="Miercoles";
        diasDelaSemana[3]="jueves";
        diasDelaSemana[4]="viernes";
        diasDelaSemana[5]="sabado";
        diasDelaSemana[6]="domingo";

        System.out.println("El segundo dia de la semana es: " +diasDelaSemana[1]);

        int numeros[]= {8, 9, 85, 6};

        //encontrar el valor minimo y maximo de la cadena
        int minimo, maximo;
        minimo=maximo=numeros[0];
        for (int i=0; i <= numeros.length-1; i++){
            if (numeros[i] > maximo) maximo=numeros[i];
            if (numeros[i] < minimo) minimo=numeros[i];
        }

        System.out.println("El valor minimo del array es: " +minimo + " y el valor maximo es: "+maximo);

    }
}
