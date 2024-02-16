public class CicloFor {
    public static void main(String[] args) {
        short[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        imprimir(numeros);
        pares(numeros);
        mejorado(numeros);
    }// fin del método main

    // imprimir en consola
    public static void imprimir(short[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }// fin del metodo imprimir

    // imprimir solo los numeros pares:
    public static void pares(short[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println(); // Agregado para un salto de línea después de imprimir los pares
    }// fin del metodo pares

    // ciclo for each
    public static void mejorado(short[] array) {
        for (short elemento : array) {
            if (elemento % 2 == 0) {
                System.out.print(elemento + " ");
            }
        }
        System.out.println(); // Agregado para un salto de línea después de imprimir los pares
    }// fin del metodo mejorado
}
