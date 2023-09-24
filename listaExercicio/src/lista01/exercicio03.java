package lista01;

//Solicite a quantidade de homens e de mulheres de uma turma da faculdade. Em seguida
//calcule e exiba o percentual (separadamente) de homens e mulheres desta turma.

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de homens: ");
        int homem = sc.nextInt();
        System.out.print("Quantidade de mulheres: ");
        int mulher = sc.nextInt();
        int total = homem + mulher;
        double porcentagemHomem = ((double)homem / total) * 100;
        double porcentagemMulher = ((double)mulher / total) * 100;

        System.out.printf("Porcentagem de homens: %.2f ", porcentagemHomem);
        System.out.printf("Porcentagem de mulheres: %.2f ", porcentagemMulher);
    }
}
