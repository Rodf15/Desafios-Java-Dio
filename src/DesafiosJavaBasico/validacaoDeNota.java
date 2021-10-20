package DesafiosJavaBasico;

import java.util.Locale;
import java.util.Scanner;


public class validacaoDeNota{


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);// Na minha ide foi necessario "setar" o local de linguagem de leitura do Scanner, porém no site da Dio não precisa.
        double n1, n2, media;


        do {

            n1 = scan.nextDouble ();
            if ( n1 <0 || n1>10)
                System.out.println ("nota invalida");
        } while ( n1 <0 || n1>10);




        do {

            n2 = scan.nextDouble ();
            if ( n2 <0 || n2>10)
                System.out.println ("nota invalida");
        } while ( n2 <0 || n2>10);


        media =(n1+n2)/2;
        System.out.println (String.format ("media = "+ "%.2f", media));

    }
}
