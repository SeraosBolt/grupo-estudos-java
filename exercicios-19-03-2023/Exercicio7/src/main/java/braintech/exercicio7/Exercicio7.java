/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package braintech.exercicio7;

import java.util.*;

/**
 *
 * @author Diego
 */
public class Exercicio7 {

    static void printTotal(double valor1, double valor2, int qtd1, int qtd2, double ipi) {
        double resultado = ((valor1 * qtd1) + (valor2 * qtd2)) * ((ipi / 100) + 1);
        System.out.println("O Valor da compra com o crecimo do IPI de: " + ipi + "% é de: " + resultado);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valorIPI = 15;
        double valorPeca1;
        double valorPeca2;
        int qtdPeca1;
        int qtdPeca2;
        System.out.println("Digite o valor da peça 1");
        valorPeca1 = scan.nextDouble();
        System.out.println("Quantidade da peça 1");
        qtdPeca1 = scan.nextInt();
        System.out.println("Digite o valor da peça 2");
        valorPeca2 = scan.nextDouble();
        System.out.println("Qunatidade da peça 2");
        qtdPeca2 = scan.nextInt();
        printTotal(valorPeca1, valorPeca2, qtdPeca1, qtdPeca2, valorIPI);
        
    }
}
