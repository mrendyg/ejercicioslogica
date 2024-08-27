package org.mrendyg;

import java.util.HashMap;
import java.util.Map;

public class ContarPalabra {

    public static void main(String[] args) {
        String frase = "esta es mi frase utilizada para contar la palabra que mas se repite en mi frase";
        System.out.println(frase);

        // Encontrar la palabra que más veces aparece en la frase
        String palabraMasFrecuente = encontrarPalabraMasFrecuente(frase);
        System.out.println("La palabra que más se repite es '" + palabraMasFrecuente + "'");
    }

    // Método para encontrar la palabra que más veces aparece en la frase
    public static String encontrarPalabraMasFrecuente(String frase) {
        frase = frase.toLowerCase(); // Convertir a minúsculas para una búsqueda insensible a mayúsculas
        String[] palabras = frase.split(" "); // Dividir la frase en palabras usando espacios como delimitadores
        Map<String, Integer> frecuencia = new HashMap<>();

        // Contar la frecuencia de cada palabra
        for (String palabra : palabras) {
            frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
        }

        // Encontrar la palabra con la mayor frecuencia
        String palabraMasFrecuente = null;
        int maxFrecuencia = 0;
        for (Map.Entry<String, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                maxFrecuencia = entry.getValue();
                palabraMasFrecuente = entry.getKey();
            }
        }

        return palabraMasFrecuente;
    }
}
