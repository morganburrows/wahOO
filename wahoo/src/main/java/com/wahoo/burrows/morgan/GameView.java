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


    public void setupBoard(){

        FormLayout horizontalTrack = new FormLayout();
        FormLayout verticalTrack = new FormLayout();


    }

    public GameView() {

        game game = new game();

        game.startGame();



    }




}
