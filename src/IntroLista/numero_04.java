package IntroLista;

import java.util.Scanner;

//Pretende-se escrever um programa que leia do teclado uma distância
//expressa em milhas, converte-a para quilômetros e apresenta o resultado no
//console. (fórmula de conversão: 1 milha = 1.609 km).
public class numero_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a distancia em milhas: ");
        double milhas = sc.nextDouble();
        double quilometro = milhas * 1.609;
        System.out.printf("%.2f milhas = %.4f ", milhas, quilometro);
    }

}
