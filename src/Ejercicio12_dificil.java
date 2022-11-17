/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacuela
 */
public class Ejercicio12_dificil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase="Alicia tiene 35 años";
        
        String primeraPalabra;
        String terceraPalabra;
        
        
        //Extraigo la primera palabra.
        //Solo tengo que averiguar el indice del primer espacio en blanco

        int indicePrimerBlanco=0;
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)==' ') { 
                indicePrimerBlanco=i;
                break;
            }
        }
        
        //System.out.println(indicePrimerBlanco);
        primeraPalabra=frase.substring(0, indicePrimerBlanco);
        System.out.println("Primera palabra:["+primeraPalabra+"]");
      
        
        //Extraifo la tercera palabra
        //Tengo que averiguar los indices del segundo y del tercer espacio
        
        int indiceSegundoBlanco=0, indiceTercerBlanco=0;
        
        int totalBlancosEncontrados=0;
        
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)==' ') { 
                
                totalBlancosEncontrados++;
                if (totalBlancosEncontrados==2)
                    indiceSegundoBlanco=i;
                
                if (totalBlancosEncontrados==3)
                    indiceTercerBlanco=i;
                
                
            }
        }
        terceraPalabra=frase.substring(indiceSegundoBlanco+1, indiceTercerBlanco);
         System.out.println("Tercera palabra:["+terceraPalabra+"]");
      
        
        
        
         
        
        
        
        
        
    }
    
}
