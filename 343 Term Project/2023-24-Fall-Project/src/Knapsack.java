package src;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Knapsack {

    public static List<Song> parseSongs(String csvFile){
        List<Song> songs = new ArrayList<>();
        String line;
        String csvSplitBy = ",";
        boolean skipHeader = true; 
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                if (skipHeader) {
                    skipHeader = false;
                    continue; 
                }
                String[] data = line.split(csvSplitBy);
                double popularity = Double.parseDouble(data[1]);
                double duration = Double.parseDouble(data[2]);
                songs.add(new Song(popularity, duration));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return songs;
    }
    public static void main(String[] args) {
        List<Song> songs = parseSongs("songs_data.csv");
        String fileName = "data/cities.csv"; 
        List<City> cities = CSVParser.parseCities(fileName);
        Map<City, List<Song>> result = new HashMap<>();
        //
    }
}
