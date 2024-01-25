package application;

import entities.Aluno;
import entities.Employee;
import entities.Product;
import util.currencyCoverter;

import java.util.Locale;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        Usuario usu1 = new Usuario();
//        System.out.println("Digite o ID do usuário: ");
//        usu1.ID = sc.nextInt();
//        System.out.println("Digite o nome do usuário: ");
//        usu1.nome = sc.next();
//        System.out.println("Digite o plano do usuário: ");
//        usu1.plano = sc.next();
//        System.out.println("Digite o valor do Plano");
//        usu1.valorPlano = sc.nextDouble();
//        System.out.println("Digite a quantidade de usuários: ");
//        usu1.quantidadeUsuarios = sc.nextInt();
//
//        System.out.println();
//        System.out.println("ID: " + usu1.ID);
//        System.out.println("USUARIO: " + usu1.nome);
//        System.out.println("MENSALIDADE: " + usu1.mensalidade());

        /////////////////// CLASS PRODUCT //////////////////////

//        Product product1 = new Product();
//        System.out.println("Digite o nome do produto: ");
//        product1.productName = sc.next();
//        System.out.println("Digite o preço do produto: ");
//        product1.productPrice = sc.nextDouble();
//        System.out.println("Digite a quantidade em estoque: ");
//        product1.productQuantity = sc.nextInt();
//
//        System.out.println();
//        System.out.println("PRODUTO: " + product1.productName);
//        System.out.println("PREÇO: " + product1.productPrice);
//        System.out.println("QUANTIDADE EM ESTOQUE: " + product1.productQuantity);
//        System.out.println("VALOR DO PRODUTO EM ESOTQUE: " + product1.stockValue());
//
//        System.out.println();
//        System.out.println("Digite a quantidade de entrada no estoque");
//        product1.stockEntry = sc.nextInt();
//
//        System.out.println();
//        System.out.println("ESTOQUE ATUALIZADO");
//        System.out.println("PRODUTO: " + product1.productName);
//        System.out.println("PREÇO: " + product1.productPrice);
//        System.out.println("QUANTIDADE EM ESTOQUE: " + product1.stockIn());
//        System.out.println("VALOR DO PRODUTO EM ESOTQUE: " + product1.stockValue());
//
//
//        System.out.println();
//        System.out.println("Digite a quantidade de saida no estoque");
//        product1.stockOutput = sc.nextInt();
//
//        System.out.println();
//        System.out.println("ESTOQUE ATUALIZADO");
//        System.out.println("PRODUTO: " + product1.productName);
//        System.out.println("PREÇO: " + product1.productPrice);
//        System.out.println("QUANTIDADE EM ESTOQUE: " + product1.stockOut());
//        System.out.println("VALOR DO PRODUTO EM ESOTQUE: " + product1.stockValue());


           /////////////// OUTRO EXEMPLO ///////////////////////////////////



//        System.out.println("Digite o nome do produto: ");
//        String productName = sc.next();
//        System.out.println("Digite o preço do produto: ");
//        Double productPrice = sc.nextDouble();
//        System.out.println("Digite a quantidade em estoque: ");
//        int productQuantity = sc.nextInt();
//        Product product1 = new Product(productName, productPrice, productQuantity);
//
//        System.out.println();
//        System.out.println("PRODUCT DATA");
//        System.out.println(product1);
//
//        int quantity;
//        System.out.println();
//        System.out.println("Digite a quantidade de entrada no estoque: ");
//        quantity = sc.nextInt();
//        product1.stockIn(quantity);
//
//        System.out.println();
//        System.out.println("PRODUCT DATA");
//        System.out.println(product1);
//
//        System.out.println();
//        System.out.println("Digite a quantidade de saída no estoque: ");
//        quantity = sc.nextInt();
//        product1.stockOut(quantity);
//
//        System.out.println();
//        System.out.println("PRODUCT DATA");
//        System.out.println(product1);


        ///////////////////////// EXERCÍCIOS /////////////////////////////

                    /////////////// 2 /////////////////////

        // Fazer um programa para ler os dados de um funcionário (nome, salário e imposto)'
        // Em seguida mostrar os dados do funcionário (nome e salário líquido).
        // Em seguida aumentas o salário do funcionário com base em uma porcentagem dada
        // (somente salário bruto é afetada pela porcentagem) e mostrar novamente os dados
        // do funcionário.

//        Employee employee1 = new Employee();
//
//        System.out.println("Digite o nome do funcionário: ");
//        employee1.emplyeeName = sc.next();
//        System.out.println("Digite o salário bruto do funcionário: ");
//        employee1.grossSalary = sc.nextDouble();
//        System.out.println("Digite a taxa de desconto do funcionário: ");
//        employee1.tax = sc.nextDouble();
//
//        System.out.println();
//        System.out.println(employee1);
//
//        System.out.println();
//        System.out.println("Emplyee: " + employee1.emplyeeName + ", R$ " + String.format("%.2f", employee1.netSalary()));
//
//        double addTax;
//        System.out.println();
//        System.out.println("qual porcentagem para aumentar o salário");
//        addTax = sc.nextDouble();
//        employee1.addPercentage(addTax);
//
//        System.out.println();
//        System.out.println("Emplyee: " + employee1.emplyeeName + ", R$ " + String.format("%.2f", employee1.netSalary()));


        /////////////// 2 /////////////////////

        // Fazer um prohrama que leia o nome de um aluno e as trê notas que ele obteve
        // nos três trimestre do ano (primeiro trimestre vale 30 e o segundo e terceiro
        // 35 cada). ao Final mostrar qual a nota do alunono ano. Dizer também se o aluno
        // está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos
        // faltam para o aluno obter o mínimo para ser aprovado(Que é 60% da nota).
        // Criar classe student para resolver o problema.

//        Aluno aluno1 = new Aluno();
//
//        System.out.println("Digite o nome do aluno: ");
//        aluno1.nome = sc.next();
//        System.out.println("Digite a primeira nota do Aluno:");
//        aluno1.nota1 = sc.nextDouble();
//        System.out.println("Digite a segunda nota do Aluno:");
//        aluno1.nota2 = sc.nextDouble();;
//        System.out.println("Digite a segunda nota do Aluno:");
//        aluno1.nota3 = sc.nextDouble();
//
//        System.out.println();
//        System.out.println(aluno1);
//        System.out.println();
//        System.out.println(aluno1.aprovacao());
//        System.out.println(aluno1.precisaNota());

        ////////////// EXERCICIO FUNÇÕES ESTÁTICAS ////////////////////////

        //////////////////// 1 ///////////////////////////////

        // Faça um programa para ler a cotação do dolar, e depois um valor em dolares
        // a ser compradopor uma pessoa em reais. Informar quanto a pessoa vai pagar
        // pelos dolares, considerando ainda que a pessoa terá que pagar 6% do IOF
        // sobre o valor em dolar. Criar uma clsse  para ser responsável pelo dolar;

//        double valorDollar;
//        double comprarDollar;
//
//        System.out.println("qual é o preço do dólar ?");
//        valorDollar = sc.nextDouble();
//        System.out.println("Quando dolares você quer comprar ?");
//        comprarDollar = sc.nextDouble();
//
//        double valorEmReais = currencyCoverter.converter(valorDollar, comprarDollar);
//
//        System.out.println();
//        System.out.println("VALOR A SERR PAGO EM REAIS: " + valorEmReais);

        sc.close();
    }


}