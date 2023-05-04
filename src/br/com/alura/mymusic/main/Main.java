package br.com.alura.mymusic.main;

import br.com.alura.mymusic.model.Music;
import br.com.alura.mymusic.model.MyFavorite;
import br.com.alura.mymusic.model.Podcast;

public class Main {
    public static void main(String[] args) {
        Music musicOne = new Music();
        musicOne.setTitle("Vida loka");
        musicOne.setSinger("Racionais MC's");
        musicOne.setAlbum("Nada como um dia após o outro dia, Vol.1 & 2");
        musicOne.setGender("Rap");
        musicOne.setDuration(5);

        Podcast podcastOne = new Podcast();
        podcastOne.setTitle("NerdCast 878 | Dungeons & Dragons: Acabou a galhofa!");
        podcastOne.setPresenter("Jovem Nerd");
        podcastOne.setDescription("Está sacramentado, acabou a galhofa! Vinte anos depois daquela péssima adaptação, hoje podemos dizer que temos um bom filme de Dungeons & Dragons! Honra Entre Rebeldes é um filme bom e vamos discutir COM SPOILERS nesse programa.");
        podcastOne.setDuration(92);

        System.out.println(musicOne.getTitle());
        System.out.println(musicOne.getSinger());
        System.out.println(musicOne.getAlbum());
        System.out.println(musicOne.getGender());
        System.out.println(musicOne.getDuration());
        System.out.println(musicOne.getLikes());
        System.out.println(musicOne.getTotalPlays());
        for (int i = 0; i < 8; i++) {
            musicOne.play();
        }
        for (int i = 0; i < 5; i++) {
            musicOne.like();
        }
        musicOne.getRank();
        System.out.println(musicOne.getLikes());
        System.out.println(musicOne.getTotalPlays());
        System.out.println("Classificação: " + musicOne.getClassification());


        System.out.println(podcastOne.getTitle());
        System.out.println(podcastOne.getPresenter());
        System.out.println(podcastOne.getDescription());
        System.out.println(podcastOne.getDuration());
        for (int i = 0; i < 8; i++) {
            podcastOne.play();
        }
        for (int i = 0; i < 5; i++) {
            podcastOne.like();
        }
        podcastOne.getRank();
        System.out.println("Classificação: " + podcastOne.getClassification());

        MyFavorite myFavorite = new MyFavorite();
        myFavorite.message(musicOne);
        myFavorite.message(podcastOne);
    }
}
