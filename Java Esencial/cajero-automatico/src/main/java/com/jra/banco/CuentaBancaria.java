package com.jra.banco;
public class CuentaBancaria {
    //Cuando se crea variables de instancia por lo general solo se marcan
    //los valores que seran utilizados y en el metodo "Main" son llamados
    private String titular;
    private TipoDeCuenta tipoDeCuenta;
    private double saldo;
   //Para indicar que una variable es Constante se utiliza
   //la palabra final
    // ENNUMERACION ayuda a limitar los valores
    //public static final String TIPO_AHORRO ="ahorro";
    //public static final String TIPO_NOMINA ="nomina";

    //Constante que represente la comision por operacion
    private final double COMISION =1.2;

    //Los contructores no devuelven nada
    public CuentaBancaria (String titular, TipoDeCuenta tipo, double saldo){
        //this se refiere a las variables de instancia que esten oculatas por parametros
        this.titular=titular;
        this.tipoDeCuenta=tipo;
        this.saldo=saldo;
    }
    public CuentaBancaria(String titular, double saldo){
      this(titular, TipoDeCuenta.AHORRO, saldo);
    }
    public CuentaBancaria(){
        this("",TipoDeCuenta.AHORRO, 0);
    }
    //Metodo para sacar dinero
    //se usa void ya que no esperamos a que nos devuelva algo
    public void sacarDinero (double cantidad){
        //el usuario no podra sacar dinero si la cantidad que tiene es menor a 0
        if (cantidad <0){
            return;
        }
        double comision = calcularComision();
        saldo -= cantidad;
        saldo -= comision;
        //Si se retira en cuenta de nomina no se le cobra comision
        //por otra parte si el usuario retira de una cuenta de ahorro se le quitara una cierta comision
        }


    private double calcularComision(){
    switch (tipoDeCuenta){
        case AHORRO:
            return COMISION;
        case NOMINA:
            return 0;
        default:
            return 0;
    }
    }
    public void ingresarDinero (double cantidad){
        if (cantidad <0){
            return;
        }
        saldo += cantidad;
    }
    public void cambiarTipoDeCuenta(TipoDeCuenta nuevoTipo){
        tipoDeCuenta = nuevoTipo;
    }

    //Obtener saldo
    public double obtenerSaldo(){
        return saldo;
    }

}
