package org.mrendyg;

/*
 Escribe una función que reciba dos palabras (String) y retorne
 verdadero o falso (Bool) según sean o no anagramas.
 - Un Anagrama consiste en formar una palabra reordenando TODAS
   las letras de otra palabra inicial.
 - NO hace falta comprobar que ambas palabras existan.
 - Dos palabras exactamente iguales no son anagrama.
 */

import java.util.Arrays;
import java.util.Scanner;

public class anagrama {

    public static boolean VerificacionAnagrama(String str1, String str2){

        //Elimino los espacion y dejo todos los caracteres en minuscula
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        //si el largo del texto no es igual se descarta un anagrama
        if (str1.length() != str2.length()){
            return false;
        }

        //Convertir las cadenas de caracteres a arrays
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        //Ordena los arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        //comparamos su igualdad al ser reordenados
        return Arrays.equals(array1, array2);

    }

    public static void main(String[] args){

        System.out.println("Anagramas:");
        System.out.println("----------");

        //Ingreso de ambos textos
        Scanner texto = new Scanner(System.in);
        System.out.println("Ingresa una palabra:");
        String palabra1 = texto.nextLine();
        System.out.println("Ingresa una segunda palabra:");
        String palabra2 = texto.nextLine();

        /*llamada a la funcion para verificar si las dos palabras
        son anagramas*/
        if (VerificacionAnagrama(palabra1, palabra2)){
            System.out.println(palabra1 + " y " + palabra2 +" son anagramas");
        } else {
            System.out.println(palabra1 + " y " + palabra2 + " no son anagramas");
        }

    }



}
