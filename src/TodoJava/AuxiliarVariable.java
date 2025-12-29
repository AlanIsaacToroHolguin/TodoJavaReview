package TodoJava;

public class AuxiliarVariable {

    public static void run(){

        int num1 = 35;
        int num2 = 20 ;
        int aux;
        System.out.println("--------Antes--------");
        System.out.println(" Num1: " + num1 + " Num2: " + num2 );

        aux = num2;
        num2 = num1;
        num1 = aux;
        System.out.println("--------Despues--------");
        System.out.println(" Num1:" + num1 + " Num2: " + num2 );

    }
}
