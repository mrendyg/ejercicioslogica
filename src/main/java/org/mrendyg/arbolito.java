package org.mrendyg;

import java.util.*;

public class arbolito {

    public static void main(String[] args) {

        //ingreso de datos por teclado
        Scanner height = new Scanner(System.in);

        //Altura del arbol
        System.out.println("¿Cual sera la altura de tu arbol? en *");
        int heightTree = height.nextInt();

        //Variables String
        String structure = "*";
        String space = " ";
        String noSpace = "";

        //Variables int
        int i,j,k;

        //for de altura del arbol
        for(i=1; i<heightTree+(heightTree/2); i++){
            for (j=heightTree+(heightTree/2); j>i; j--){
                System.out.print(space);
            }
            for (k=1; k<=2*i-1; k++){
                System.out.print(structure);
            }
            System.out.println(noSpace);
        }

        //for de altura del tronco
        for(i=1; i<heightTree-(heightTree/2); i++){
            for (j=heightTree+(heightTree/2); j>1; j--){
                System.out.print(space);
            }
            for (k=heightTree/2; k<=(heightTree/2)+1; k++){
                System.out.print(structure);
            }
            System.out.println(noSpace);
        }

    }
}
