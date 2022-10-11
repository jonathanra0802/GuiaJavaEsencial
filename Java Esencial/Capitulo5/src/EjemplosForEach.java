public class EjemplosForEach {
    public static void main(String[] args) {
        //Se utiliza con los arreglos para mostrar los datos sin
        String[] nombres= {"Jonathan", "Jesus", "Marco", "Carlos"};
        //Se escribe un for donde se guardan los datos de nuestra arreglo
        //Se debe de poner el tipo de variable que es, para este caso es un String
        //Se debe de poner el nombre que va a referenciar al array, en este caso sera "variableMagica" que hace referencia a nombres
        for (String variableMagica : nombres){
            System.out.println(variableMagica);
        }
    }
}
