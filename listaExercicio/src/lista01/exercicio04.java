package lista01;

import java.util.Scanner;

//Determine e exiba a média aritmética de um aluno a partir de suas 4 notas.
public class exercicio04 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a nota 1: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite a nota 2: ");
            double nota2 = scanner.nextDouble();

            System.out.print("Digite a nota 3: ");
            double nota3 = scanner.nextDouble();

            System.out.print("Digite a nota 4: ");
            double nota4 = scanner.nextDouble();

            double media = calcularMedia(nota1, nota2, nota3, nota4);
            System.out.println("A média do aluno é: " + media);

            scanner.close();
        }

        public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
            return (nota1 + nota2 + nota3 + nota4) / 4.0;
        }
    }
