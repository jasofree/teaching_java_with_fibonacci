package com.example;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        int numero = 40;
        System.out.println();
        System.out.println();
        long inicio = System.nanoTime();
        System.out.printf("Termino %s\n", numero);
        System.out.println("----------");
        System.out.printf("Calculo recursivo:       %s", fibonacci_recursivo(numero));
        long fin = System.nanoTime();
        System.out.printf(" - %s nanosegundos\n", fin - inicio);
        long inicio2 = System.nanoTime();
        System.out.println();
        System.out.printf("Calculo formula:         %s", fibonacci_formula(numero));
        long fin2 = System.nanoTime();
        System.out.printf(" - %s nanosegundos\n", fin2 - inicio2);
        System.out.println();
        System.out.println();
    }

    static int fibonacci_recursivo(int numero) {
        if (numero <= 2) {
            return numero - 1;
        } else {
            return fibonacci_recursivo(numero - 1) + fibonacci_recursivo(numero - 2);
        }
    }

    static int fibonacci_formula(int numero) {
        double raiz_de_5 = Math.sqrt(5);
        double phi = (1 + raiz_de_5) / 2;
        double psi = (1 - raiz_de_5) / 2;
        return (int) ((Math.pow(phi, numero - 1) - Math.pow(psi, numero - 1)) / raiz_de_5);
    }
}
