public class OperadoresDeAsignacion {
    public static void main(String[] args) {
        //El operador de asignacion se representa con un "="

        int variable;
        variable = 3;
        int variable2;
        variable2=8*9+95;

        int a, b, c;
        a=b=c=8;

        System.out.println("Que valor tiene c= 8? " + (c= 8));

        int x=10;
        x= x+3;
        System.out.println("x = " + x);

        //metodo de asignacion acortado
        int y=10;
        y +=3;
        System.out.println("El valor de Y es:" +y);
    }
}
