package src;
import java.util.List;
import src.TSP;

public class Main {

    public static void main(String[] args) {
        // Parse cities from CSV
        List<City> cities = CSVParser.parseCities("cities.csv"); // Replace with your cities CSV file

        // Parse songs from CSV
        List<Song> songs = Knapsack.parseSongs("songs.csv"); // Replace with your songs CSV file

        // Solve Traveling Salesman Problem (TSP) to find the route of cities
        List<City> optimalRoute = TSP.nearestNeighborTSP(cities); // Replace with your TSP solver

    }
}