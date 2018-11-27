package com.wahoo.burrows.morgan;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.combobox.ComboBox;

@Route("game")
public  class GameView extends VerticalLayout
{
    public void makePlayer(){

        Player player = new Player();
        //player.playerID = idNumber;

        FormLayout playerLayout = new FormLayout();

        Checkbox playerCheckbox = new Checkbox();
        playerCheckbox.setLabel("Player " + player.playerID);

        TextField playerNameField = new TextField();
        playerNameField.setPlaceholder("Name");

        ComboBox<String> colorBox = new ComboBox<>("Color");
        colorBox.setItems("blue", "red", "greed", "yellow");

        playerLayout.add(playerCheckbox, playerNameField, colorBox);

        add(playerLayout);



    }

    public GameView() {

        int i = 1;

        Button makePlayerButton = new Button("add Player");
        makePlayerButton.addClickListener(event -> makePlayer());

        add(makePlayerButton);
        makePlayer();


        i++;










//        final TextField nameInput = new TextField();
//        Button namebutton = new Button("Submit");
//        Button nextButton = new Button("Next");
//
//
//        nameInput.setLabel("Type Your Name Here!");
//
//        namebutton.addClickListener(event -> Player.setName(nameInput.getValue()));
//        namebutton.addClickListener(event -> nameInput.setLabel("Thanks " + Player.Name + "!" ));
//        namebutton.addClickListener(event -> add(nextButton));
//
//        add(nameInput,namebutton);
//
//        ComboBox<String> colorBox = new ComboBox<>("Pick your color, " + Player.Name);
//        colorBox.setItems("Blue", "Red", "Green");
//
//        //nextButton.addClickListener(event -> remove(nameInput,namebutton,nextButton));
//        nextButton.addClickListener(event -> add(colorBox));



    }




}
