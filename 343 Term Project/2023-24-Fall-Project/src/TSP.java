package src;
import java.util.ArrayList;
import java.util.List;


public class TSP {
    private List<City> cities;

    public TSP(List<City> cities) {
        this.cities = new ArrayList<>(cities);
    }

    public static List<City> nearestNeighborTSP(List<City> cities) {
        int numCities = cities.size();
        boolean[] visited = new boolean[numCities];
        List<City> tour = new ArrayList<>();

        City currentCity = cities.get(0); // Start from the first city
        visited[0] = true;
        //your algorithm here
        return tour;
    }

    public static void main(String[] args) {
        // Use CSVParser to obtain the list of cities from the CSV file
        String fileName = "data/cities.csv"; // Provide the correct path to your CSV file

        List<City> cities = CSVParser.parseCities(fileName);
        List<City> selectedCities = cities.subList(0, Math.min(20, cities.size()));
        TSP tsp = new TSP(selectedCities);
        //
    }
}
