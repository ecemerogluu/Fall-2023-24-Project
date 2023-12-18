from csv_parser import CSVParser
from knapsack import Knapsack
from tsp import TSP

def main():
    songs = CSVParser.parse_songs("songs_data.csv")
    max_duration = 200  # Replace this value with your desired maximum duration
    selected_songs = Knapsack.knapsack(songs, max_duration)
    for song in selected_songs:
        print(f"Song: Popularity - {song.popularity}, Duration - {song.duration}")

    file_name = "data/cities.csv"
    cities = CSVParser.parse_cities(file_name)
    result = TSP.nearest_neighbor_tsp(cities)
    # Other parts of your code

if __name__ == "__main__":
    main()
