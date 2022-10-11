public class Main {
    public static void main(String[] args) {
        //Ahora nos marca un error al momento de crear los datos ya que tenemos contructores vacios
        //esto esta mucho ya que nos permite llenar todos los campos y no dejamos algun campo vacio
        CuentaBancaria cuentaDeJuan = new CuentaBancaria("Juan Martinez", TipoDeCuenta.HIPOTECA, 25500);
        //Para acceder a las variables se debe primero entrar a la clase y de ahi
        //con un punto. llamas al atributo que requieres

        /*cuentaDeJuan.titular="Juan Ramirez";
        cuentaDeJuan.tipoDeCuenta="Nomina";
        cuentaDeJuan.saldo = 25500;*/

        //Con el metodo de sacar dinero le estamos restando 500 al ultimo valor que se encontraba en saldo en este caso a los 25,500 por lo que nos deberia de mostrar 25,000 en pantalla
        cuentaDeJuan.sacarDinero(500);
        System.out.println("Ahora cuentaDeJuan tiene: " +cuentaDeJuan.saldo);
        //Con el metodo ingresar dinero debemos de meter dinero a la ultima cantidad guardada en saldo en este caso ya no sera 25,5000 si no 25,000 ya que fue el ultimo saldo que se teniam.
        //en pantalla se debera mostrar 26,000
        cuentaDeJuan.ingresarDinero(1000);
        System.out.println("Despues de ingresar dinero a cuentaDeJuan tiene: "+cuentaDeJuan.saldo);

        cuentaDeJuan.cambiarTipoDeCuenta(TipoDeCuenta.AHORRO);

        //Se llama al saldo a travez de un metodo
        double saldo = cuentaDeJuan.obtenerSaldo();
        System.out.println("El saldo de juan es "+saldo);
    }
}
