package atividade;


import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        float m,c;

        System.out.println("Dígite um número:");
        m = input.nextFloat();

        c = m * 100;

        System.out.printf("convertido para cm " + c + "\n");
    }
}