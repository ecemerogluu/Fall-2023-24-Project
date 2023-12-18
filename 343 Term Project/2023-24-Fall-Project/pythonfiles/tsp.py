class TSP:
    @staticmethod
    def nearest_neighbor_tsp(cities):
        num_cities = len(cities)
        visited = [False] * num_cities
        tour = []

        current_city = cities[0]  # Start from the first city
        visited[0] = True
        # Your algorithm here

        # TSP algorithm implementation
        # ... (use the previously provided nearest_neighbor_tsp function here)
        return tour  # Return the tour of cities
