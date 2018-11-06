package com.wahoo.burrows.morgan;

import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Router;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.router.Route;

import java.awt.*;

/**
 * The main view contains a button and a click listener.
 */
@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        Button button = new Button("Click me",
                event -> Notification.show("Clicked!"));
        add(button);

        Button navbutton = new Button("nav to game");
        navbutton.addClickListener( event -> navbutton.getUI().ifPresent(ui -> ui.navigate("game")));
        add(navbutton);


    }



}


