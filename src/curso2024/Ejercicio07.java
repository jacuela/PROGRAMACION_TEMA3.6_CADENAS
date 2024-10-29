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
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        String palabra1;
        String palabra2;
        boolean sonIguales=true; //busco al diferencia
        
        
        System.out.println("Palabras iguales o distintas");
        System.out.println("============================");
        
        System.out.print("Dime la primera palabra:\n>");
        palabra1=teclado.nextLine();
        palabra1=palabra1.toLowerCase();  //lo paso todo a minusculas
        System.out.print("Dime la segunda palabra:\n>");
        palabra2=teclado.nextLine();
        palabra2=palabra2.toLowerCase();  //lo paso todo a minusculas
        
        
        if (palabra1.length()!=palabra2.length()){
            sonIguales=false;   
        }else{
            //Recorro letra a letra buscando la diferencia
            for (int i = 0; i < palabra1.length(); i++) {
                if (palabra1.charAt(i)!=palabra2.charAt(i)){
                    sonIguales=false;
                    //break;  //si entro aquí, podría salir ya del bucle
                }
            }
        }
        
        //Analizo el booleano
        if (sonIguales){
             System.out.println("\033[32m Son IGUALES \033[30m");
        }
        else{
            System.out.println("\033[31m Son DISTINTAS \033[30m");
        }
        
    }
    
}
