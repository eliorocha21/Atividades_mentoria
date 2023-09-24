package IntroLista;

import java.sql.SQLOutput;
import java.util.Scanner;

//2. Faça um programa que receba 2 valores e retorne o maior entre eles.

public class numero_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o primeiro numero primo: ");
        double num1 = sc.nextDouble();
        System.out.println("Escreva o segundo numero primo: ");
        double num2 = sc.nextDouble();
        double maiorValor;
        if (num1 > num2) {
            maiorValor = num1;
        }    else{
            maiorValor = num2;
            }
        System.out.println("O maior número primo é: " + maiorValor);
        }
    }
