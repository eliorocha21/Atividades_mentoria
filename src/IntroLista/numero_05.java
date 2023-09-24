package IntroLista;


//5. Faça um programa que solicite ao usuário um número de 1 a 7, e imprima na
//tela o dia da semana correspondente. Suponha que Segunda corresponde a 1 ,
//Terça corresponde a 2, e assim por diante. Utilizando Array.

import java.util.Scanner;

public class numero_05 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String[] diaSemana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabádo", "Domingo"};
        System.out.println("Digite um número de 1 a 7: ");
        int numero = sc.nextInt();
        System.out.println(diaSemana[numero-1]);
    }
}
