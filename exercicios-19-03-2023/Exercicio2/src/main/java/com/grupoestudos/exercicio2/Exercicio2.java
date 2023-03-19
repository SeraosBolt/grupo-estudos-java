/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.grupoestudos.exercicio2;

/**
 *
 * @author mathy
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Contato matheus = new Contato();
        Contato lucas = new Contato();
        Contato nicolas = new Contato();

        Agenda agenda = new Agenda();

        matheus.nome = "Matheus";
        matheus.email = "Matheus@hotmail.com";
        lucas.nome = "Lucas";
        lucas.email = "likinharj@gmail.com";
        nicolas.nome = "Nicolas";
        nicolas.email = "Nicolas@outlook.com";

        agenda.addContato(matheus);
        agenda.addContato(lucas);
        agenda.addContato(nicolas);

//        agenda.getTodosContatos();

        Contato contatoSelecionado = agenda.getContato("Lucas");
        System.out.println("Você escolheu o: " + contatoSelecionado.nome);
        System.out.println("com o Email: " + contatoSelecionado.email);

        agenda.deleteContato("Lucas");

        agenda.getTodosContatos();
        
    }
}
