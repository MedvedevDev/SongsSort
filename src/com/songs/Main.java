package com.songs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Main {
    ArrayList<String> songList =new ArrayList<>();

    public static void main(String[] args) {
        new Main().go();
    }

    public void go(){
        getSongs();
        Collections.sort(songList);
        System.out.println(songList);
    }

    void getSongs(){
        try {
            File songs = new File("D:\\java\\SongsSort\\mysongs.txt");
            BufferedReader reader = new BufferedReader(new FileReader(songs));
            String line = null;
            while ((line = reader.readLine()) != null) {
              //  System.out.println(line);
                addSong(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    void addSong(String lineToParse){
        String[] token = lineToParse.split("/");
       // System.out.println(token[0]);
        songList.add(token[0]);
    }
}
