package DesafiosJavaBasico;

import java.util.Scanner;

public class MesesEmIngles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month;
        month = input.nextInt();
        switch(month)
        {
            case 1:
                System.out.printf("January\n");
                break;
            case 2:
                System.out.printf("February\n");
                break;
            case 3:
                System.out.println("March\n");
                break;
            case 4:
                System.out.println("April\n");
                break;
            case  5:
                System.out.println("May\n");
                break;
            case 6:
                System.out.println("June\n");
                break;
            case 7:
                System.out.println("July\n");
                break;
            case 8:
                System.out.println("August\n");
                break;
            case 9:
                System.out.println("September\n");
                break;
            case 10:
                System.out.println("October\n");
                break;
            case 11:
                System.out.println("November\n");
                break;
            case 12:
                System.out.println("December\n");
                break;
            default:
                System.out.printf("Invalid input\n");

                input.close();
        }
    }
}

