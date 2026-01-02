package TodoJava;

import java.util.Scanner;

public class While {

    public static void run(){

        int cont = 0;

        while (cont <= 10){
            System.out.println("Estoy en la vuelta " + cont);
            cont = cont+1;
        }

        boolean centinel = true;

        while (centinel == true){
            System.out.println("El valor de el centinela es "+ centinel);
            centinel = false;
        }

        //Ejercicio Contar hasta el NumeroiLimite
        System.out.println("Ingrese el numero limite hasta el que desee contar");
        Scanner teclado = new Scanner(System.in);
        int Limite = teclado.nextInt();
        int contador = 1;


        while (contador <= Limite){
            System.out.println("el numero limite es "+ Limite + " y voy en el " + contador);
            contador++;
        }


    }
}
