/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.grupoestudos.exercicio3;

/**
 *
 * @author mathy
 */
public class Exercicio3 {

    static double calcMedia(double num1, double num2, double num3) {
        double media = (num1 + num2 + num3) / 3;
        return media;
    }
    
    static double somaMedia(double media1, double media2){
        double somaMedia = media1 + media2;
        return somaMedia;
    }
    
    static double mediaMedias(double media1, double media2){
        double mediaMedias = (media1+media2)/2;
        return mediaMedias;
    }

    public static void main(String[] args) {
        double media1;
        double media2;
        
        media1 = calcMedia(8,9,7);
        media2 = calcMedia(4,5,6);
        
        double somaMedias = somaMedia(media1, media2);
        double mediaDasMedias = mediaMedias(media1, media2);
        
        System.out.println("Média dos numeros 8, 9, 7: " + media1);
        System.out.println("Média dos numeros 4, 5, 6: "+ media2);
        System.out.println("Soma das Médias: "+ somaMedias);
        System.out.println("Média das médias: "+ mediaDasMedias);
    }
}
