package com.wahoo.burrows.morgan;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("game")
public  class GameView extends VerticalLayout
{
    public GameView() {

        Player player = new Player();

        final TextField nameInput = new TextField();
        nameInput.setLabel("Type Your Name Here!");

        Button button = new Button("Submit");
        button.addClickListener(event -> player.setName(nameInput.getValue()));
        button.addClickListener(event ->  add(new Label("Thanks " + player.getName(player) + "!" )));

        button.addClickListener(event -> remove(nameInput));




        add(nameInput);
        add(button);


    }




}

