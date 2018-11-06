package com.wahoo.burrows.morgan;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("game")
public  class GameView extends VerticalLayout
{
    public GameView() {
        final TextField name = new TextField();
        name.setLabel("Type Your Name Here!");
        Button button = new Button("Submit");
        button.addClickListener(event -> button.setEnabled(false));
        add(name);
        add(button);
    }
}