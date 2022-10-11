public class AlcanzeDeLasVariables {
    public static void main(String[] args) {
        int dias =0;
        //Un bucle while realiza la accion hasta que lo marque el parametor que se encuentra dentro de los parentesis () en este caso el programa corre hasta llegar a los 30 dias
        while (dias<30){
            dias = dias+1;
            int semanas = dias/7;
            System.out.println("Han pasado "+ dias + " dias lo que supone " +semanas+ " semanas" );
        }
    }
}
