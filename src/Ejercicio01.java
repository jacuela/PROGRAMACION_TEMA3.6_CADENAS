/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author jacuela
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner (System.in);
        String cadena;
        String aux;
        char caracter;
        int apariciones=0;
        
        
        System.out.println("Dime una cadena:");
        cadena=entrada.nextLine();
        
        
        System.out.println("Dime una caracter:");
        aux=entrada.nextLine();
        caracter=aux.charAt(0); //Convertimos una cadena de una letra a un char
        
        //caracter=entrada.nextLine().charAt(0); //opcional sin desglosar
        
        //Parte1
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)==caracter){
                apariciones++;
            }
        }
        System.out.println("El caracter '"+caracter+"' aparece "+apariciones+" veces.");
       
        //Parte2
        int numEspacios=0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)==' ') numEspacios++;
        }
        
        System.out.println("La frase tiene "+(numEspacios+1)+" palabras.");
        
        
        
        
    }
    
}
