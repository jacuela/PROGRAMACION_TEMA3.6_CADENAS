/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso2024;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class AlgunasFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Algunas funciones de cadenas
        //charAt(index) --> devuevle el char indicado en la posicion dada 
                            //o Excepcion si index no existe 
        //indexOf(char)  --> devuevle posicion del primer char encontrado o -1
        //indexOf(String)--> devuevle posicion del primer String encontrado o -1
        //substring(i,j)  --> subcadena desde la posicion i a la j-1
        //replace(char_viejo,char_nuevo) --> cambia el char_viejo por el char_nuevo 
        String cadena="Hoy es viernes";
        
        //charAt
        char c = cadena.charAt(0);
        System.out.println(c);  //System.out.println(cadena.charAt(0));
        //System.out.println(cadena.charAt(20));
        
        //indexOf
        System.out.println(cadena.indexOf('v'));
        System.out.println(cadena.indexOf('V'));
        System.out.println(cadena.indexOf("es"));
        
        //substring
        System.out.println(cadena.substring(0,3));
        System.out.println(cadena.substring(7));
        
        //replace
        System.out.println(cadena.replace(' ', '_'));
        
        //Combinando
        String cadena2="Pedro viene guapo";
        int posicionG=cadena2.indexOf('g');
        System.out.println(cadena2.substring(posicionG));
        
        
    }
    
}
