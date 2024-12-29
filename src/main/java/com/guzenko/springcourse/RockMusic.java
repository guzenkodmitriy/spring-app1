package com.guzenko.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music{
    private List<String> songs = new ArrayList<>();
    {
        songs.add("Rock 1");
        songs.add("Rock 2");
        songs.add("Rock 3");
    }

    public List<String> getSongs() {

        return songs;
    }
}
