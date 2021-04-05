
package Clases;


/**
 *
 * @author Mario
 */
public class Pila1 {
    
    
    private Carta[] arrAlumno;
    private int tope;
    
    public Pila1(){
        this.arrAlumno=null;
        this.tope=0;
        
    }
    
    
    public Pila1(int dimension){
        this.arrAlumno= new Carta[dimension];
        
        for (int i = 0; i < arrAlumno.length; i++) {
            arrAlumno[i]=new Carta();
        }
        
        this.tope=0;
    }
    
    public boolean pilaVacia(){
        if(tope==0)
            return true;
        else
            return false;
    }
    
    public boolean pilaLlena(){
        if(tope==arrAlumno.length)
            return true;
        else
            return false;
    }
    
    public void Push(Carta alu){
        if (!this.pilaLlena()){
            arrAlumno[tope++]=alu;
        }
    }
    
    public Carta Pop(){
        Carta objRet= new Carta();
        
        if(!this.pilaVacia())
            objRet=arrAlumno[--tope];
        
        return objRet;
        
    }

}
