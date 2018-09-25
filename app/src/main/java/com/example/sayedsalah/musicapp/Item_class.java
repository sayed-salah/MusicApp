package com.example.sayedsalah.musicapp;

/**
 * Created by Sayed Salah on 9/23/2017.
 */
public class Item_class {
    int image1 = 0, image2 = 0;
    String song_name = "";

    public Item_class(int image1, String song_name, int image2) {
        this.image1 = image1;
        this.song_name = song_name;
        this.image2 = image2;
    }

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public String getSong_name() {
        return song_name;
    }

    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }
}
