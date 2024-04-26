package org.example.Ex03;

import java.util.Scanner;

public class ClasseTeste {

    /*
    CREDENCIAIS
    Usuario: Elias Ferreira
    Senha: 123456
    */

    public static void main(String[] args) {
        Login login = new Login("Elias Ferreira", "123456");

        Scanner sc = new Scanner(System.in);

        System.out.println("Usuario:");
        var usuario = sc.nextLine();
        System.out.println("Senha: ");
        var senha = sc.nextLine();

        try {
            login.fazerLogin(usuario, senha);
            System.out.println("Login feito com sucesso");
        } catch (LoginInvalidoException e) {
            System.out.println(e.getMessage());
        }

    }
}
