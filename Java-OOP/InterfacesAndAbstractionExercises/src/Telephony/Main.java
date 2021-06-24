package Telephony;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phoneNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        List<String> sites = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Smartphone smartphone = new Smartphone(phoneNumbers,sites);

        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());
    }
}
