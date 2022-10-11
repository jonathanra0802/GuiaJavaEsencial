package com.jra.banco;
public enum TipoDeCuenta {
    //enum se utiliza principalmente para que los ususarios no pueden modificar datos, ya que generalmente no basta conque sea constante el archivo para que el ususario solo pueda utilizar variables ya establecidas se recomienda el uso de ENUM
    //En este caso el ususario solo tendra acceso a las que tenemos marcadas en el ENUM para el ejemplo el tipo de cuenta al que puede accceder el ususario es AHORRO, NOMINA, HIPOTECA, INFANTIL
    AHORRO, NOMINA, HIPOTECA, INFANTIL
}
