import java.util.ArrayList;
import java.util.Collections;

public class Playlist{
    public String name;
    public ArrayList<String> songs;
    public ArrayList<String> tempSongs;
    public Playlist(String name, ArrayList<String> songs){
        this.name = name;
        this.songs = songs;
        ArrayList<String> tempSongs = new ArrayList<>();
        tempSongs.addAll(songs);
        this.tempSongs = tempSongs;
    }
    public void intakeSong(String song){
        this.songs.add(song);
        this.tempSongs.add(song);
    }
    public void intakeSongs(String... songs){
        for (String song : songs){
            this.songs.add(song);
            this.tempSongs.add(song);
        }
    }
    public void intakePlaylist(ArrayList<String> playlist){
        this.songs.addAll(playlist);
        this.tempSongs.addAll(playlist);
    }
    public void disableShuffle(){
        this.tempSongs.clear();
        this.tempSongs.addAll(this.songs);
    }
    public void enableShuffle(){
        Collections.shuffle(this.tempSongs);
    }
}
