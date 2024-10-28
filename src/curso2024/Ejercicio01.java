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
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner (System.in);
        String cadena;
        String aux;
        char caracter=' ';
        
        
        System.out.println("Dime una cadena:");
        cadena=teclado.nextLine();
        System.out.println("");
        //Pido un caracter y solo 1. Lo controlo con un bucle
        do{
            System.out.println("Dime una caracter:");
            aux=teclado.nextLine();
            
            //la segunda condicion es para controlar el intro
            if (aux.length()>1 || aux.length()==0){ 
                System.out.println("   ERROR, solo 1 caracter");
            }else{
                caracter=aux.charAt(0); //Convertimos una cadena de una letra a un char
            }
            
        }while (aux.length()!=1);
        
        
        //caracter=teclado.nextLine().charAt(0); //opcional sin desglosar
        
        //Parte1
        int apariciones=0; //inicializo contador
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)==caracter){
                apariciones++;
            }
        }
        System.out.println("El caracter '"+caracter+"' aparece "+apariciones+" veces.");
       
        //Parte2
        int numEspacios=0; //inicializo contador
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)==' ') numEspacios++;
        }
        
        System.out.println("La frase tiene "+(numEspacios+1)+" palabras.");
        
        
        
    }
    
}
