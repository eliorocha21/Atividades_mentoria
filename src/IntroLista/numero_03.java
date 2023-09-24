package IntroLista;

import java.util.Scanner;

//3. Crie uma classe e na função main() implemente um programa que lê um
//número inteiro do teclado e imprime todos os números primos menores que ele
//(divisíveis por 1 ou por ele mesmo).
public class numero_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numPrimo = sc.nextInt();
        for(int i = 1; i <= numPrimo; i++){
            if(isPrimo(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrimo(int x){
        int divisores = 0;

        for (int i = 1; i <= x; i++){
            if(x % i == 0)
                divisores++;
        }
        return (divisores == 2);
    }
}