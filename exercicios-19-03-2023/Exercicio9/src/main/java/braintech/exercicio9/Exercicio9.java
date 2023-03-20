/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package braintech.exercicio9;
import java.util.*;
/**
 *
 * @author Diego
 */
public class Exercicio9 {
    static void calculaSalarios(double salario){
        double salMinimo = 1250;
        double media = salario/salMinimo;
        
        System.out.println("Você atualmente ganha um total de: "+media+" Salários minimos.");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite Seu Salário: ");
        double salario = scan.nextDouble();
        calculaSalarios(salario);
        
    }
}
