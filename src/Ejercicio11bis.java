/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacuela
 */
public class Ejercicio11bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase="me gusta el jamon";
      
        String resultado="";
        char caracter,caracterMayus;
        
        
        //Tendríamos que depurar espacios iniciales
        caracter=frase.charAt(0);
        caracterMayus=Character.toUpperCase(caracter);
        resultado=resultado+caracterMayus;
        
        
        for (int i = 1; i < frase.length(); i++) {
            
            if (frase.charAt(i-1)==' '){
                //El caracter anterior es un espacio
                //pongo en mayusculas el caracte actual
                caracter=frase.charAt(i);
                caracterMayus=Character.toUpperCase(caracter);
                resultado=resultado+caracterMayus;
            }
            else{
                caracter=frase.charAt(i);
                resultado=resultado+caracter;
            }
        }
        
        
        System.out.println(resultado);
        
        
        
    }
    
}
