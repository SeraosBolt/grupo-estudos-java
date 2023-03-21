/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package braintech.exercicio17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Exercicio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a data (no formato dd/MM/yyyy): ");
        String dataString = scanner.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date data = sdf.parse(dataString);
            String diaDaSemana = new SimpleDateFormat("EEEE").format(data);
            System.out.println("O dia da semana da data " + dataString + " é " + diaDaSemana + ".");
        } catch (ParseException e) {
            System.out.println("Data inválida!");
        }

    }
}
