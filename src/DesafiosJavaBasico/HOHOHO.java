package DesafiosJavaBasico;


import java.util.Scanner;

public class HOHOHO {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();

        for (int i = 1; i <= num; i ++) {

            System.out.print(" Ho");
        if ( i == num)
            System.out.println("!");
        }
        entrada.close();

    }
}