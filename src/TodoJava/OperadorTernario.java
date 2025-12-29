package TodoJava;
import java.util.Scanner;

public class OperadorTernario {

    public static void run(){

        double promedio;
        String condicionFinal;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el promedio general de el alumno en la academia Todocode");

        promedio = teclado.nextDouble();

        condicionFinal = promedio >=6 ?"aprobado" :"Desaprobado";
        System.out.println("La condición final del alumno es:" + condicionFinal + " en la academia todocode");

    }
}
