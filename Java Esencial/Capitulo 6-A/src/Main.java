public class Main {
    public static void main(String[] args) {
        System.out.println("La variable estatica apellido de la clase hermano es "+ Hermano.apellido);
        Hermano hermanoPequeno = new Hermano();
        hermanoPequeno.nombre="Marco";
        Hermano hermanoMayor = new Hermano();
        hermanoMayor.nombre = "Carlos";
        System.out.println("El hermano pequeño se llama " +hermanoPequeno.nombre + " " + hermanoPequeno.apellido);
        System.out.println("El hermano mayor se llama " +hermanoMayor.nombre + " " + hermanoMayor.apellido);
        hermanoPequeno.nombre = "Jesus";

        System.out.println("El hermano pequeño se llama " +hermanoPequeno.nombre + " " + hermanoPequeno.apellido);
        System.out.println("El hermano mayor se llama " +hermanoMayor.nombre + " " + hermanoMayor.apellido);
    }
}
