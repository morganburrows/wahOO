package com.wahoo.burrows.morgan;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("game")
public  class GameView extends VerticalLayout
{
    static String state = "name";
    public GameView() {

        Player player = new Player();
        DisplayContext context = new DisplayContext();
        NameState namest = new NameState();
        PlayerState playerst = new PlayerState();

        context.setDstate(namest);

        final TextField nameInput = new TextField();
        Button namebutton = new Button("Submit");
        Button nextButton = new Button("Next");


        nameInput.setLabel("Type Your Name Here!");

        namebutton.addClickListener(event -> player.setName(nameInput.getValue()));
        namebutton.addClickListener(event ->  nameInput.setLabel("Thanks " + player.getName(player) + "!" ));
        namebutton.addClickListener(event -> add(nextButton));

        nextButton.addClickListener(event -> state = "players");

        if(state == "name"){
            add(nameInput, namebutton);
        }
        else if(state == "players"){
            remove(nameInput, namebutton);
        }



    }




}
