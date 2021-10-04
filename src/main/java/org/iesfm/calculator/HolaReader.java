package org.iesfm.calculator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class HolaReader {
    private String saludo;

    public HolaReader(String saludo) {
        this.saludo = saludo;
    }

    public void muestraSaludo() {
        System.out.println(saludo);
    }


    public static void main(String[] args) {

    }
}
