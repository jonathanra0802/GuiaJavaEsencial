public class BucleForEach {
    public static void main(String[] args) {
        //Se puede usar en colecciones de objetos
    int [] numeros = {4,8,-6, 128, 64, -36, 73, -5, -44, 8};
        int minimo, maximo;
        minimo=maximo= numeros[0];
        //Utilizando un bucle for
        for (int i=0; i <= numeros.length-1; i++){
            if (numeros[i] > maximo) maximo=numeros[i];
            if (numeros[i] < minimo) minimo=numeros[i];
        }
        minimo = maximo = numeros[0];
        for(int entero:numeros){
            System.out.println("En esta iteracion entero tiene el valor de "+entero);
            if (entero > maximo) maximo=entero;
            if (entero < minimo) minimo=entero;
        }
    }

}
