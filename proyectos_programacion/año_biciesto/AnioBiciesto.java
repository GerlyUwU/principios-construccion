
/*
 * Un año biciesto en el calendario gregoriano, si es divisible entre 4 y no divisible entre 100 
 * y tambien si es divisible entre 400.
 */
import java.util.Scanner;

public class AnioBiciesto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int anio;

        System.out.println("ingrese el año a evaluar:");
        anio = teclado.nextInt();

        esBiciesto(anio);
    }

    public static void esBiciesto(int anio) {
        if (anio % 4 == 0 && anio % 100 !=0 || anio % 400 == 0 ) {
            System.out.println("el año "+ anio +" es biciesto");
            return;
        }
       System.out.println("el año "+ anio + " no es biciesto");
    }
}