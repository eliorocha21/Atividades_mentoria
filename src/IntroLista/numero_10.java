import java.util.Scanner;

/*Escreva uma classe que conte a quantidade de vogais, espaços em
brancos e consoantes de uma cadeia de caracteres.*/

public class numero_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        scanner.close();

        int vogais = contarVogais(frase);
        int espacos = contarEspacos(frase);
        int consoantes = contarConsoantes(frase);

        System.out.println("Quantidade de vogais: " + vogais);
        System.out.println("Quantidade de espaços em branco: " + espacos);
        System.out.println("Quantidade de consoantes: " + consoantes);
    }

    public static int contarVogais(String frase) {
        int contador = 0;
        String vogais = "AEIOUaeiou";

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (vogais.indexOf(caracter) != -1) {
                contador++;
            }
        }

        return contador;
    }

    public static int contarEspacos(String frase) {
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (Character.isWhitespace(caracter)) {
                contador++;
            }
        }

        return contador;
    }

    public static int contarConsoantes(String frase) {
        int contador = 0;
        String vogais = "AEIOUaeiou";

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (Character.isLetter(caracter) && vogais.indexOf(caracter) == -1) {
                contador++;
            }
        }

        return contador;
    }
}
