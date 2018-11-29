package com.wahoo.burrows.morgan;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.combobox.ComboBox;

@Route("game")
public  class GameView extends VerticalLayout
{

    public GameView() {

        game game = new game();

        Button startGame = new Button("start game");
        startGame.addClickListener(event -> game.startGame());

        Notification winNotifier = new Notification("the winner is " + game.winner, 5000);
        if(game.winConditionMet){
            winNotifier.open();
        }

        add(startGame);
    }
}
