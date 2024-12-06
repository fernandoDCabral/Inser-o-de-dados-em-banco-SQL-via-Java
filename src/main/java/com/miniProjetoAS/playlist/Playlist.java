package com.miniProjetoAS.playlist;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Playlist {
    private int userId;
    private String day;
    private String privacy;
    private String playlistName;
    private PlaylistRandomizer playlistRandomizer = new PlaylistRandomizer();

    public Playlist() {
        this.userId = playlistRandomizer.generateSubscriptionId();
        this.day = playlistRandomizer.generateRandomDay();
        this.privacy = playlistRandomizer.generateRandomPrivacy();
        this.playlistName = playlistRandomizer.generateRandomPlaylistName();
    }

    public int getUserId() {
        return userId;
    }

    public String getPrivacy() {
        return privacy;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public PlaylistRandomizer getPlaylistRandomizer() {
        return playlistRandomizer;
    }

    public java.sql.Date getDay() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date parsedDate = formatter.parse(this.day);
        return new java.sql.Date(parsedDate.getTime());
    }

}
