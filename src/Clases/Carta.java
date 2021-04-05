
package Clases;

import java.applet.AudioClip;
import javax.swing.ImageIcon;

public class Carta {
    int numero;
    private AudioClip aud;
    private ImageIcon img;
    
   

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public AudioClip getAudio(){
         aud = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/"+this.getNumero()+".wav"));
        return aud;
    }
    
    public ImageIcon getImage(){
        
        img = new ImageIcon("src/Recursos/"+this.getNumero()+".jpg");
        return img;
    }
}
