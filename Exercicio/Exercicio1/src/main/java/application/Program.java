package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountnumber = sc.nextInt();
        System.out.print("");
        System.out.print("Enter Account holder: ");
        String name = sc.nextLine();
        System.out.print("");
        System.out.print("");
        System.out.print("Is there na initial deposit (y/n)?");
        char initialDeposit = sc.next().charAt(0);

        Product product  = new Product(name, initialDeposit);

        if (initialDeposit == 'y'){
            System.out.println("Enter initial deposit value:");
            double valueDeposit = sc.nextDouble();

        }



    }

}
