public class PracticaConStrings {
    public static void main(String[] args) {
        String unString = new String("Soy un string");

        String otroString = new String(unString);

        String miTercerString =" Este string se crea directamente con una cadena de caracteres entrecomillada";
        //En el string mostrado estamos diciendo que nos muuestre el char que se encuentra dentro de la palabra miString como un arreglo siemnpre comienza desde cero
        //El resultado que debemos obtener es C ya que es 0,1,2
        String miString = "abcd";
        char caracter;
        caracter = miString.charAt(2);
        System.out.println("El caracter en la posicion 2 es: " + caracter);
        /*Equals() se usa para saber si dos objetos son del mismo tipo y tienen los mismos datos.

        Nos dara el valor true si son iguales y false si no.

        Las subclases pueden sobreescribir el método equals() parahacer una comparación entre dos objetos.*/
    }
}
