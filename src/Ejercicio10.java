/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacuela
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase="Tres tigres son uno,dos,tres.";
        String palabra="tres";
        int contador=0;
        
        frase=frase.toLowerCase();
        
        frase=frase.replace(',',' ');
        frase=frase.replace('.',' ');
        
        System.out.println("Frase:"+frase);
        
        String[] palabras=frase.split(" ");
        
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals(palabra)){
                contador++;
            }
        }
        
        System.out.printf("\nLa palabra [%s] esta %d veces.\n",palabra,contador);
        
        
        
    }
    
}
