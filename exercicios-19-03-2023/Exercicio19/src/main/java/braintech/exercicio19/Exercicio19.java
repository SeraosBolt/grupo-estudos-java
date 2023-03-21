/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package braintech.exercicio19;

import java.util.*;

/**
 *
 * @author Diego
 */
public class Exercicio19 {

    static void getTodasPessoas(ArrayList<Pessoa> pessoas) {

        Collections.sort(pessoas, new Comparator<Pessoa>() {
            public int compare(Pessoa t1, Pessoa t2) {
                return t1.nome.toLowerCase(Locale.ITALIAN).compareTo(t2.nome.toLowerCase(Locale.ITALIAN));
            }
        });
        System.out.println("Ordenado por Nome:");
        for (Pessoa elemPessoa : pessoas) {
            System.out.println("Nome: " + elemPessoa.nome);
            System.out.println("Idade: " + elemPessoa.idade);
            System.out.println("Altura: " + elemPessoa.altura);
            System.out.println("_________________________");
        }
        Collections.sort(pessoas, new Comparator<Pessoa>() {
            public int compare(Pessoa t1, Pessoa t2) {
                if (t1.idade > t2.idade) {
                    return -1;
                } else if (t1.idade < t2.idade) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println("Ordenado por Idade:");
        for (Pessoa elemPessoa : pessoas) {
            System.out.println("Nome: " + elemPessoa.nome);
            System.out.println("Idade: " + elemPessoa.idade);
            System.out.println("Altura: " + elemPessoa.altura);
            System.out.println("_________________________");
        }

        Collections.sort(pessoas, new Comparator<Pessoa>() {
            public int compare(Pessoa t1, Pessoa t2) {
                if (t1.altura > t2.altura) {
                    return -1;
                } else if (t1.altura < t2.altura) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("Ordenado por Altura:");
        for (Pessoa elemPessoa : pessoas) {
            System.out.println("Nome: " + elemPessoa.nome);
            System.out.println("Idade: " + elemPessoa.idade);
            System.out.println("Altura: " + elemPessoa.altura);
            System.out.println("_________________________");
        }
    }

    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String nome;
            int idade;
            double altura;
            System.out.println("Digite um nome:");
            nome = scan.next();
            System.out.println("Digite uma idade:");
            idade = scan.nextInt();
            System.out.println("Digite uma Altura:");
            altura = scan.nextDouble();
            Pessoa pessoa = new Pessoa(nome, idade, altura);
            pessoas.add(pessoa);
        }

        getTodasPessoas(pessoas);
    }

}

class Pessoa {

    public String nome;
    public int idade;
    public double altura;

    public Pessoa(String aNome, int aIdade, double aAltura) {
        this.nome = aNome;
        this.idade = aIdade;
        this.altura = aAltura;
    }
}
