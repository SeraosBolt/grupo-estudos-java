/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package braintech.exercicio20;

/**
 *
 * @author Diego
 */
public class Exercicio20 {

    public static void main(String[] args) {
        classeX x = new classeX();
        
        x.getClassY("é tudo um teste");
    }
}

class classeX{
    private String atributo;
    
    private void getAtributo(){
        System.out.println(atributo);
    }
    
    public void getClassY(String novoAtributo){
        ClasseY y = new ClasseY();
        y.changeAttr(novoAtributo);
    }
    
    class ClasseY{
    
        void changeAttr(String novoAttr){
            atributo = novoAttr;
            getAtributo();
        }
    }
}
