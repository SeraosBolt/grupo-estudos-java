/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braintech.exercicio8;

/**
 *
 * @author Diego
 */
public class ComparaNumero {

    public void compara(double num1, double num2) {
        boolean isIgual = false;
        double maior = 0;
        double menor = 0;
        if (num1 == num2) {
            isIgual = true;
        }
        if (num1 > num2) {
            maior = num1;
            menor = num2;
        } else if (num1 < num2) {
            maior = num2;
            menor = num1;
        } else {
            maior = num2;
            menor = num1;
        }
        if (isIgual) {
            System.out.println("Os dois Números São Iguais");
        } else {

            System.out.println("Os Números são diferentes");
        }
        System.out.println("O maior numero é : " + maior);
        System.out.println("O menor numero é : " + menor);

    }
}
