package BankAccount;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccount> vault = new HashMap<>();

        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] tokens = line.split("\\s+");

            String output;
            switch (tokens[0]) {
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    vault.put(bankAccount.getId(), bankAccount);
                    output = "Account ID" + bankAccount.getId() + " created";
                    System.out.println(output);
                    break;
                case "Deposit":
                    int id = Integer.parseInt(tokens[1]);
                    double amount = Double.parseDouble(tokens[2]);
                    if (vault.containsKey(id)) {
                        vault.get(id).deposit(amount);
                        DecimalFormat df = new DecimalFormat("#.####");
                        System.out.println("Deposited " + df.format(amount) + " to ID" + id);
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "SetInterest":
                    double interest = Double.parseDouble(tokens[1]);
                    BankAccount.setInterestRate(interest);
                    break;
                case "GetInterest":
                    id = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);
                    if (vault.containsKey(id)) {
                        System.out.printf("%.2f%n", vault.get(id).getInterest(years));
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
            }

            line = scanner.nextLine();
        }

    }
}
