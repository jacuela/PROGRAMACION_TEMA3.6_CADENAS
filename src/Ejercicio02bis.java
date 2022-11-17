
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class Ejercicio02bis {

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
           
            System.out.println(frase.charAt(i)+0);
            
            //Busco vocales
            if (frase.charAt(i)=='a' 
                    || frase.charAt(i)=='e' 
                    || frase.charAt(i)=='i'
                    || frase.charAt(i)=='o' 
                    || frase.charAt(i)=='u'){
                
                totalVocales++;
            }
            //Busco la ñ 
            else if (frase.charAt(i)=='ñ'){
               totalConsonantes++;

            }
            //Busco caracteres ACII entre 'a' y 'z'
            else if (frase.charAt(i)>=97 && frase.charAt(i)<=122){
                totalConsonantes++;
            }
            
        }
        
        System.out.println("Total vocales: "+totalVocales);
        System.out.println("Total consonantes: "+totalConsonantes);
        
         
        
        
        
        
    }
    
}
