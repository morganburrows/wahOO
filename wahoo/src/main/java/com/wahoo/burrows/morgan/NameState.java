package com.wahoo.burrows.morgan;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class NameState extends VerticalLayout implements DisplayState  {

    @Override
    public void changeDisplay() {

        Player player = new Player();
        final TextField nameInput = new TextField();
        Button namebutton = new Button("Submit");
        Button nextButton = new Button("Next");


        nameInput.setLabel("Type Your Name Here!");

        namebutton.addClickListener(event -> player.setName(nameInput.getValue()));
        namebutton.addClickListener(event ->  nameInput.setLabel("Thanks " + player.getName(player) + "!" ));
        namebutton.addClickListener(event -> add(nextButton));

    }
}

