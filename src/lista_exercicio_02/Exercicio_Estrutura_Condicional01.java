package lista_exercicio_02;

import java.util.Scanner;

public class Exercicio_Estrutura_Condicional01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a < 0) {
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("NÃO NEGATIVO");
        }


        sc.close();

    }

}
