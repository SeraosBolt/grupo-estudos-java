/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package braintech.exercicio4;

/**
 *
 * @author Diego
 */
public class Exercicio4 {

    public static void main(String[] args) {
        MediaAluno media = new MediaAluno();
        
        media.addNota(101);
        media.addNota(55);
        media.addNota(60);
        media.addNota(80);
        
        media.getMedia();
    }
}
