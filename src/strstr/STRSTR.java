/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strstr;

/**
 *
 * @author Mulay
 */
public class STRSTR {

        public int strStr (String str1, String str2){
        int posicion = -1;
        //supoinemos que no hay acentos y  que todo es minúscula
        for (int i = 0; i < str1.length(); i++){
            
            if(str1.charAt(i)==str2.charAt(0)){
                posicion = i;
                int j=0; //indice para buscar en el str2
                while ((j<str2.length() && i < str1.length()) && str1.charAt(i) == str2.charAt(j)){
                    j++;
                    i++;
                }
                //el while ha terminado y puede haber salido por varias razones
                //la primera, que alguno de los dos length se haya termminado
                //la segunda, que alguna letra sea distinta
                
                if (str1.charAt(i) == str2.charAt(j)){
                    
                }
            }
        }
        
        return posicion;
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        STRSTR ejercicio = new STRSTR();
        System.out.println(ejercicio.strStr("hola Helios!", "el"));
    }
    
}
