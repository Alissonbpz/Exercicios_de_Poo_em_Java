package Aula_19_20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        Integer num = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Initial Balance: ");
        Double balance = sc.nextDouble();
        System.out.print("Withdraw Limit: ");
        Double withdrawLimit = sc.nextDouble();

        Account account = new Account(num,holder,balance,withdrawLimit);

        System.out.print("Enter amount to withdraw: ");
        Double amount = sc.nextDouble();

        try {
            account.withdraw(amount);
            System.out.printf("New balance: %.2f%n", account.getBalance());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}
