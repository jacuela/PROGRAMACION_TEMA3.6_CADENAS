/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jacuela
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado=new Scanner (System.in);
        String frase,fraseCifrada="";
        int caracter;
        
        System.out.println("MAQUINA DE CIFRADO");
        System.out.println("==================");
        
        
        System.out.print("Frase en claro-->");
        frase=teclado.nextLine();
        
        
        for (int i = 0; i < frase.length(); i++) {
            
            caracter=frase.charAt(i)+1;
            
            fraseCifrada=fraseCifrada+Character.toString(caracter);
            
        }
        System.out.println("\n. . . cifrando . . .\n");
        
        //OPCIONAL. Espero 1 segundo para que parezca que esta cifrando
        try {
            Thread.sleep (1000);
        } catch (InterruptedException ex) {
            ex.getMessage();
        }
        //FIN OPCIONAL
        
        System.out.println("Frase cifrada-->\033[31m"+fraseCifrada+"\033[30m");
        
        
        
        System.out.println("\n\n");
        System.out.println("MAQUINA DE DESCIFRADO");
        System.out.println("=====================");
        System.out.println("Copia y pega con el ratón la frase a descifrar...");
        
        
        frase="";
        System.out.print("\nFrase cifrada-->");
        fraseCifrada=teclado.nextLine();
        
        
        for (int i = 0; i < fraseCifrada.length(); i++) {
            
            caracter=fraseCifrada.charAt(i)-1;
            
            frase=frase+Character.toString(caracter);
            
        }
        
        System.out.println("\n. . . descifrando . . .\n");
        
        //OPCIONAL. Espero 1 segundo para que parezca que esta cifrando
        try {
            Thread.sleep (1000);
        } catch (InterruptedException ex) {
            ex.getMessage();
        }
        //FIN OPCIONAL
        
        
        System.out.println("Frase en claro-->\033[32m"+frase+"\033[30m");
       
        System.out.println("");System.out.println("");
        
        
        
        
    }
    
}
