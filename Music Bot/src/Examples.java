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
    public void shuffleTest(){
        ArrayList<String> songs = new ArrayList<>();
        Playlist playlist = new Playlist("Playlist", songs);
        playlist.intakeSongs("Bohemian Rhapsody", "Humble", "Ride on Time", "Feel It", "Father Stretch My Hands Pt.1", "Stir Fry", "My Boo");
        System.out.print(playlist.tempSongs);
        System.out.print("\n");
        playlist.enableShuffle();
        System.out.print(playlist.tempSongs);
    }
    @Test
    public void searchCurrentURL()
            throws MalformedURLException {
        Search search = new Search();
        search.intakeKeyword("https://www.youtube.com/results?search_query=never+gonna+give+you+up");
        assertEquals(search.link, new URL("https://www.youtube.com/results?search_query=never%20gonna%20give%20you%20up"));
    }
    @Test
    public void searchCreateURL()
            throws MalformedURLException {
        Search search = new Search();
        search.intakeKeyword("pink+white frank ocean");
        assertEquals(search.link, new URL("https://www.youtube.com/results?search_query=pink%2Bwhite%20frank%20ocean"));
    }
    @Test
    public void setDefaultSite()
            throws MalformedURLException{
    }
}
