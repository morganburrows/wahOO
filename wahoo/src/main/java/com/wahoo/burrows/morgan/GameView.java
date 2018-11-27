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
    public void setupPlayer(){
        Player player = new Player();

        FormLayout playerLayout = new FormLayout();

        TextField playerNameField = new TextField();
        playerNameField.setPlaceholder("Name");
        playerNameField.addValueChangeListener(event -> player.setName(event.getValue()));

        ComboBox<String> colorBox = new ComboBox<>("Color");
        colorBox.setItems("blue", "red", "greed", "yellow");

        playerLayout.add(playerNameField, colorBox);

        add(playerLayout);

    }

    public void setupBoard(){

        FormLayout horizontalTrack = new FormLayout();
        FormLayout verticalTrack = new FormLayout();


    }

    public GameView() {

        //setupPlayer();


    }




}
