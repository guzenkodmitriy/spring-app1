package com.guzenko.springcourse;

import org.springframework.stereotype.Component;

@Component("musicBeanFolk")
public class FolkMusic implements Music {

    @Override
    public String getSong() {
        return "Fuck music";
    }
}
