import java.sql.SQLOutput;
import java.util.*;

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] robotsInfo = scanner.nextLine().split(";");
        Map<String, Integer> robots = new LinkedHashMap<>();

        for (int i = 0; i < robotsInfo.length; i++) {
            String[] currentRobotInfo = robotsInfo[i].split("-");
            robots.put(currentRobotInfo[0], Integer.parseInt(currentRobotInfo[1]));
        }

        String[] secondLine = scanner.nextLine().split(":");
        int[] time = new int[secondLine.length];
        for (int i = 0; i < secondLine.length; i++) {
            time[i] = Integer.parseInt(secondLine[i]);
        }
        int hours = time[0];
        int minutes = time[1];
        int seconds = time[2];
        long totalSeconds = hours * 3600 + minutes * 60 + seconds;

        ArrayDeque<String> queue = new ArrayDeque<>();

        int[] workingTime = new int[robots.size()];

        String product = scanner.nextLine();
        while (!product.equals("End")) {
            queue.offer(product);
            product = scanner.nextLine();
        }

        while (!queue.isEmpty()) {
            String currentProduct = queue.poll();
            int currentRobotTime = 0;
            boolean found = false;
            totalSeconds++;

            for (int i = 0; i < workingTime.length; i++) {
                if (workingTime[i] < 1) {
                    int counterRobot = 0;
                    for (Map.Entry<String, Integer> r : robots.entrySet()) {
                        if (counterRobot == i) {
                            workingTime[i] = r.getValue();
                            long finalHours = totalSeconds / 3600 % 24;
                            long finalMinutes = totalSeconds % 3600 / 60;
                            long finalSeconds = totalSeconds % 60;
                            System.out.printf("%s - %s [%02d:%02d:%02d]%n",r.getKey(), currentProduct, finalHours,finalMinutes,finalSeconds);
                            found = true;
                            break;
                        }
                        counterRobot++;
                    }
                    break;
                }
            }

            if (!found) {
                queue.offer(currentProduct);
            }

            for (int i = 0; i < workingTime.length; i++) {
                workingTime[i] -= 1;
            }
        }


    }
}
