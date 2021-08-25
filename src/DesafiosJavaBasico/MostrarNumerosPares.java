package DesafiosJavaBasico;

import java.io.IOException;
import java.util.Scanner;

public class MostrarNumerosPares {
	
	  public static void main(String[] args) throws IOException {
          Scanner entrada = new Scanner(System.in);
          System.out.println();
          int num = entrada.nextInt();

          for (int i = 1 ; i <= num ; i++) {
              if (i % 2 == 0)
                  System.out.println(i);

          }
      }

}
