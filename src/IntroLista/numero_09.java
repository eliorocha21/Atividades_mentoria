package IntroLista;


/*Escreva uma classe para calcular a área de um círculo, sabendo que a área
é A = PI * r2, onde o raio (r) deve ser informado pelo usuário e o resultado terá
que ser arredondado.*/

import java.util.Scanner;

public class numero_09 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Raio: ");
            double raio = scanner.nextDouble();

            double area = Math.round(Math.PI * Math.pow(raio, 2));
            System.out.println("Área: " + area);
        }
    }

