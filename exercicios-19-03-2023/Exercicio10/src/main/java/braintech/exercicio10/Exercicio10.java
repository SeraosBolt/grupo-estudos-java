/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package braintech.exercicio10;

/**
 *
 * @author Diego
 */
public class Exercicio10 {

    static void printResultado() {
        int somaImpar = 0;
        long multPar = 1;

        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                multPar *= i;
            } else {
                somaImpar += i;
            }
        }
        
        System.out.println("A soma dos numero impares é de: " + somaImpar);
        System.out.println("A Multiplicação dos numero pares é de: " + multPar);
    }

    public static void main(String[] args) {
        printResultado();
    }
}
