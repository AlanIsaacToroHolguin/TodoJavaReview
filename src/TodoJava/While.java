package TodoJava;

public class While {

    public static void run(){

        int cont = 0;

        while (cont <= 10){
            System.out.println("Estoy en la vuelta " + cont);
            cont = cont+1;
        }

        boolean centinel = true;

        while (centinel == true){
            System.out.println("El valor de el centinela es"+ centinel);
            centinel = false;
        }


    }
}
