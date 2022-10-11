public class PasoPorReferencia {
    public static void main(String[] args) {
        int variable1 = 23;
        int variable2 = variable1;
        System.out.println("variable1 = " + variable1);
        System.out.println("variable2 = " + variable2);

        variable2=78;
        System.out.println("variable1 = " + variable1);
        System.out.println("variable2 = " + variable2);

        //Nos marca el error de que tenemos un contructor vacio por lo cual debemos de llenar los parametros


        CuentaBancaria cuentaDeJuan = new CuentaBancaria();
        cuentaDeJuan.saldo=23500;

        System.out.println("Cuenta de juan: " + cuentaDeJuan.saldo);

        }
    }

