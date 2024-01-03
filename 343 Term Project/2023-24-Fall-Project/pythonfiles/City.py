class City:
    def __init__(self, name, latitude, longitude, duration):
        self.name = name
        self.latitude = latitude
        self.longitude = longitude
        self.duration = duration

    def distance_to(self, other_city):
        x_distance = abs(self.latitude - other_city.get_x())
        y_distance = abs(self.longitude - other_city.get_y())
        return ((x_distance ** 2) + (y_distance ** 2)) ** 0.5

    def get_name(self):
        return self.name

    def get_x(self):
        return self.latitude

    def get_y(self):
        return self.longitude
    
    def get_duration(self):
        return self.duration
