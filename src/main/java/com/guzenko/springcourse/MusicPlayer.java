package com.guzenko.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("musicPlayer")
public class MusicPlayer {

    private List<Music> musicList = new ArrayList<Music>();

    private String name;
    private int volume;

    //IoC
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public MusicPlayer() {}


    public void playMusic() {
        for (Music music : musicList) {
            System.out.println("Playing music: " + music.getSong());
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
}
