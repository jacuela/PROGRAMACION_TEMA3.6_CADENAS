/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class Ejercicio10bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cadenaLarga="La resaca de Juan es pesada";
        String cadena="esa";
        
        
        
        boolean continuar=true;
        int totalPalabras=0;
        int indiceComienzoPalabra;
        
        System.out.println("Cadena larga-->"+cadenaLarga);
        
        //ojo, con las mayusculas de la primera cadena
        cadenaLarga=cadenaLarga.toLowerCase();

        while (continuar){
            
            indiceComienzoPalabra = cadenaLarga.indexOf(cadena);
            
            if (indiceComienzoPalabra!=-1){
                totalPalabras++;
                cadenaLarga=cadenaLarga.substring(indiceComienzoPalabra+cadena.length());
                
                //Esto lo pongo para depurar y ver la cadenaLarga que me queda
                //System.out.println("resto de cadenaLarga:"+cadenaLarga);
            } 
            else {
                continuar=false;
            }        
                  
        }
       
        System.out.printf("\nLa cadena [%s] esta %d veces.\n",cadena,totalPalabras);
        
        
        
        
        
    }
    
}
