package com.miniProjetoAS;

import com.miniProjetoAS.album.Album;
import com.miniProjetoAS.favorites.Favorites;
import com.miniProjetoAS.music.Music;
import com.miniProjetoAS.playlist.Playlist;
import com.miniProjetoAS.user.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;

public class Main {
    private static Connection connection;

    public Main(){}

    public static void main(String[] args) throws SQLException {

        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/spotify?user=root&password=");
        connection.setAutoCommit(false);

        System.out.println(new Date());

        ///*
        try{
            for (int i=0; i<1000001; i++){
                if (i % 1000 == 0) {
                    System.out.println(i); // Mostra o progresso
                }
                User user = new User();
                String insert = "INSERT INTO usuario (Nome,Email,Data_Nascimento,Senha,id_assinatura)"+
                        "VALUES(?,?,?,?,?)";

                PreparedStatement preparedStatement = connection.prepareStatement(insert);

                preparedStatement.setString(1, user.getName());
                preparedStatement.setString(2, user.getEmail());
                try {
                    preparedStatement.setDate(3, user.getBirthday()); // Converte para java.sql.Date
                } catch (ParseException e) {
                    e.printStackTrace();
                    preparedStatement.setDate(3, null); // Insere null em caso de erro
                }
                preparedStatement.setString(4, user.getPassword());
                preparedStatement.setInt(5, user.getSubscriptionId());


                // Executa a instrução
                preparedStatement.executeUpdate();

                // Realiza o commit a cada 50.000 inserções
                if (i % 50000 == 0 && i != 0) {
                    connection.commit();
                    System.out.println("Commit realizado em: " + i);
                }
            }
            // Commit final
            connection.commit();
        } catch (SQLException e){
            connection.rollback();
            e.printStackTrace();
        }finally {
            connection.close();
        }
        //*/

        /*
        try{
            for (int i=0; i<15; i++){
                if (i % 15 == 0) {
                    System.out.println(i); // Mostra o progresso
                }
                Album album = new Album();
                String insert = "INSERT INTO album (Titulo,Data_Lancamento)"+
                        "VALUES(?,?)";

                PreparedStatement preparedStatement = connection.prepareStatement(insert);

                preparedStatement.setString(1, album.getAlbumName());

                try {
                    preparedStatement.setDate(2, album.getDay()); // Converte para java.sql.Date
                } catch (ParseException e) {
                    e.printStackTrace();
                    preparedStatement.setDate(2, null); // Insere null em caso de erro
                }

                // Executa a instrução
                preparedStatement.executeUpdate();

                // Realiza o commit a cada 15 inserções
                if (i % 15 == 0 && i != 0) {
                    connection.commit();
                    System.out.println("Commit realizado em: " + i);
                }
            }
            // Commit final
            connection.commit();
        } catch (SQLException e){
            connection.rollback();
            e.printStackTrace();
        }finally {
            connection.close();
        }

        */
        /*
        try{
            for (int i=0; i<1001; i++){
                if (i % 1000 == 0) {
                    System.out.println(i); // Mostra o progresso
                }
                Playlist playlist = new Playlist();
                String insert = "INSERT INTO playlist (nome,data_criacao,privacidade,id_usuario)"+
                        "VALUES(?,?,?,?)";

                PreparedStatement preparedStatement = connection.prepareStatement(insert);

                preparedStatement.setString(1, playlist.getPlaylistName());
                try {
                    preparedStatement.setDate(2, playlist.getDay()); // Converte para java.sql.Date
                } catch (ParseException e) {
                    e.printStackTrace();
                    preparedStatement.setDate(2, null); // Insere null em caso de erro
                }
                preparedStatement.setString(3, playlist.getPrivacy());
                preparedStatement.setInt(4, playlist.getUserId());

                // Executa a instrução
                preparedStatement.executeUpdate();

                // Realiza o commit a cada 1000 inserções
                if (i % 1000 == 0 && i != 0) {
                    connection.commit();
                    System.out.println("Commit realizado em: " + i);
                }
            }
            // Commit final
            connection.commit();
        } catch (SQLException e){
            connection.rollback();
            e.printStackTrace();
        }finally {
            connection.close();
        }

        */

        /*
        try{
            for (int i=0; i<150; i++){
                if (i % 150 == 0) {
                    System.out.println(i); // Mostra o progresso
                }
                Music music = new Music();
                String insert = "INSERT INTO musica (Titulo,Duracao,Data_Lancamento)"+
                        "VALUES(?,?,?)";

                PreparedStatement preparedStatement = connection.prepareStatement(insert);

                preparedStatement.setString(1, music.getMusicName());
                preparedStatement.setLong(2, music.getSongDuration());
                try {
                    preparedStatement.setDate(3, music.getDay()); // Converte para java.sql.Date
                } catch (ParseException e) {
                    e.printStackTrace();
                    preparedStatement.setDate(3, null); // Insere null em caso de erro
                }


                // Executa a instrução
                preparedStatement.executeUpdate();

                // Realiza o commit a cada 150 inserções
                if (i % 150 == 0 && i != 0) {
                    connection.commit();
                    System.out.println("Commit realizado em: " + i);
                }
            }

            connection.commit();
        } catch (SQLException e){
            connection.rollback();
            e.printStackTrace();
        }finally {
            connection.close();
        }

        */

        /*
        try{
            for (int i=0; i<1000001; i++){
                if (i % 150 == 0) {
                    System.out.println(i); // Mostra o progresso
                }
                Favorites favorites = new Favorites();
                String insert = "INSERT INTO favorito (id_usuario,id_musica)"+
                        "VALUES(?,?)";

                PreparedStatement preparedStatement = connection.prepareStatement(insert);

                preparedStatement.setInt(1, favorites.getUserId());
                preparedStatement.setInt(2, favorites.getMusicId());

                // Executa a instrução
                preparedStatement.executeUpdate();

                // Realiza o commit a cada 50.000 inserções
                if (i % 50.000 == 0 && i != 0) {
                    connection.commit();
                    System.out.println("Commit realizado em: " + i);
                }
            }

            connection.commit();
        } catch (SQLException e){
            connection.rollback();
            e.printStackTrace();
        }finally {
            connection.close();
        }

        */

    }
}

