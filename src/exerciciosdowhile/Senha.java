/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senhaCorreta = 1234;
        int senha = 0;

        while (senha != senhaCorreta) {
            System.out.print("Digite a senha: ");
            senha = sc.nextInt();
        }

        System.out.println("Senha correta");
    }
}


