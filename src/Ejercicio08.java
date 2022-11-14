/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacuela
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase1="me llamo Pepe";
        String fraseSinEspacios="";
        

        for (int i = 0; i < frase1.length(); i++) {
            if (frase1.charAt(i)!=' '){
                fraseSinEspacios=fraseSinEspacios+frase1.charAt(i);
            }
            
        }
        System.out.println(fraseSinEspacios);
        
      
    }
    
}
