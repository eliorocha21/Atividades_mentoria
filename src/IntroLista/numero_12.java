package IntroLista;

/*Os motoristas se preocupam com a quilometragem obtida por seus
automóveis. Um
motorista monitorou vários tanques cheios de gasolina registrando a
quilometragem dirigida e a quantidade de combustível em litros utilizados para
cada tanque cheio. Desenvolva um aplicativo Java que receba como entrada
os quilômetros dirigidos e os litros de gasolina consumidos (ambos com
inteiros) para cada tanque cheio. O programa deve calcular e exibir o consumo
em quilômetros/litro para cada tanque cheio e imprimir a quilometragem
combinada e a soma total de litros de combustível consumidos até esse ponto.
Todos os cálculos de média devem produzir resultados de ponto flutuante.*/

import java.util.Scanner;

public class numero_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quilometrosDirigidos = 0;
        int litrosConsumidos = 0;
        int tanquesCheios = 0;

        while (true) {
            System.out.print("Digite os quilômetros dirigidos (ou -1 para sair): ");
            int quilometros = scanner.nextInt();
            if (quilometros == -1) {
                break;
            }

            System.out.print("Digite os litros de gasolina consumidos: ");
            int litros = scanner.nextInt();

            double consumo = (double) quilometros / litros;
            System.out.println("Consumo em km/litro: " + consumo);

            quilometrosDirigidos += quilometros;
            litrosConsumidos += litros;
            tanquesCheios++;
        }

        if (tanquesCheios > 0) {
            double consumoMedio = (double) quilometrosDirigidos / litrosConsumidos;
            System.out.println("Quilometragem combinada: " + quilometrosDirigidos);
            System.out.println("Total de litros de combustível consumidos: " + litrosConsumidos);
            System.out.println("Consumo médio em km/litro: " + consumoMedio);
        } else {
            System.out.println("Nenhum dado de consumo inserido.");
        }

        scanner.close();
    }
}
