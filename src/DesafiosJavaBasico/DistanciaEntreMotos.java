package DesafiosJavaBasico;

import java.util.Scanner;
public class DistanciaEntreMotos {

    public static void main(String[] args) {
            int minutos;
            Scanner input = new Scanner(System.in);
            minutos = input.nextInt();
            int motoY = 90;
            int motoX = 60;
            int hora = 60;
            int tempoDistancia = hora / (motoY - motoX);
            System.out.printf("%d minutos\n",tempoDistancia * minutos ); // Digite aqui o calculo dos minutos
        input.close();
    }
}
