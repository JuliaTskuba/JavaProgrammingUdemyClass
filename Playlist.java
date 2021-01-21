package academy.learnprogramming;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {
    private LinkedList<Song> songs;

    public Playlist() {
        this.songs = new LinkedList<Song>();
    }

    public LinkedList<Song> getSongs() {
        return songs;
    }

    public boolean addSong(AlbumPack albumPack, String album, String song) {
        if (!songExists(song)) {
            if (returnSong(albumPack, album, song) == null) {
                return false;
            }
            ;
            songs.add(returnSong(albumPack, album, song));
            return true;
        }
        return false;
    }

    public Album.Song returnSong(AlbumPack albumPack, String album, String song) {
        Album album1 = albumPack.findAlbum(album);
        return album1.findSong(song);
    }

    private boolean songExists(String song) {
        Iterator<Song> i = songs.iterator();
        while (i.hasNext()) {
            if (i.next().getTitle().equalsIgnoreCase(song)) {
                return true;
            }
        }
        return false;
    }


    public void printPlaylist() {
        Iterator<Song> i = songs.iterator();
        while (i.hasNext())
            System.out.println(i.next().getTitle());
    }

    public void playlist(LinkedList songs) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = songs.listIterator();

        if (songs.isEmpty()) {
        } else {
            System.out.println("Now listening to " + listIterator.next().getTitle());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            switch (action) {
                case 0:
                    System.out.println("Playlist over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now listening " + listIterator.next().getTitle());
                    } else {
                        System.out.println("Reached the end of the playlist");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now listening to " + listIterator.previous().getTitle());
                    } else {
                        System.out.println("We are at the start of the playlist.");
                        goingForward = true;
                    }
                    break;
                case 3:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                        System.out.println("Now listening to " + listIterator.previous().getTitle());
                        listIterator.next();
                    }
                    else{
                        System.out.println("You are at the start of the playlist");
                    }}
                    else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now listening to " + listIterator.next().getTitle());
                        }
                        else {
                            System.out.println("You are at the end of the playlist");
                        }
                    }
                    break;

                case 4:
                    printMenu();
                    break;
                case 5:
                    printPlaylist();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available menu actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next song\n" +
                "2 - go to previous song\n" +
                "3 - replay current song\n" +
                "4 - print menu options\n" +
                "5 - print playlist");
    }

}
