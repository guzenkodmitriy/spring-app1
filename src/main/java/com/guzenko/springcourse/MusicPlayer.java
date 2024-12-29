package com.guzenko.springcourse;

import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> musicList;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

//    private ClassicalMusic classicalMusic;
//    private RockMusic rockMusic;
//    private FolkMusic folkMusic;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        Random random = new Random();

        // случайное целое число между 0 и 2
        int randomNumberList = random.nextInt(3);
        int randomNumberSong = random.nextInt(3);

        return musicList.get(randomNumberList).getSongs().get(randomNumberSong);

    }
}
