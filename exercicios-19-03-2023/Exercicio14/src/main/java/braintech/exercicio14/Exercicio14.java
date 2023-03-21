/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package braintech.exercicio14;

import java.util.*;

/**
 *
 * @author Diego
 */
public class Exercicio14 {

    static double calculaAreaParede(double altura, double largura) {
        double area = altura * largura;
        return area;
    }

    static double calculaAreaAzulejo(double altura, double largura) {
        double area = altura * largura;
        return area;
    }

    static double calculaQtdAzulejo(double areaParede, double areaAzulejo) {
        double qtd = areaParede / areaAzulejo;
        return qtd;
    }

    public static void main(String[] args) {
        double hp, lp, ha, la, areaParede, areaAzulejo, qtdAzulejos;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a altura da parede: ");
        hp = scan.nextInt();
        System.out.println("Digite a largura da parede: ");
        lp = scan.nextInt();
        System.out.println("Digite a altura da szulejo: ");
        ha = scan.nextInt();
        System.out.println("Digite a altura da azulejo: ");
        la = scan.nextInt();

        areaParede = calculaAreaParede(hp, lp);
        areaAzulejo = calculaAreaAzulejo(ha, la);
        
        qtdAzulejos = calculaQtdAzulejo(areaParede, areaAzulejo);
        
        System.out.println("A quantidade de ajulejos necessária é de: " + qtdAzulejos);
    }
}
