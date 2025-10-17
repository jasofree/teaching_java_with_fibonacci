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
        int numero = 6;
        System.out.println();
        System.out.println();
        System.out.printf("El término %s de la serie de Fibonacci es %s\n", numero, fibonacci(numero));
        System.out.println();
        System.out.println();
    }

    static int fibonacci(int numero) {
        if (numero <= 2) {
            return numero - 1;
        } else {
            return fibonacci(numero - 1) + fibonacci(numero - 2);
        }
    }
}
