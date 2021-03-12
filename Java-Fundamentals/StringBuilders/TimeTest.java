import java.util.Date;

public class TimeTest {
    public static void main(String[] args) {
        Date start = new Date();
        String repeated = repeatArr("a", 10000000);
        Date end = new Date();
        long ms = end.getTime() - start.getTime();
        System.out.println(ms);


    }

    public static String repeatArr(String word, int count){
        String[] repeatArrs = new String[count];
        for (int i = 0; i <count ; i++) {
            repeatArrs[i]= word;
        }
        return repeatArrs.toString();
    }

    public static String repeatStringBuilder(String word, int count){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <count ; i++) {
            sb.append(word);
        }
        return sb.toString();
    }

    public static String repeatConcat(String word, int count){
        String repeat = "";
        for (int i = 0; i <count ; i++) {
            repeat+=word;
        }
        return repeat;
    }

}
