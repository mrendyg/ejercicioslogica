package org.mrendyg;
/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */
public class Suceciones {

    public static void main(String[] args) {

        //inicio las variables
        int a=0, b=1;

        //imprimo la variable a solo para mostrar el 0 en pantalla
        System.out.println(a);

        //comienzo la suma y el intercambio de variables
        for (int i=0; i<=4; i++) {
            int suma = a + b;
            a = suma;
            System.out.println(a);
            if(i!=4){
                suma = a + b;
                b = suma;
                System.out.println(suma);
            }
        }

    }
}
