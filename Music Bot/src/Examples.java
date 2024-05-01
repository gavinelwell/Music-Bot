import org.junit.Test;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Examples {
    @Test
    public void playlistIntakeSong(){
        ArrayList<String> songs = new ArrayList<>();
        Playlist playlist = new Playlist("Playlist", songs);
        playlist.intakeSong("Bohemian Rhapsody");
        playlist.intakeSong("Humble");
        playlist.intakeSong("Ride on Time");
        playlist.intakeSong("Feel It");
        System.out.print(playlist.tempSongs);
    }
    @Test
    public void playlistIntakeSongs(){
        ArrayList<String> songs = new ArrayList<>();
        Playlist playlist = new Playlist("Playlist", songs);
        playlist.intakeSongs("Bohemian Rhapsody", "Humble", "Ride on Time", "Feel It");
        System.out.print(playlist.tempSongs);
    }
    @Test
    public void playlistIntakePlaylist(){
        ArrayList<String> songs = new ArrayList<>();
        Playlist playlist = new Playlist("Playlist", songs);
        ArrayList<String> newSongs = new ArrayList<>();
        newSongs.add("Bohemian Rhapsody");
        newSongs.add("Humble");
        newSongs.add("Ride on Time");
        newSongs.add("Feel it");
        playlist.intakePlaylist(newSongs);
        System.out.print(playlist.tempSongs);
    }
    @Test
    public void searchAlreadyURL()
            throws MalformedURLException {
        Search search = new Search();
        search.intakeKeyword("https://www.youtube.com/results?search_query=never+gonna+give+you+up");
        assertEquals(search.link, new URL("https://www.youtube.com/results?search_query=never+gonna+give+you+up"));
    }
    @Test
    public void searchCreateURL()
            throws MalformedURLException {
        Search search = new Search();
        search.intakeKeyword("never gonna give you up");
        assertEquals(search.link, new URL("https://www.youtube.com/results?search_query=never+gonna+give+you+up"));
    }
}
