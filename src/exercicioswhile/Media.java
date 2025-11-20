/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int alunos = sc.nextInt();

        int contador = 1;
        double soma = 0;

        while (contador <= alunos) {
            System.out.print("Nota " + contador + ": ");
            double nota = sc.nextDouble();
            soma = soma + nota;
            contador++;
        }

        System.out.println("Media = " + (soma / alunos));
    }
}

