package lista01;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva seu ano de nascimento: ");
        int anoNasc = sc.nextInt();
        System.out.print("Escreva o ano atual: ");
        int anoAtual = sc.nextInt();
        int idade = anoAtual - anoNasc;
        System.out.println("Você tem, ou fará " + idade + " anos em " + anoAtual);
    }
}

