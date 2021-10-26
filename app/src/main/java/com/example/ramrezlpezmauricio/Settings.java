package com.example.ramrezlpezmauricio;
/**
 * @author Mauricio Ramírez López
 */
public class Settings {
    private String title;
    private String description;
    private int image;

    //Constructor:
    public Settings(String title, String description, int image){
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}


