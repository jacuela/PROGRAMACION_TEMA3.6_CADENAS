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
public class Ejercicio00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner (System.in);
        String cadena;
        
        System.out.println("Dime una cadena:");
        cadena=entrada.nextLine();
        System.out.println("");
        
        //Forma1
        System.out.println("Forma1: con charAt()");
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }
        
        
        
        //Forma2
        System.out.println("Forma2: con subString()");
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.substring(i, i+1));
        }
        
        
        
        
    }
    
}
