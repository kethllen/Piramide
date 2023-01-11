package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira o numero que deseja construir a piramide");
        Scanner num = new Scanner(System.in);

        Piramide piramide = new Piramide(num.nextInt());
        num.close();
        piramide.imprimiPiramide();
    }
}