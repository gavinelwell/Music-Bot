import java.util.ArrayList;

public class Queue{
    public ArrayList<String> setList;
    public boolean songPlaying;
    public Queue(ArrayList<String> setList, boolean songPlaying){
        this.setList = setList;
        this.songPlaying = songPlaying;
    }
    public void skipSong(){

    }
    public void playSong(String song){

    }
    public void playPlaylist(Playlist playlist){

    }
    public void queueSong(String song){

    }
    public void queuePlaylist(Playlist playlist){
        int smallerLength;
        boolean playlistLonger;
        ArrayList<String> newSetList = new ArrayList<>();

        // Determines the length of the shorter list
        if (playlist.songs.size() < this.setList.size()){
            smallerLength = playlist.songs.size();
            playlistLonger = false;
        }
        else {
            smallerLength = this.setList.size();
            playlistLonger = true;
        }

        // Integrates both lists in an alternating fashion
        for (int i = 0; i <= smallerLength; i++){
            newSetList.add(playlist.songs.get(i));
            newSetList.add(this.setList.get(i));
        }

        // Adds rest of longer list
        if (playlistLonger){
            for (int i = smallerLength + 1; i <= playlist.songs.size(); i++) {
                newSetList.add(playlist.songs.get(i));
            }
        }
        else {
            for (int i = smallerLength + 1; i <= this.setList.size(); i++){
                newSetList.add(this.setList.get(i));
            }
        }
    }
}
