/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correctAlbum;

import pack.Music;
import java.util.ArrayList;

/**
 *
 * @author muravyovas
 */
public class Album {
    String name;
    String author;
    private ArrayList<Music> songs = new ArrayList<>();
    Album(String name, String author){
        this.name = name;
        this.author = author;
    }
    public void addMusic(Music music){
        if (music.getAlbum() != null){
            music.getAlbum().songs.remove(music);
        }
        this.songs.add(music);
    }

    public Music[] getSongs() {
        return (Music[]) songs.toArray();
    }
    
}
