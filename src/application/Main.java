package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.print("Is there a initial deposit?(y/n)");
        String validation = sc.nextLine();


        Product product = new Product(number, holder);

        if(validation.charAt(0) == 'y' || validation.charAt(0) == 'Y'){
            System.out.print("Enter initial deposit value:");
            double initial = sc.nextDouble();
            product.initialDeposit(initial);
        }
        else{
            System.out.println();
        }

        System.out.println("Account data:");
        System.out.println(product);

        System.out.print("Enter a deposit value:");
        double deposit = sc.nextDouble();
        product.deposit(deposit);

        System.out.println("Updated account data:");
        System.out.println(product);

        System.out.print("Enter a withdrawl value:");
        double withdraw = sc.nextDouble();
        product.withdraw(withdraw);

        System.out.println("Updated account data:");
        System.out.println(product);



        sc.close();
    }
}