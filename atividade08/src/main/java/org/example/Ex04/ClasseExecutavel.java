package org.example.Ex04;

import static java.lang.System.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClasseExecutavel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        ContaBancaria conta = new ContaBancaria();

        while (true) {
            try {
                out.println("Qual operacao deseja realizar: \n1 - Depositar \n2 - Sacar \n3 - Ver valor atual\nQualquer outra opcao para finalizar o programa");
                var opcao = sc.nextLine();

                if (opcao.equals("1")) {
                    out.println("Digite o valor");
                    var valor = sc.nextDouble();
                    sc.nextLine();

                    conta.depositar(valor);
                } else if (opcao.equals("2")) {
                    out.println("Digite o valor");
                    var valor = sc.nextDouble();
                    sc.nextLine();


                    conta.sacar(valor);

                } else if (opcao.equals("3")) {
                    out.printf("R$ %.2f\n", conta.getSaldo());
                } else {
                    out.println("finalizando programa");
                    break;
                }
            } catch (SaldoInsuficienteException e) {
                out.println(e.getMessage());
            } catch (InputMismatchException e) {
                out.println("Voce digitou valor nao numerico");
                sc.nextLine();
            }
        }
    }
}
