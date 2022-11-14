/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacuela
 */
public class Ejercicio09_rock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String frase1="el rock mola siempre";
        
        String frase2="";
        
        String caracter;
        
        
        for (int i = 0; i < frase1.length(); i++) {
            
            if (frase1.charAt(i)=='o'){
                frase2=frase2+'0';
            }
            else if (frase1.charAt(i)=='i'){
                frase2=frase2+'1';
            }
            else{    
                caracter=frase1.substring(i, i+1); //caracter en minuscula
                frase2=frase2+caracter.toUpperCase();
            }
            
        }
       
        System.out.println(frase2);
        
        
        
    }
    
}
