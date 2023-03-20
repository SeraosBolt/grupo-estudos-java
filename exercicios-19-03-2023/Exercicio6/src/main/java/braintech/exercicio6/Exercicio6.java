/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package braintech.exercicio6;

import java.util.*;

/**
 *
 * @author Diego
 */
public class Exercicio6 {
    static void printSaldo(double salario){
        double acrescimo = salario += (salario*0.01);
        System.out.println("Seu saldo com reajuste de 1% é de: " + acrescimo);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite seu salário: ");
        double salario = scan.nextDouble();
        printSaldo(salario);
        
    }
}
