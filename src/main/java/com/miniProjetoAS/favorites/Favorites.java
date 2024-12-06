package com.miniProjetoAS.favorites;

public class Favorites {
    private int userId;
    private int musicId;
    private FavoritesRandomizer favoriteRandomizer = new FavoritesRandomizer();

    public Favorites() {
        this.userId = favoriteRandomizer.generateUserId();
        this.musicId = favoriteRandomizer.generateMusicId();
    }

    public int getUserId() {
        return userId;
    }

    public int getMusicId() {
        return musicId;
    }
}
