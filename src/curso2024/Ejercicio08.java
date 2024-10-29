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
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        String frase1;
        String frase2="";  //la inicializo a la cadena vacia
        
        
        System.out.println("Ejercicio 8 - quitar espacios");
        System.out.println("============================");
        
        System.out.print("Dime la frase:\n>");
        frase1=teclado.nextLine();
        
        for (int i = 0; i < frase1.length(); i++) {
            if (frase1.charAt(i)!=' '){
                frase2=frase2+frase1.charAt(i);
            }
        }
        
        System.out.println("La frase2 copia es:");
        System.out.println(frase2);
        
        
    }
    
}
