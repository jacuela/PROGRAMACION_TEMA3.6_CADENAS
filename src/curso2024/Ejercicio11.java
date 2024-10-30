/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso2024;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char caracter,caracterMayus;
        
        String frase="me gusta el jamon";
        String resultado="";
        
        //Tendríamos que depurar espacios iniciales
        // codigo para depurar espacios o usar el trim()
        frase=frase.trim();
        
        //Meto el primer caracter en mayusculas
        caracter=frase.charAt(0);
        caracterMayus=Character.toUpperCase(caracter);
        resultado=resultado+caracterMayus;
        
        for (int i = 1; i < frase.length(); i++) {
            
            if (frase.charAt(i-1)==' '){
                //El caracter anterior es un espacio
                //pongo en mayusculas el caracte actual
                caracter=frase.charAt(i);
                caracterMayus=Character.toUpperCase(caracter);
                resultado=resultado+caracterMayus;
            }
            else{
                caracter=frase.charAt(i);
                resultado=resultado+caracter;
            }
        }
        System.out.println(resultado);
    }
    
}
