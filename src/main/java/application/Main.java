package application;

import entities.Usuario;

import java.util.Locale;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Usuario usu1 = new Usuario();
        System.out.println("Digite o ID do usuário: ");
        usu1.ID = sc.nextInt();
        System.out.println("Digite o nome do usuário: ");
        usu1.nome = sc.next();
        System.out.println("Digite o plano do usuário: ");
        usu1.plano = sc.next();
        System.out.println("Digite o valor do Plano");
        usu1.valorPlano = sc.nextDouble();
        System.out.println("Digite a quantidade de usuários: ");
        usu1.quantidadeUsuarios = sc.nextInt();

        System.out.println();
        System.out.println("ID: " + usu1.ID);
        System.out.println("USUARIO: " + usu1.nome);
        System.out.println("MENSALIDADE: " + usu1.mensalidade());


        sc.close();
    }
}