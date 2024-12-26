package com.guzenko.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> songs = new ArrayList<>();
    {
        songs.add("Rock 1");
        songs.add("Rock 2");
        songs.add("Rock 3");
    }

    @Override
    public List<String> getSongs() {

        return songs;
    }
}
