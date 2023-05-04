package br.com.alura.mymusic.model;

import br.com.alura.mymusic.sortable.Classification;

public class Podcast extends Audio implements Classification {
    private String presenter;

    private String description;

    public String getPresenter() {
        return presenter;
    }

    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void getRank() {
        if (getLikes() >= 10) {
            classification = 5;
        } else if (getLikes() >=8) {
            classification = 4;
        } else if (getLikes() >=6) {
            classification = 3;
        } else if (getLikes() >=4) {
            classification = 2;
        }  else if (getLikes() >=2) {
            classification = 1;
        } else {
            classification = 0;
        }
    }
}
