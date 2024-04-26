package org.example.Ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite primeira entrada");
            var primeiraEntrada = sc.nextInt();
            System.out.println("Digite segunda entrada");
            var segundaEntrada = sc.nextInt();

            var resultadoDivisao = dividir(primeiraEntrada, segundaEntrada);

            System.out.println(resultadoDivisao == -1 ? "Voce tentou dividir por 0" : resultadoDivisao);
        } catch (InputMismatchException e) {
            System.out.println("Voce inseriu input sem ser numero");
        }
    }

    public static Integer dividir(Integer primeiroNumero, Integer segundoNumero){
        try {
            return primeiroNumero / segundoNumero;
        }catch (ArithmeticException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
