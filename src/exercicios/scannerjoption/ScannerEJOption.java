/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exercicios.scannerjoption;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ScannerEJOption {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.close();

        int idadeFutura = idade + 10;
        String mensagem = nome + ", voce tera " + idadeFutura + " anos em 10 anos.";

        System.out.println(mensagem);

        JOptionPane.showMessageDialog(null, mensagem);
    }
}


