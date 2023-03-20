/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braintech.exercicio4;

import java.util.*;

/**
 *
 * @author Diego
 */
public class MediaAluno {

    private ArrayList<Double> notas = new ArrayList();

    public void addNota(double aNota) {
        if (aNota <= 100) {
            notas.add(aNota);
            System.out.println("Nota adicionada");

        } else {
            System.out.println("Não pode adicionar nota maior que 100");
        }
    }
    
    public void getMedia(){
        double soma = 0;
        double media = 0;
        for(double elemNota: notas){
            soma += elemNota;
        }
        media = soma/notas.size();
        System.out.println("A média das notas é : " + media);
    }

}
