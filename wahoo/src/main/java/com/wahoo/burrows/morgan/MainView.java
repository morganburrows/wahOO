package com.wahoo.burrows.morgan;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Router;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.router.Route;


/**
 * The main view contains a button and a click listener.
 */
@Route("")
public class MainView extends VerticalLayout {

    public MainView() {

        add(new Label("Welcome to wahOO!"));

        Button newGameButton = new Button("New Game");
        newGameButton.addClickListener(event -> newGameButton.getUI().ifPresent(ui -> ui.navigate("game")));

        Button howToPlayButton = new Button("How to Play");
        howToPlayButton.addClickListener(event -> howToPlayButton.getUI().ifPresent(ui -> ui.navigate("rules")));

        Button aboutButton = new Button("About");
        aboutButton.addClickListener(event -> aboutButton.getUI().ifPresent(ui -> ui.navigate("about")));

        add(newGameButton, howToPlayButton, aboutButton);



    }



}


