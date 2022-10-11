public class MainCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double radio = 4.0;
        double area = calculadora.calculadoraAreaCirculo(radio);
        System.out.println("El area de un circulo de radio de 4 es " + area);

        System.out.println("El volumen de un prisma de 5 por 4 por 8 es: " + calculadora.calcularVolumenPrismaRectangular(5,4,8));

        calculadora.calcularMedia(2.6,2,5.9,8);
        System.out.println("La media es: "+ calculadora.calcularMedia(2,4,6,8));
    }
}
