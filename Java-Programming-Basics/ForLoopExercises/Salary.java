import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        String currentTab = "";
        for (int i = 1; i <= numberOfTabs; i++) {
            currentTab = scanner.nextLine();
            switch (currentTab) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }
            if (salary <= 0) {
                numberOfTabs = i;
                System.out.println("You have lost your salary.");
            } else if (numberOfTabs == i) {
                System.out.println(salary);
            }
        }
    }
}
