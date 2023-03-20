/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package braintech.exercicio12;
import java.util.*;
/**
 *
 * @author Diego
 */
public class Exercicio12 {
    static void printResultado(int numero){
        int antecessor = numero-1;
        int sucessor = numero+1;
        System.out.println("Sucessor do Numero informado: "+ sucessor);
        System.out.println("Antecessor do Numero informado: "+ antecessor);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scan.nextInt();
        printResultado(numero);
    }
}
