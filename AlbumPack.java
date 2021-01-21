package academy.learnprogramming;

import java.util.ArrayList;

public class AlbumPack {
    private String name;
    private ArrayList<Album> allAlbums;

    public AlbumPack(String name) {
        this.name = name;
        this.allAlbums = new ArrayList<Album>();
    }

    public boolean albumExists(String albumName) {
        for (int i = 0; i < allAlbums.size(); i++) {
            if (allAlbums.get(i).getAlbumName().equalsIgnoreCase(albumName)) {
                return true;
            }
        }
        return false;
    }

    public Album findAlbum(String albumName) {
        for (int i = 0; i < allAlbums.size(); i++) {
            if (allAlbums.get(i).getAlbumName().equalsIgnoreCase(albumName)) {
                return allAlbums.get(i);
            }
        }
        return null;
    }

    public boolean addAlbum(String albumName) {
        if (!albumExists(albumName)) {
            allAlbums.add(new Album(albumName));
            return true;
        }
        return false;
    }

    public boolean addSong(String song, double duration, String albumName) {
        Album album = findAlbum(albumName);
        if (album != null) {
            album.newSong(song, duration);
            return true;
        }
        return false;
    }

    public boolean exposeAlbum(String albumName) {
        Album album = findAlbum(albumName);
        if (album != null) {
            ArrayList<Album.Song> songs = album.getListOfSongs();
            for(int i = 0; i < songs.size(); i++) {
                System.out.println("Song " + (i+1) + ":" + songs.get(i).getTitle());
            }
            return true;
        }
        return false;
    }
}
