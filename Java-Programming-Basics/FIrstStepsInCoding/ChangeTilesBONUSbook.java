import java.util.Scanner;

public class ChangeTilesBONUSbook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());
        double l = Double.parseDouble(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int o = Integer.parseInt(scanner.nextLine());

        int squareAreaN = n*n;
        int benchArea = m*o;
        double tilesArea = w*l;

        int areaToCover = squareAreaN - benchArea;
        double neededTiles = areaToCover / tilesArea;
        double needeTime = neededTiles * 0.2;

        System.out.println(neededTiles);
        System.out.println(needeTime);

    }
}
