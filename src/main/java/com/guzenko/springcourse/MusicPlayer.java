package com.guzenko.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("musicPlayer")
public class MusicPlayer {

    private List<Music> musicList = new ArrayList<Music>();

    private String name;
    private int volume;

    @Autowired
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public MusicPlayer() {}


    public String playMusic() {
        List<Music> musicList = getMusicList();
        StringBuilder playlist = new StringBuilder();
        for (Music music : musicList) {
            playlist.append(music.getSong());
        }

        return playlist.toString();
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
