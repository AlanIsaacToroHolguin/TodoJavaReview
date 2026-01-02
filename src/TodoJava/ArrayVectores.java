package TodoJava;

import java.util.Scanner;

public class ArrayVectores {

    public static void run(){

        //Declaración del vector

        /*int[] vector = new int [5];
        //Ingreso Manual de los datos del vector.
        vector[0] = 10;
        vector[1] = 23;
        vector[2] = 2;
        vector[3] = 50;
        vector[4] = 35;
        */
        //Ingreso por teclado de los datos del vector.
        //Declaración del vector
        int[] vector = new int[5];

        Scanner teclado = new Scanner(System.in);

        for (int i = 0;  i<vector.length; i++ ){

            System.out.println("Ingresa el valor del indice " + i);
            vector[i] = teclado.nextInt();

        }
        //Recorrido del vector
        for (int i = 0;  i<vector.length; i++ ){
            System.out.println("Estoy en el indice " + i);
            System.out.println("Tengo guardado un " + vector[i]);
            System.out.println("------------------");

        }


        //Ejercicio:Solicitar un array dew 15 num y mostrar cuantas veces se repite el 3
        int[] vectorejercicio = new int [15];

        Scanner teclado2 = new Scanner(System.in);

        for(int in = 0; in<15; in++){
            System.out.println("Ingresa un numero para el vector");
            vectorejercicio[in] = teclado.nextInt();
        }
        //Recorrer y contar cuantos 3 ahí
        int cont2 = 0;
        for(int in = 0; in<15; in++){
            if(vectorejercicio[in] == 3){
                cont2 = cont2 + 1;
            }
        }
        System.out.println("La cantidad de numeros 3 que hay es "+ cont2);



    }
}
