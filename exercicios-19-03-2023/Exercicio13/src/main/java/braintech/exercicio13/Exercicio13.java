/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package braintech.exercicio13;

/**
 *
 * @author Diego
 */
public class Exercicio13 {

    static double kelvin(double temp) {
        double kelvin = temp + 273.15;
        return kelvin;
    }

    static double reaumur(double temp) {
        double reaumur = temp  * 0.8;
        return reaumur;
    }

    static double rankine(double temp) {
        double rankine = ((temp * 1.8) + 32 + 459.67);
        return rankine;
    }

    static  double fahrenheit(double temp) {
        double fahrenheit = ((temp  * 1.8) + 32);
        return fahrenheit;
    }

    static void printResultado(double temp) {
        System.out.println("Temperatura em Kelvin (K): "+kelvin(temp)+"ºK");
        System.out.println("Temperatura em Réaumur (Re): "+reaumur(temp)+"ºRe");
        System.out.println("Temperatura em Rankine (Ra): "+rankine(temp)+"ºRa");
        System.out.println("Temperatura em Fahrenheit (F): "+fahrenheit(temp)+"ºF");
    }

    public static void main(String[] args) {
        printResultado(35.5);
    }
}
