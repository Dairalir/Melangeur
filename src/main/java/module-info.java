module com.example.melangeur_couleur {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.melangeur_couleur to javafx.fxml;
    exports com.example.melangeur_couleur;
    exports com.example.melangeur_couleur.GUI;
    opens com.example.melangeur_couleur.GUI to javafx.fxml;
}