import numpy as np

class Knapsack:
    @staticmethod
    def knapsack(songs, max_duration):
        num_songs = len(songs)
        selected_songs = []
        
        durations = [song.duration for song in songs]
        popularities = [song.popularity for song in songs]

        table = np.zeros((num_songs+1, max_duration + 1))
        
        for i in range(0, num_songs):
            for w in range(0, max_duration+1):
                if durations[i] <= w:
                    table[i+1, w] = max(table[i, w], popularities[i] + table[i, w - round(durations[i])])
                else:
                    table[i+1, w] = table[i, w]
        
        i = num_songs
        w = max_duration
        
        while i > 0 and w > 0:
            if table[i, w] == table[i-1, w]:
                i -= 1
            else:
                w -= round(durations[i-1])
                selected_songs.append(songs[i-1])
                i -= 1
        
        return selected_songs
