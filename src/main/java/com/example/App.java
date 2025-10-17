package com.example;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        int numero = 4;
        System.out.println();
        System.out.println();
        long inicio = System.nanoTime();
        System.out.printf("El término %s de la serie de Fibonacci es %s\n", numero, fibonacci_recursivo(numero));
        long fin = System.nanoTime();
        System.out.printf("La operación ha tardado %s nanosegundos\n", fin - inicio);
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
}
