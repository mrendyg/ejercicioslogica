package org.mrendyg;

/*
 * Escribe una función que calcule si un número dado es un número de Armstrong
// * (o también llamado narcisista).
// * Si no conoces qué es un número de Armstrong, debes buscar información
// * al respecto.
 */

import java.util.Scanner;

public class numeroAmstrong {

    public static void main(String[] args){

        Scanner ingreso_numero = new Scanner(System.in);

        System.out.println("Ingresa un numero:");
        int numero = ingreso_numero.nextInt();
        String numeroString = Integer.toString(numero);

        int d = 0;
        for (int i=1; i<=numeroString.length(); i++){
            d = i;
        }
        System.out.println("Cantidad de digitos");
        System.out.println(d);
        System.out.println("-------------------");
        System.out.println("Digitos:");

        int acum = 0;

        for (char c : numeroString.toCharArray()){
            int digito = Character.getNumericValue(c);
            System.out.println(digito);
            int resultado = (int) Math.pow(digito, d);
            acum = acum + resultado;

        }
        System.out.println(acum);
        System.out.println("----");

        if(numero == acum){
            System.out.println(numero + " es un numero de amstrong");
        }
        else {
            System.out.println(numero + " no es un numero de amstrong");
        }



    }
}
