/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package braintech.exercicio16;

/**
 *
 * @author Diego
 */
public class Exercicio16 {
    static void qtdCavalos(double massa, double altura, double segundos){
        double cavalos =((massa*altura)/segundos)/745.6999;
        System.out.println("A quantida de cavalos necessária é de : "+cavalos);
    }
    public static void main(String[] args) {
        qtdCavalos(15.6, 10, 1);
    }
}
