/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacuela
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase1="  me llamo Pepe  ";
        
        int indicePrimerCaracter=-1;
        String frase1Nueva;
        
        System.out.println("FRASE CON ESPACIOS\n-->"+frase1+"<--\n\n");
        
        
        
        //***************** PARTE1 ******************************
        //Usando un for para hallar el indice del primer caracter
        for (int i = 0; i < 10; i++) {
            if (frase1.charAt(i)!=' ') {
                indicePrimerCaracter=i;
                break;
            }
            
        }
        frase1Nueva=frase1.substring(indicePrimerCaracter);
         System.out.println("Metodo1       -->"+frase1Nueva+"<--");
       
        //Usando un while para hallar el indice del primer caracter
        int j=0;
        while (frase1.charAt(j)==' '){
            j++;
        }
        //System.out.println(j);
        frase1Nueva=frase1.substring(j);
        System.out.println("Metodo2       -->"+frase1Nueva+"<--");
        
        
        
        
        //***************** PARTE2 ******************************
        //Usando un for para hallar el indice del ultimo caracter
        System.out.println("\n\n");
        int indiceUltimoCaracter=-1;
       
        for (int i = frase1.length()-1; i > 0; i--) {
            //System.out.println(i);
            if (frase1.charAt(i)!=' ') {
                indiceUltimoCaracter=i;
                break;
            }
        }
       // System.out.println(indicePrimerCaracter);
       // System.out.println(indiceUltimoCaracter);
        
        frase1Nueva=frase1.substring(indicePrimerCaracter,indiceUltimoCaracter+1);
        System.out.println("Metodo1        -->"+frase1Nueva+"<--");
      
        
        //Usando un while para hallar el indice del ultimo caracter
        int k=frase1.length()-1;
        while (frase1.charAt(k)==' '){
           k--;
        }
        //System.out.println(j);
        frase1Nueva=frase1.substring(j,k+1);
        System.out.println("Metodo2        -->"+frase1Nueva+"<--");
      
        
        System.out.println("\n ********* USANDO LA FUNCION .trim() ************** ");
        System.out.println(frase1.trim());
        
        
        
        
        
    }
    
}
