import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Song04 {
    static class Song {
        public String typeList;
        String name;
        String time;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSongs = Integer.parseInt(scanner.nextLine());
        List<Song> playlist = new ArrayList<>();

        for (int i = 0; i < numberOfSongs; i++) {
            String[] currentSong = scanner.nextLine().split("_");
            Song currentPlaylist = new Song(currentSong[0], currentSong[1], currentSong[2]);
            playlist.add(currentPlaylist);
        }
        String command = scanner.nextLine();
        if (command.equals("all")) {
            for (Song s : playlist) {
                System.out.println(s.name);
            }
        } else {
            for (Song s : playlist) {
              if (s.typeList.equals(command)){
                  System.out.println(s.name);
              }
            }
        }
    }


}

