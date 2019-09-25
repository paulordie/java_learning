package application;

import entities.Product;
import entities.Triangle;
import util.Calculator;

import java.util.Locale;
import java.util.Scanner;


public class Program {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Product product = new Product(); // retirando o construtor basico
        System.out.println("Entrada do nome do produto: ");
        System.out.print("Nome do produto: ");
        String name = sc.nextLine();
        System.out.print("Preço do produto ou produtos: ");
        double price = sc.nextDouble();
        System.out.print("Quantidade de produtos disponíveis: ");


        Product product = new Product(name, price);

        System.out.println("Sem o toString" + product);
        System.out.println("com toStringdaMinhaClass" + product.toString());
        System.out.println(product.name + ", " + product.price + ", " + product.quantity);

        System.out.println("Adicionando produtos ao stock: ");
        int quantity = sc.nextInt();
        System.out.println("Valor adicionado: " + product.valueAddSub(quantity, product.price));
        product.addProduct(quantity);
        System.out.println("Quantidade adicionado de produtos: " + quantity);
        System.out.println("Total Adicionado: " + product.name + ", " + product.price + ", " + product.quantity);
        System.out.println(product);

        System.out.println("Retirando Produtos: ");
        int retirando = sc.nextInt();
        System.out.println("Valor retirado: " + product.valueAddSub(retirando, product.price));
        product.removeProduct(retirando);
        System.out.println("Quantidade retirada: " + retirando);
        System.out.println("Retirando o produto: " + product.name + ", " + product.price + ", " + product.quantity);
        System.out.println(product);

        sc.close();
    }
}
