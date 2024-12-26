package com.guzenko.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class FolkMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Folk 1");
        songs.add("Folk 2");
        songs.add("Folk 3");
    }

    @Override
    public List<String> getSongs() {

        return songs;
    }
}
