package org.iesfm.collections;

import java.util.List;

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
}
