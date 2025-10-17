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
        int numero = 40;
        System.out.println();
        System.out.println();
        System.out.printf("Término %s\n", numero);
        System.out.println("----------");
        long inicio_fibonacci_recursivo = System.nanoTime();
        int calculo_fibonacci_recursivo = fibonacci_recursivo(numero);
        long fin_fibonacci_recursivo = System.nanoTime();
        System.out.printf("Cálculo recursivo:\t %s - %s nanosegundos\n", calculo_fibonacci_recursivo, fin_fibonacci_recursivo - inicio_fibonacci_recursivo);
        long inicio_fibonacci_formula = System.nanoTime();
        int calculo_fibonacci_formula = fibonacci_formula(numero);
        long fin_fibonacci_formula = System.nanoTime();
        System.out.printf("Cálculo fórmula:\t %s - %s nanosegundos\n", calculo_fibonacci_formula, fin_fibonacci_formula - inicio_fibonacci_formula);
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
