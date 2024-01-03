from csv_parser import CSVParser
from knapsack import Knapsack
from tsp import TSP
import time

def main():
    start = time.time()
    songs = CSVParser.parse_songs("../data/songs_data.csv")
    file_name = "../data/cities.csv"
    cities = CSVParser.parse_cities(file_name)
    result = TSP.nearest_neighbor_tsp(cities)
    
    total_popularity = 0
    total_duration = 0
 
    print("Tour route:")
    print("")
    for city in result[0]:
        print(city.get_name())
        max_duration = city.get_duration()
        selected_songs = Knapsack.knapsack(songs, max_duration)
        for song in selected_songs:
            total_popularity += song.popularity
            total_duration += song.duration
           
    print("")
    print("Total distance:", result[1])
    print("Total popularity:", total_popularity)
    print("Total duration:", total_duration)
    end = time.time()
    print((end-start) * 10**3, "ms")
if __name__ == "__main__":
    main()
