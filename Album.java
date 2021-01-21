package academy.learnprogramming;

import java.util.ArrayList;

public class Album {
    private String albumName;
    private ArrayList<Song> listOfSongs;

    public class Song {
        private String Title;
        private double Duration;

        public Song(String title, double duration) {
            Title = title;
            Duration = duration;
        }

        public String getTitle() {
            return Title;
        }

        public double getDuration() {
            return Duration;
        }
    }

    public Album(String albumName) {
        this.albumName = albumName;
        this.listOfSongs = new ArrayList<Song>();
    }

    public boolean newSong(String songName, double duration) {
        if (!songExists(songName)) {
            listOfSongs.add(new Song(songName, duration));
            return true;
        }
        return false;
    }

    public String getAlbumName() {
        return albumName;
    }

    public ArrayList<Song> getListOfSongs() {
        return listOfSongs;
    }

    public boolean songExists(String song) {
        for (int i = 0; i < listOfSongs.size(); i++) {
            if(listOfSongs.get(i).getTitle().equalsIgnoreCase(song)){
                return true;
            }
        }
        return false;
    }

    public Song findSong(String song) {
        for (int i = 0; i < listOfSongs.size(); i++) {
            if(listOfSongs.get(i).getTitle().equalsIgnoreCase(song)){
                return listOfSongs.get(i);
            }
        }
        return null;
    }
}
