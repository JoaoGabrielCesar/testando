package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static <post> void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date: ");
        LocalDate birthDate = LocalDate.parse(sc.next(), fmt);
        Client client = new Client(birthDate, name, email);

        System.out.println("Enter order data");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        System.out.print("How many items to this order?");
        int items = sc.nextInt();

        Order order = new Order(Instant.now(), status, client);

        for (int i = 0; i<items;i++){
            System.out.println("Enter #"+ i + " item data: ");
            System.out.print("Product name: ");
            String product = sc.next();
            System.out.print("Product price: ");
            double price = sc.nextDouble();

            Product produto = new Product(product, price);

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, price, produto);
            order.addItem(orderItem);
        }

        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);

        sc.close();
    }
}