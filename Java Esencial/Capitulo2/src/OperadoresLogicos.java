public class OperadoresLogicos {
    public static void main(String[] args) {
        //creacion de tabla de la verdad
        System.out.println("TABLA DE LA VERDAD");
        System.out.println("falso & falso es: "+(false & false));
        System.out.println("verdadero & falso es: "+(true & false));
        System.out.println("falso & verdader es: "+(false & true));
        System.out.println("verdadero & verdadero es: "+(true & true));

        //Creacion de la tabla de la verdad operador AND
        System.out.println("TABLA DE LA VERDAD");
        System.out.println("falso && falso es: "+(false && false));
        System.out.println("verdadero && falso es: "+(true && false));
        System.out.println("falso && verdader es: "+(false && true));
        System.out.println("verdadero && verdadero es: "+(true && true));
        //Creacion de la tabla de la verdad operador OR
        System.out.println("TABLA DE LA VERDAD");
        System.out.println("falso | falso es: "+(false | false));
        System.out.println("verdadero | falso es: "+(true | false));
        System.out.println("falso | verdader es: "+(false | true));
        System.out.println("verdadero | verdadero es: "+(true | true));
        //Creacion de la tabla de la verdad operador NOT
        System.out.println("!false es igual a: "+ !false);
        System.out.println("!true es igual a: " + !true);

    }
}
