package IntroLista;

/*Escreva um programa que tenha duas palavras como entrada, e a saída
imprima as palavras em ordem alfabética (utilize o método compareTo da
classe String),. Informe também, qual das palavras tem o maior número de
caracteres.*/

import java.util.Scanner;

public class numero_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        scanner.close();

        int comparacao = palavra1.compareTo(palavra2);

        if (comparacao < 0) {
            System.out.println("Em ordem alfabética: " + palavra1 + ", " + palavra2);
        } else if (comparacao > 0) {
            System.out.println("Em ordem alfabética: " + palavra2 + ", " + palavra1);
        } else {
            System.out.println("As palavras são iguais.");
        }

        if (palavra1.length() > palavra2.length()) {
            System.out.println(palavra1 + " tem mais caracteres.");
        } else if (palavra1.length() < palavra2.length()) {
            System.out.println(palavra2 + " tem mais caracteres.");
        } else {
            System.out.println("As palavras têm o mesmo número de caracteres.");
        }
    }
}
