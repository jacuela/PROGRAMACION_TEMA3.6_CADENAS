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
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner (System.in);
      
    
        
        //Recogiendo un char por teclado
        char continuar;        
        System.out.println("Recogiendo un char por teclado");
        System.out.println("------------------------------");
        do{
            System.out.print("¿Quieres continuar [S | N]?:  ");
            continuar=teclado.nextLine().charAt(0);
            continuar=Character.toUpperCase(continuar);
            
            System.out.println("");
            
        }while (continuar == 'S');
        
        System.out.println("");
        
        //Recogiendo un String por teclado
        String continuar2;
        System.out.println("Recogiendo un String por teclado");
        System.out.println("------------------------------");
        do{
            System.out.print("¿Quieres continuar [S | N]?:  ");
            continuar2=teclado.nextLine().substring(0, 1);
            continuar2=continuar2.toUpperCase();
            
            System.out.println("");
            
        }while (continuar2.equals("S"));
        
        
        
    }
    
}
