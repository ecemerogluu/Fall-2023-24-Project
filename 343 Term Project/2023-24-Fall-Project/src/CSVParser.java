package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVParser {
    public static List<City> parseCities(String fileName) {
        List<City> cities = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            boolean headerSkipped = false; // Skip the header line

            while ((line = reader.readLine()) != null) {
                if (!headerSkipped) {
                    headerSkipped = true;
                    continue; // Skip the header line
                }

                String[] data = line.split(",");

                String cityName = data[0].trim();
                double latitude = Double.parseDouble(data[2].trim());
                double longitude = Double.parseDouble(data[3].trim());

                City city = new City(cityName, latitude, longitude);
                cities.add(city);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return cities;
    }
}
