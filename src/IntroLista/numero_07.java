package IntroLista;

//Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e
//100, usando os tipos de dados int e double .
public class numero_07 {
    public static void main(String[] args) {
        System.out.println("Resultados usando o tipo int:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                int resultado = i / 2;
                System.out.println("Múltiplo de 3: " + i + ", Divisão por 2: " + resultado);
            }
        }

        System.out.println("\nResultados usando o tipo double:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                double resultado = (double) i / 2;
                System.out.println("Múltiplo de 3: " + i + ", Divisão por 2: " + resultado);
            }
        }
    }
}

