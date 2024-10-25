/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso2024;

import java.util.Scanner;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Ejercicio00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        String cadena;
        char caracter;
        String letra;
        
        System.out.println("Dime una cadena:");
        cadena=teclado.nextLine();
        
        //Recorro la cadena con charAt
        System.out.println("La cadena letra a letra es:");
        for (int i = 0; i < cadena.length(); i++) {
            caracter=cadena.charAt(i);
            System.out.println(caracter);
        }
        
        //Recorro la cancion con substring
        System.out.println("Con substring:");
        for (int i = 0; i < cadena.length(); i++) {
            letra=cadena.substring(i,i+1);
            System.out.println(letra);
        }
        
        
        
    }
    
}
