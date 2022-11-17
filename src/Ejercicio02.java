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
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada=new Scanner(System.in);
        String frase="el covid es lo peor";
        
        System.out.print("Dime una frase: ");
        frase=entrada.nextLine(); //.toLowerCase();
        
        //Convierto todo a minúsculas para no tener
        //que buscar tamnbién mayusculas
        frase=frase.toLowerCase();
                
        int totalVocales=0;
        int totalConsonantes=0;
        
        
        System.out.println("Frase:  "+frase);
        
        for (int i = 0; i < frase.length(); i++) {
           
            switch (frase.charAt(i)) {
                case 'a','e','i','o','u':
                    totalVocales++;
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case ' ':
                    break;
                default:
                    totalConsonantes++;
                    break;
            }
        
        }
        
        System.out.println("Total vocales: "+totalVocales);
        System.out.println("Total consonantes: "+totalConsonantes);
        
           
        
        
    }
    
}
