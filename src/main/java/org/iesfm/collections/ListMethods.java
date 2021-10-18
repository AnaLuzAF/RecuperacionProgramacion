package org.iesfm.collections;

import java.util.*;

public class ListMethods {

    public static double media(List<Double> numeros) {
        double suma = 0;
        // numeros = {2, 10, 4}
        for (int i = 0; i < numeros.size(); i++) {
            // 1ª suma=0, i=0, num=2, suma=2
            // 2ª suma=2, i=1, num=10, suma=12
            // 3ª suma=12, i=2, num=4, suma=16
            double num = numeros.get(i);
            suma += num;
        }

        return suma / numeros.size();
    }

    public static void main(String[] args) {
        List<Double> numeros = new ArrayList<>();
        numeros.add(4d);
        numeros.add(5d);
        numeros.add(1d);
        // List(4, 5, 1)

        Map<Alumno, Integer> notasPorUsuario = new HashMap<>();
        notasPorUsuario.put(new Alumno("Ana Luz", "Avilés"), 7);
        notasPorUsuario.put(new Alumno("Michal", "Homenda"), 6);
        notasPorUsuario.put(new Alumno("Otro", "Alumno"), 4);

        notasPorUsuario.keySet(); // Set(Alumno(AnaLuz), Alumno(Michal))
        notasPorUsuario.values(); // List(7, 6)
        double totalNotas = 0;
        for (Integer nota : notasPorUsuario.values()) {
            totalNotas += nota;
        }

        double media = totalNotas / notasPorUsuario.size();

        System.out.println(media);
    }
}
