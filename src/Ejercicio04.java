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
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        String frase="hombres y mujeres tenemos los mismos derechos";
        
        String fraseNueva;
        
        fraseNueva=frase.replace(' ','_');
        
        System.out.println(fraseNueva);

    }

    
}
