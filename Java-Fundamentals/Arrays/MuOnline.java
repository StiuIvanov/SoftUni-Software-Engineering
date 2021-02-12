import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health = 100;
        int bitcoins = 0;
        boolean alive = true;
        String[] rooms = scanner.nextLine().split("\\|");
        for (int i = 0; i < rooms.length; i++) {
            if (alive) {
                String[] currentRoom = rooms[i].split(" ");
                String command = currentRoom[0];
                int number = Integer.parseInt(currentRoom[1]);
                switch (command) {
                    case "potion":
                        int amountHealed = 0;
                        if (number + health >= 100) {
                            amountHealed = 100 - health;
                            health = 100;
                        } else {
                            health += number;
                            amountHealed = number;
                        }
                        System.out.printf("You healed for %d hp.%n", amountHealed);
                        System.out.printf("Current health: %d hp.%n", health);
                        break;
                    case "chest":
                        System.out.printf("You found %d bitcoins.%n", number);
                        bitcoins += number;
                        break;
                    default:
                        int attack = number;
                        String monster = command;
                        if (attack >= health) {
                            int bestRoom = i + 1;
                            System.out.printf("You died! Killed by %s.%n", monster);
                            System.out.printf("Best room: %d", bestRoom);
                            alive = false;
                            break;
                        } else {
                            health -= attack;
                            System.out.printf("You slayed %s.%n", monster);
                        }
                        break;
                }
            } else {
                break;
            }
        }
        if (alive) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d%n", health);
        }
    }
}
