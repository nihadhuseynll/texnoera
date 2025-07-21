package musiclibrary;

import java.util.Random;

public class MusicLibrary {

    private Song[] songs;
    private int count;

    public MusicLibrary() {
        songs = new Song[100];
        count = 0;
    }

    public void addSong(Song song) {
        if (count < songs.length) {
            songs[count] = song;
            count++;
        } else {
            System.out.println("Kitabxana doludur. Yeni mahnı əlavə etmək mümkün deyil.");
        }
    }

    public void removeSong(Song song) {
        for (int i = 0; i < count; i++) {
            if (songs[i].getTitle().equals(song.getTitle()) &&
                    songs[i].getArtist().equals(song.getArtist())) {

                for (int j = i; j < count - 1; j++) {
                    songs[j] = songs[j + 1];
                }
                songs[count - 1] = null;
                count--;
                System.out.println("Mahnı silindi.");
                return;
            }
        }
        System.out.println("Mahnı tapılmadı.");
    }

    public Song[] getSongs() {
        Song[] result = new Song[count];
        for (int i = 0; i < count; i++) {
            result[i] = songs[i];
        }
        return result;
    }

    public void playRandomSong() {
        if (count == 0) {
            System.out.println("Kitabxanada heç bir mahnı yoxdur.");
            return;
        }

        Random rand = new Random();
        int index = rand.nextInt(count);
        Song song = songs[index];
        System.out.println("İndi səsləndirilir: " + song.getTitle() + " - " + song.getArtist());
    }
}