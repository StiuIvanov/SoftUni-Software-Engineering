package Telephony;

import java.util.List;
import java.util.regex.Pattern;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        for (String number : numbers) {
            if (validatePhoneNumber(number)) {
                sb.append("Calling... ")
                        .append(number)
                        .append(System.lineSeparator());
            }else{
                sb.append("Invalid number!")
                        .append(System.lineSeparator());
            }
        }

        return sb.toString().trim();
    }

    private boolean validatePhoneNumber(String number) {
        for (char symbol : number.toCharArray()) {
            if (!Character.isDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();
        for (String url : urls) {
            if (isValidUrl(url)) {
                sb.append("Browsing: ")
                        .append(url)
                        .append("!")
                        .append(System.lineSeparator());
            } else{
                sb.append("Invalid URL!")
                        .append(System.lineSeparator());
            }
        }
        return sb.toString().trim();
    }

    private boolean isValidUrl(String url) {
        for (char symbol : url.toCharArray()) {
            if (Character.isDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

}
