/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacuela
 */
public class Ejercicio10_apariciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase="uno dos tres uno,dos,tres uno dos tres.";
        String palabra="tres";
        
        
        boolean continuar=true;
        int totalPalabras=0;
        int indiceComienzoPalabra;
        
        System.out.println("Frase-->"+frase);

        while (continuar){
            
            indiceComienzoPalabra = frase.indexOf(palabra);
            
            if (indiceComienzoPalabra!=-1){
                totalPalabras++;
                frase=frase.substring(indiceComienzoPalabra+palabra.length());
                
                //Esto lo pongo para depurar y ver la frase que me queda
                //System.out.println("resto de frase:"+frase);
            } 
            else {
                continuar=false;
            }        
                  
        }
       
        System.out.printf("\nLa palabra [%s] esta %d veces.\n",palabra,totalPalabras);
        
        
        
    }
    
}
