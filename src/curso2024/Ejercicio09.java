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
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        String frase1;
        String frase2="";  //la inicializo a la cadena vacia
        char caracter,caracterMayus;
        
        
        System.out.println("Ejercicio 9 - o por 0 e i por 1");
        System.out.println("===============================");
        
        frase1="el rock mola siempre";
        
        for (int i = 0; i < frase1.length(); i++) {
            if (frase1.charAt(i)=='o'){
                frase2=frase2+'0';
            }
            else if(frase1.charAt(i)=='i'){
                frase2=frase2+'1';
            }
            else{
                caracter=frase1.charAt(i);
                caracterMayus=Character.toUpperCase(caracter);
                frase2=frase2+caracterMayus;
            }
        }
        
        System.out.println(frase2);
        
        
        
        
    }
    
}
