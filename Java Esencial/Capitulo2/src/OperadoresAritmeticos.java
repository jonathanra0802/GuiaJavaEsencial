public class OperadoresAritmeticos {
    public static void main(String[] args) {
        //valores que se van a usar para el ejemplo
        int numeroDos =2;
        int numeroTres =3;
        //EjemploSuma
        int resultadoSuma =numeroDos+numeroTres;
        System.out.println("El resultado de la suma de: " +numeroDos+ " y " +numeroTres +" da como resultado: " + resultadoSuma);
        //EjemploResta
        int resultadoResta= numeroTres-numeroDos;
        System.out.println("El resultado de la resta de " +numeroTres+ " menos " +numeroDos+ " es iguala a: "+resultadoResta);
        //EjemploMultiplicacion
        int resultadoMultiplicar =  numeroDos*numeroTres;
        System.out.println("El resultado de multiplicar 2 por 3 nos da como resultado: " +resultadoMultiplicar);
        //Ejemplo division
        double resultadoDividir=(double)numeroTres/(double)numeroDos;
        System.out.println("El resultado de dividir 3 entre 2 es igual a : "+resultadoDividir);

    }
}
