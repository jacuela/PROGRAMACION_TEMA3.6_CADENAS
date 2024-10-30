/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso2024;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase="Alicia tiene 35 años";
        
        
        int posicionEspacio1=-1;
        int posicionEspacio2=-1;
        int posicionEspacio3=-1;
        
        int totalEspacios=0;
        
        String palabra1="", palabra3="";
        
        System.out.println("FRASE");
        System.out.println(frase);
        System.out.println("------------------");
        
        
        //Busco la posicion del primer espacio
        //Modo fácil: uso indexOf(' ')
//        posicionEspacio1=frase.indexOf(' ');
//        palabra1=frase.substring(0, posicionEspacio1);
        
        //Modo menos facil para buscar el primer espacio
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)==' '){
                posicionEspacio1=i;
                //System.out.println("esp1:"+posicionEspacio1);
                break;
            }
        }
        
        //Busco ahora la posicion de los otros dos espacios
        totalEspacios=0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)==' ') { 
                
                totalEspacios++;
                if (totalEspacios==2)
                    posicionEspacio2=i;
                
                if (totalEspacios==3)
                    posicionEspacio3=i;
            }
        }
        
        //Otra forma más complicada
//        totalEspacios=0;
//        for (int i = 0; i < frase.length(); i++) {
//            if (totalEspacios==1 && frase.charAt(i)==' '){
//                //acabo de encontrar el segundo espacio
//                posicionEspacio2=i;
//                totalEspacios++;
//            }
//            else if (totalEspacios==2 && frase.charAt(i)==' '){
//                //acabo de encontrar el segundo espacio
//                posicionEspacio3=i;
//                totalEspacios++;
//            }else if (frase.charAt(i)==' '){
//                totalEspacios++;
//            }
//        }
        
        
        
        //Una vez que tengo las posiciones, saco las palabras 
        // y Muestro resultados
        palabra1=frase.substring(0, posicionEspacio1);
        palabra3=frase.substring(posicionEspacio2+1, posicionEspacio3);

        System.out.println("Palabra1:"+palabra1);
        System.out.println("Palabra3:"+palabra3);

        
        
    }
    
}



