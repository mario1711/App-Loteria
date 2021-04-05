
package Clases;

/**
 *
 * @author Mario
 */
public class Pila {
    private Carta[] pila;
    private int tope;
    
    
     public Pila(){
        this.pila= new Carta[54];
        this.tope=0;
        
         for (int i = 0; i < pila.length; i++) {
            pila[i]=new Carta();
        }
        
    }
     
     
      public boolean pilaVacia(){
        if(tope==0)
            return true;
        else
            return false;
    }
    
    public boolean pilaLlena(){
        if(tope==pila.length)
            return true;
        else
            return false;
    }
    
    public void Push(Carta c){
        if (!this.pilaLlena()){
            pila[tope++]=c;
        }
    }
    
    public Carta Pop(){
        Carta objRet= new Carta();
        
        if(!this.pilaVacia())
            objRet=pila[--tope];
        
        return objRet;
        
    }
    
    
    
}
