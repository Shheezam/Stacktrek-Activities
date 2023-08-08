package Acts;

import java.util.*;

class MusicPlayer {

    public ArrayList<String> tracks = new ArrayList<String>();
    private boolean playing = false;
    private int currentTrackIndex = -1;
    private int prevcount = 0;
    private int idlecount = 0;




    public void addsong(String[] songs)
    {
        //codehere
        for (String song : songs) {
            if (song.endsWith(".mp3")) {
                this.tracks.add(song);
            }
        }

    }

    public String playpause()
    {
        //codehere
        if (tracks.isEmpty()) {
            return "No Track";
        }
        playing = !playing;
        if(playing){
            if (currentTrackIndex== -1){
                currentTrackIndex = 0;
            }
            return status();
        }else {
            return status();
        }
    }

    public String previous()
    {
        //codehere
        if (tracks.isEmpty()) {
            return "No Track";
        }
        prevcount++;
        if (prevcount== 2) {
            prevcount= 0;
            currentTrackIndex--;
            return status();
        } else {
            return "";
        }

    }

    public String next()
    {
        //codehere
        if (tracks.isEmpty()) {
            return "No Track";
        }
        currentTrackIndex++;
        return status();
    }

    public void idle()
    {
        //codehere
        if (playing) {
            idlecount++;
                if(idlecount==3){
                    idlecount = 0;
                    next();
                }
        }
    }

    public String status()
    {
        //codehere
        if (tracks.isEmpty()) {
            return "No Track";
        }
        if (playing) {
            return "(Playing) " + tracks.get(currentTrackIndex);
        } else {
            return "(Paused) " + tracks.get(currentTrackIndex);
        }

    }
    public static void main(String[] args) {

        String[] songs = {"Hello - World.mp3", "Just Hello again - Adong.mp3", "Hello to the world - MCR.mp3", "Lololol", "Hey!"};
        MusicPlayer res= new MusicPlayer();
        res.addsong(songs);

        System.out.println(res.playpause());
        System.out.println(res.status());
        System.out.println(res.next());
        System.out.println(res.status());
        System.out.println(res.next());
        System.out.println(res.status());
        System.out.println(res.previous());
        System.out.println(res.status());
        res.idle();
        System.out.println(Arrays.toString(res.tracks.toArray()));

    }
}