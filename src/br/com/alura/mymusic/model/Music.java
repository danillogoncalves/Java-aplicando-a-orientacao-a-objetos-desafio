package br.com.alura.mymusic.model;

import br.com.alura.mymusic.sortable.Classification;

public class Music extends Audio implements Classification {
    private String album;

    private String singer;

    private String gender;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void getRank() {
        if (getTotalPlays() >= 10) {
            classification = 5;
        } else if (getTotalPlays() >=8) {
            classification = 4;
        } else if (getTotalPlays() >=6) {
            classification = 3;
        } else if (getTotalPlays() >=4) {
            classification = 2;
        }  else if (getTotalPlays() >=2) {
            classification = 1;
        } else {
            classification = 0;
        }
    }
}
