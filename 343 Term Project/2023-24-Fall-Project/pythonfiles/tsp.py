class TSP:
    @staticmethod
    def nearest_neighbor_tsp(cities):
        num_cities = len(cities)
        visited = [False] * num_cities
        tour = []

        current_city = cities[0]
        visited[0] = True
        
        tour.append(current_city)
        total_dist = 0
        
        while len(tour) < num_cities:
            min_dist = float('inf')
            x = 0
            for j in range(num_cities):
                if not visited[j]:
                    dist = current_city.distance_to(cities[j])
                    if dist < min_dist:
                        min_dist = dist
                        x = j
            total_dist += min_dist
            visited[x] = True
            tour.append(cities[x])
            current_city = cities[x]
            
        return tour, total_dist
