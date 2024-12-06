package com.miniProjetoAS.music;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Music {
    private int Album;
    private int Genre;
    private int MusicalGenre;
    private int Popularity;
    private String Day;
    private String MusicName;
    private long SongDuration;
    private MusicRandomizer randomizer = new MusicRandomizer();

    public Music(){
        this.Album = randomizer.generateRandomAlbum();
        this.Genre = randomizer.generateRandomGenre();
        this.MusicalGenre = randomizer.generateRandomMusicalGenre();
        this.Popularity = randomizer.generateRandomPopularity();
        this.Day = randomizer.generateRandomDay();
        this.MusicName = randomizer.generateRandomMusicName();
        this.SongDuration = randomizer.SongDuration();
    }

    public int getAlbum() {
        return Album;
    }

    public int getGenre() {
        return Genre;
    }

    public int getMusicalGenre() {
        return MusicalGenre;
    }

    public int getPopularity() {
        return Popularity;
    }

    public String getMusicName() {
        return MusicName;
    }

    public long getSongDuration() {
        return SongDuration;
    }

    public java.sql.Date getDay() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date parsedDate = formatter.parse(this.Day);
        return new java.sql.Date(parsedDate.getTime());
    }
}
