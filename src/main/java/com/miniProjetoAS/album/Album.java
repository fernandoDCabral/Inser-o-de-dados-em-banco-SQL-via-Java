package com.miniProjetoAS.album;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Album {
    private int artistId;
    private String day;
    private String albumName;
    private AlbumRandomizer albumRandomizer= new AlbumRandomizer();

    public Album() {
        this.artistId = albumRandomizer.generateRandomArtistId();
        this.day = albumRandomizer.generateRandomDay();
        this.albumName = albumRandomizer.generateRandomAlbumName();
    }

    public int getArtistId() {
        return artistId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public java.sql.Date getDay() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date parsedDate = formatter.parse(this.day);
        return new java.sql.Date(parsedDate.getTime());
    }
}
