package IntroLista;

//Imprima produto dos números ímpares 15 a 30, usando os tipos de
//dados int e float.
public class numero_06 {
    public static void main(String[] args) {
        int produtoInt = 1;
        float produtoFloat = 1;
        for (int i = 15; i <= 30; i ++) {
            if (i%2 !=0){
                produtoInt *= i;
            }
        }
        for (int j = 15; j <= 30; j++){
            if(j%2 !=0){
                produtoFloat *= j;
            }
        }

        System.out.printf("Produto inteiro: %d", produtoInt);
        System.out.println();
        System.out.printf("Produto float: %.1f", produtoFloat);
    }
}