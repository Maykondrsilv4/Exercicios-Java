/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

public class ContarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int contador = 0;

        do {
            System.out.print("Digite um numero (0 para sair): ");
            numero = sc.nextInt();

            if (numero != 0) {
                contador++;
            }
        } while (numero != 0);

        System.out.println("Quantidade de numeros digitados: " + contador);
    }
}

