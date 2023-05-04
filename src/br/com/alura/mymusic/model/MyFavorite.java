package br.com.alura.mymusic.model;

public class MyFavorite {
    public void message(Audio audio) {
        switch (audio.getClassification()) {
            case 5:
                System.out.println("Fantástico");
                break;
            case 4:
                System.out.println("Bom");
                break;
            case 3:
                System.out.println("Mais o menos");
                break;
            case 2:
                System.out.println("Ruim");
                break;
            case 1:
                System.out.println("Terrível");
                break;
            default:
                System.out.println("Prefiro não opinar");
        }
    }
}
