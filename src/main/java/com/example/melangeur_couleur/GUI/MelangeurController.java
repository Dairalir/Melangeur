package com.example.melangeur_couleur.GUI;

import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;

public class MelangeurController {

    public Label color_result;
    public Slider red_slider;
    public Slider green_slider;
    public Slider blue_slider;

    public void Slide_Red(MouseEvent mouseEvent) {
        double sred = red_slider.getValue();
        double sgreen = green_slider.getValue();
        double sblue = blue_slider.getValue();
        color_result.setStyle("-fx-background-color: rgb(" + sred + "," + sgreen + "," + sblue + ")");
    }

    public void Slide_Green(MouseEvent mouseEvent) {
        double sred = red_slider.getValue();
        double sgreen = green_slider.getValue();
        double sblue = blue_slider.getValue();
        color_result.setStyle("-fx-background-color: rgb(" + sred + "," + sgreen + "," + sblue + ")");
    }

    public void Slide_Blue(MouseEvent mouseEvent) {
        double sred = red_slider.getValue();
        double sgreen = green_slider.getValue();
        double sblue = blue_slider.getValue();
        color_result.setStyle("-fx-background-color: rgb(" + sred + "," + sgreen + "," + sblue + ")");
    }
}