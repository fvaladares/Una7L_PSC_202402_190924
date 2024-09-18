//Crie um programa que imprima a sequência
// dos 100 próximos números inteiros, seguintes a um
//valor fornecido pela pessoa utilizadora.


import java.util.Scanner;

public class Questao01 {

    public void resolverQuestao1() {
        int valorInicial;
        Scanner entrada = new Scanner(System.in);
        int temp = 0;
        System.out.print("\nInforme o valor inicial: ");
        valorInicial = entrada.nextInt();
        temp = valorInicial;


        for (int contador = 0; contador < 100; contador++) {
            temp = temp + 1;
            System.out.println(contador + 1 + "°=>" + temp);
        }

        System.out.println("\n\nO valor inicial foi: " + valorInicial);


    }
}
