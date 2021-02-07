import java.util.Scanner;

public class Tickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        int totalTickets = 0;
        int countStudentTickets = 0;
        int countStandardTickets = 0;
        int countKidsTickets = 0;
        while (!movie.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            double takenSeats = 0;
            while (true) {
                String ticketType = scanner.nextLine();
                if (ticketType.equals("End")) {
                    break;
                }
                totalTickets++;
                takenSeats++;
                if (ticketType.equals("student")) {
                    countStudentTickets++;
                } else if (ticketType.equals("standard")) {
                    countStandardTickets++;
                } else if (ticketType.equals("kid")) {
                    countKidsTickets++;
                }
                if (takenSeats >= freeSeats) {
                    break;
                }
            }
            double perfectTakenSeatsProjection = takenSeats * 1.00 / freeSeats * 100;
            System.out.printf("%s - %.2f%% full.\n", movie, perfectTakenSeatsProjection);
            movie = scanner.nextLine();
        }
        double percetnStudentTickets = countStudentTickets * 1.00 / totalTickets * 100;
        double percetnStandardTickets = countStandardTickets * 1.00 / totalTickets * 100;
        double percetnKidTickets = countKidsTickets * 1.00 / totalTickets * 100;
        System.out.printf("Total tickets: %d\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", percetnStudentTickets);
        System.out.printf("%.2f%% standard tickets.\n", percetnStandardTickets);
        System.out.printf("%.2f%% kids tickets.\n", percetnKidTickets);
    }
}


