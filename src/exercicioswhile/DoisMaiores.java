/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

public class DoisMaiores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maior = 0;
        int segundo = 0;

        int cont = 1;

        while (cont <= 10) {
            System.out.print("Numero " + cont + ": ");
            int num = sc.nextInt();

            if (num > maior) {
                segundo = maior;
                maior = num;
            } else if (num > segundo) {
                segundo = num;
            }

            cont++;
        }

        System.out.println("Maior = " + maior);
        System.out.println("Segundo maior = " + segundo);
    }
}

