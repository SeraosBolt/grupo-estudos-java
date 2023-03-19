/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupoestudos.exercicio1;

/**
 *
 * @author mathy
 */
// classe maiorNumero
public class MaiorNumero {
    private int num1;
    public int num2;
    
    //Metodo que recebe dois numeros inteiro e diz qual o maior
    public void getMaiorNumero(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("O maior Número é: " + num1);
        } else {
            System.out.println("O maior Número é: " + num2);
        }
    }
}
