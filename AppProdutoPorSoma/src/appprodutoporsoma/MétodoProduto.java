
package appprodutoporsoma;

public class MétodoProduto {
    
    private int número;
    
    private int multiplicador;
    
    public int getNúmero(){
        return número;
    }
    
    public void setNúmero(int número1){
        número=número1;
    
    }
    
    public int getMultiplicador(){
        return multiplicador;
    }
    
    public void setMultiplicador(int número2){
        multiplicador=número2;
    
    }
    public long multiplicação (){
        long resultado=0;
        int cont=1;
        while (cont <= multiplicador){
            resultado = número + resultado;
            cont = cont + 1;
        }
        return resultado;    
    }
    public long multiplicaçãoDoWhile (){
        long resultado=0;
        int cont=1;
        do { 
        resultado = número + resultado;
            cont = cont + 1;
        } while (cont <= multiplicador);
        return resultado;
    }
    public long multiplicaçãoFor (){
        long resultado=0;
        for (int cont = 1; cont <= multiplicador; cont++){
            resultado = número + resultado;
         }
        return resultado;
    }
   
}
