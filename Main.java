package academy.learnprogramming;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AlbumPack albumPack = new AlbumPack("Julia's Album Playlist");

        albumPack.addAlbum("DWS");
        albumPack.addSong("Dance with somebody", 3.14, "DWS");

        albumPack.addAlbum("Thriller");
        albumPack.addSong("Thriller", 4.50, "Thriller");

        albumPack.addAlbum("Country");
        albumPack.addSong("Bootscootingboogie", 3.50, "Country");
        albumPack.addSong("honkietonk badonkitonk", 5.0, "Country");

        Playlist playlist = new Playlist();
        playlist.addSong(albumPack, "DWS", "Dance with somebody");
        playlist.addSong(albumPack, "Country", "Bootscootingboogie");
        playlist.addSong(albumPack, "Country", "honkietonk badonkitonk");

        playlist.playlist(playlist.getSongs());
    }

}
