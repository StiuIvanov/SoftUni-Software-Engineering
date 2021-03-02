import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EasterGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] giftsText = scanner.nextLine().split(" ");
        List<String> gifts = new ArrayList<>();
        for (int i = 0; i < giftsText.length; i++) {
            gifts.add(giftsText[i]);
        }

        String noMoneyCommand = scanner.nextLine();
        while (!noMoneyCommand.equals("No Money")) {
            String[] tokens = noMoneyCommand.split(" ");
            String giftToken = tokens[1];
            switch (tokens[0]) {
                case "OutOfStock":
                    while (gifts.contains(giftToken)){
                        gifts.set(gifts.indexOf(giftToken), "None");
                    }
                    break;
                case "Required":
                    int indexRequiredGift = Integer.parseInt(tokens[2]);
                    if (indexRequiredGift>0 && indexRequiredGift<= gifts.size()-1) {
                        gifts.set(indexRequiredGift, giftToken);
                    }
                    break;
                case "JustInCase":
                    gifts.set(gifts.size()-1, giftToken);
                    break;
            }

            noMoneyCommand= scanner.nextLine();
        }

        for (int i = 0; i <gifts.size() ; i++) {
            if (gifts.get(i)!= "None"){
                System.out.print( gifts.get(i) + " ");
            }
        }

    }
}
