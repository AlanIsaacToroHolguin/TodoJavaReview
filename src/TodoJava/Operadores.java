
package TodoJava;

public class Operadores {

    public static void run() {
        // Variables base
        int num1 = 7;
        int num2 = 3;

        // Suma (int + int -> int)
        int suma = num1 + num2; // 7 + 3 = 10
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + suma);

        // Resta (int - int -> int)
        int resta = num1 - num2; // 7 - 3 = 4
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + resta);

        // Multiplicación (int * int -> int)
        int multiplicacion = num1 * num2; // 7 * 3 = 21
        System.out.println("Multiplicación: " + num1 + " * " + num2 + " = " + multiplicacion);

        // División entera (int / int -> int). Se truncan los decimales.
        int divisionEntera = num1 / num2; // 7 / 3 = 2 (no 2.3333)
        System.out.println("División entera: " + num1 + " / " + num2 + " = " + divisionEntera);

        // División con decimales:
        // Opción A: casting a double en uno de los operandos
        double divisionDecimalA = (double) num1 / num2; // 7.0 / 3 = 2.3333...
        System.out.println("División decimal (casting): " + num1 + " / " + num2 + " = " + divisionDecimalA);

        // Opción B: usar literales double directamente
        double divisionDecimalB = 7.0 / 3; // 2.3333...
        System.out.println("División decimal (literal double): 7.0 / 3 = " + divisionDecimalB);

        // Módulo (resto de la división). Útil para saber si es divisible.
        int modulo = num1 % num2; // 7 % 3 = 1
        System.out.println("Módulo: " + num1 + " % " + num2 + " = " + modulo);

        // BONUS: usando 'var' (Java 10+). Ojo que 'var' infiere el tipo:
        var sumaVar = num1 + num2;                 // infiere int (10)
        var divisionVar = num1 / num2;             // infiere int (2)
        var divisionVarDouble = (double) num1 / num2; // infiere double (2.3333...)

        System.out.println("\nUsando var:");
        System.out.println("sumaVar (int): " + sumaVar);
        System.out.println("divisionVar (int): " + divisionVar);
        System.out.println("divisionVarDouble (double): " + divisionVarDouble);

        // EXTRA: casos que conviene tener en cuenta
        // - Overflows: si trabajas con números muy grandes, usa long.
        // - Decimales precisos (dinero): considera BigDecimal en lugar de double para evitar errores de precisión.
    }
}
