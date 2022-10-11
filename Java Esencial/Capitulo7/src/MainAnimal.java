public class MainAnimal {
    public static void main(String[] args) {
        Animal perro = new Animal("Canis Lupus", 4);
        Animal gato = new Animal("Fis silvestreis",4);
        Animal otroPerro= new Animal("Canis Lupus", 4);
        System.out.println("¿Es igual el objeto de gato que el de perro?"+perro.equals(gato));
        System.out.println("¿Es igual el objeto de otroPerro que el de perro?"+perro.equals(otroPerro));
    }
}
