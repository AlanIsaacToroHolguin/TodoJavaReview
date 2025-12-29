package TodoJava;
import java.util.Scanner;
/*
Una pequeña despensa desea calcular los sueldos de sus empleados.Los puestos de los mismos
pueden tener 3 categorias: 1.Repositor 2:Cajero 3.Supervisor.
-Los Repositores cobran $15.890 + un bono del 10%
-Los cajeros sobran $25.630,89 fijos
-Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 11%

Se necesita entonces un programa que,dependiendo del tipo de empleado calcule y muestre
en pantalla el correspondiente sueldo.
 */

public class CondicionalesExercise {

    public static void run(){

         double sueldo = 0;
         int categoria;
         System.out.println("Ingresa el numero del tipo de empleado del cual deseas calcular el sueldo");
         Scanner teclado = new Scanner(System.in);
         categoria = teclado.nextInt();

         if (categoria == 1){
             sueldo = 15890 + (15890*0.10);
         }else {
             if (categoria == 2){
                 sueldo = 25630.89;
             }
             else{
                 if (categoria == 3){
                     sueldo = 35560.20 - (35560.20*0.11);
                 }
                 else{
                     System.out.println("Ingresa un numero de categortia de empleado valido");
                 }
             }
         }
         if (categoria == 1 || categoria == 2 ||categoria == 3) {
             System.out.println("El total del sueldo de la categoria seleccionada " + categoria + " es igual a " + sueldo);
         }
    }
}
