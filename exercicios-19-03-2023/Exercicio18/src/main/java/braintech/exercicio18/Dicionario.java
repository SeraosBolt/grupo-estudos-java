/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braintech.exercicio18;

import java.util.*;

/**
 *
 * @author Diego
 */
public class Dicionario {

    private ArrayList<Termo> termos = new ArrayList();

    public void addTermo(Termo aTermo) {
        termos.add(aTermo);
    }

    public Termo getTermo(String aTermo) {
        Termo termoSelecionado = null;
        for (Termo elem : termos) {
            if (elem.termo.equals(aTermo)) {
                termoSelecionado = elem;
            } else {
                System.out.println("Não achei o Termo");
            }
        }
        return termoSelecionado;
    }

    public void deleteTermo(String aTermo) {
        for (Termo elementoDoArray : termos) {
            if (elementoDoArray.termo.equals(aTermo)) {
                termos.remove(elementoDoArray);
                System.out.println("Termo Deletado");
            } else {
                System.out.println("Não achei o Termo");
            }
        }
    }

    public void getTodosTermos() {
        Collections.sort(termos, new Comparator<Termo>(){
            public int compare(Termo t1, Termo t2){
                return t1.termo.compareTo(t2.termo);
            }
        });
        for (Termo elemTermo : termos) {
            System.out.println("Termo: " + elemTermo.termo);
            System.out.println("Significado: " + elemTermo.significado);
            System.out.println("_________________________");
        }
    }
}
