package lista01;

import java.util.Scanner;

//Calcule e exiba a quantidade de salários mínimos que um determinado funcionário ganha.
//Para isto, peça o valor do seu salário e o valor do salário mínimo atual.
public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu salário: R$ ");
        double salario = sc.nextDouble();
        System.out.print("Qual o valor do salário mínimo atual? R$ ");
        double salarioMinimo = sc.nextDouble();
        double qtdSalarios = salario/salarioMinimo;
        System.out.printf("você recebe %.2f salarios minimos ", qtdSalarios);
    }
}
