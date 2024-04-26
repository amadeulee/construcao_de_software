package org.example.Ex02;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class CriacaoDeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] inteiros = new Integer[10];
        int contador = 0;

        while(true) {
            try {
                System.out.println("Digite o numero para salvar no array");
                var entrada = sc.nextInt();

                inteiros[contador] = entrada;
                if(entrada == 0) break;
                contador++;
            } catch (InputMismatchException e) {
                System.out.println("Entrada nao numerico");
                sc.nextLine();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Limite ultrapassado para passar valor");
                break;
            }

        }

        System.out.println("Numeros inseridos:");
        Arrays.stream(inteiros)
                .filter(Objects::nonNull)
                .forEach(e -> System.out.printf("%d ", e));
    }
}
