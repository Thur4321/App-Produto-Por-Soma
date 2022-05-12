
package appprodutoporsoma;

import javax.swing.JOptionPane;

public class AppProdutoPorSoma {
    
    public static void main(String[] args) {
    
        int número=Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o número:","AppProduto",3));
        
        int multiplicador=Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o multiplicador:","AppProduto",3));
        
        MétodoProduto objProduto = new MétodoProduto();
       
        objProduto.setNúmero(número);
        objProduto.setMultiplicador(multiplicador);    
        
        JOptionPane.showMessageDialog(null, "Seu resultado é "+objProduto.multiplicação(),"AppProduto",1);
    }
    
}
