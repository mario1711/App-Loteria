
package Clases;


import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author usuario
 */
public class Baraja {
    
    Random azar = new Random();
    private Carta cartas[];
    private static final int NUM_CARTAS=54;
    private int  posicionAleatoria;
    private int posSigCarta;
    public Pila1 cartasSacadas;
    public  Pila1 pAux;
    

    public Baraja() {
       this.crearBaraja();
       this.posSigCarta=0;
       this.barajar();
       this.cartasSacadas = new Pila1(54);
       this.pAux = new Pila1(54);
    }
    
     //Metodos 
    public void crearBaraja(){
        
     cartas= new Carta [NUM_CARTAS];
        
     for (int i = 0; i < cartas.length; i++){
            cartas[i]=new Carta();
            cartas[i].setNumero(i+1);
           
        }
        
        
    }
    
    public void barajar(){
        crearBaraja();
        Carta c;
        for (int i = 0; i < cartas.length; i++) {
            c=cartas[i];
            posicionAleatoria = azar.nextInt(cartas.length);
            cartas[i] = cartas[posicionAleatoria];
            cartas[posicionAleatoria]=c;
            if(i==posicionAleatoria)
                posicionAleatoria = azar.nextInt(cartas.length);
                
        }
          
    }
    
    public Carta sigCarta(){
       
  
        Carta c = null;

        if (posSigCarta == NUM_CARTAS) {
            JOptionPane.showMessageDialog(null, "Ya no quedan cartas");

        } else {
            c = cartas[posSigCarta++];
            
                cartasSacadas.Push(c);
            
        }

        return c;
    }
    
    public Carta antCarta(){
 
        Carta ca = null;

        if (posSigCarta <= 1) {
            return null;

        } else {
            ca = cartas[posSigCarta-2];
        }

        return ca;
    } 
    
    public Carta mostrarCartasSacadasIzq(){
        Carta ret;
        
        if (cartasSacadas.pilaVacia()) {
            ret = null;
        } else{
              ret = cartasSacadas.Pop();
              pAux.Push(ret);
        }
        
        return ret;
      
    }
    
    public Carta mostrarCartasSacadasDer(){
        Carta ret;
        
        
        if (pAux.pilaVacia()) {
            ret = null;
        } else{
              ret = pAux.Pop();
              cartasSacadas.Push(ret);
        }
        
        return ret;
    }
    
    
    
    public int getSize(){
        return cartas.length;
    }
    
   
}
