package org.mrendyg;

import java.util.Scanner;



public class palindromo {

    public static void main(String[] args) {

        System.out.println("Palindromos");
        System.out.println("-----------");

        //ingreso del texto por teclado
        Scanner texto = new Scanner(System.in);
        System.out.println("Ingresa una palabra:");
        String palabra = texto.nextLine();

        //conversion de texto a minusculas
        String lowerText = palabra.toLowerCase();

        //String vacio para acumular el texto invertido
        String inversion_texto = "";

        /*recorrido del texto del atras hasta la primera letra para insertar en
          el string vacio*/
        for(int i=lowerText.length()-1; i>=0; --i){
            inversion_texto = inversion_texto + lowerText.charAt(i);
        }
        //comparacion de ambos textos para verificar el palindromo
        if (lowerText.equals(inversion_texto)){
            System.out.println(palabra + " es palindromo");
        }
        else {
            System.out.println(palabra + " no es palindromo");
        }

    }

}
