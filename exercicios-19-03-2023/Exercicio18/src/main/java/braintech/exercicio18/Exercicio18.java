/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package braintech.exercicio18;

/**
 *
 * @author Diego
 */
public class Exercicio18 {

    public static void main(String[] args) {
        Termo termo1 = new Termo("Inteligência Artificial","é a capacidade das máquinas e computadores em realizar tarefas que normalmente requerem inteligência humana, como aprendizagem, raciocínio, percepção, tomada de decisão, entre outras.");
        Termo termo2 = new Termo("Sustentabilidade","é a habilidade de manter ou preservar os recursos naturais e o meio ambiente para as gerações futuras, através do uso responsável dos recursos disponíveis.");
        Termo termo3 = new Termo("Blockchain"," é uma tecnologia de registro distribuído que permite a criação de um livro contábil digital e seguro para o registro de transações financeiras e de outros tipos.");
        Termo termo4 = new Termo("Big Data","é a análise e interpretação de grandes quantidades de dados, geralmente coletados de diversas fontes, para obter insights e informações úteis para empresas e organizações.");
        Termo termo5 = new Termo("Machine Learning","é uma forma de Inteligência Artificial que utiliza algoritmos para aprender com dados e melhorar o desempenho de tarefas específicas ao longo do tempo.");
        Termo termo6 = new Termo("Internet das Coisas (IoT)","é uma rede de dispositivos conectados à internet que são capazes de coletar e trocar informações, permitindo que as pessoas controlem e monitorem objetos e processos de forma remota e automatizada.");
        
        
        Dicionario dicionario = new Dicionario();
        dicionario.addTermo(termo1);
        dicionario.addTermo(termo2);
        dicionario.addTermo(termo3);
        dicionario.addTermo(termo4);
        dicionario.addTermo(termo5);
        dicionario.addTermo(termo6);
        
        Termo selecTermo = dicionario.getTermo("Big Data");
        
        System.out.println("Termo Escolhido: "+ selecTermo.termo);
        System.out.println("Significado do Termo Escolhido: "+ selecTermo.significado);
        
        dicionario.getTodosTermos();
    }
}
