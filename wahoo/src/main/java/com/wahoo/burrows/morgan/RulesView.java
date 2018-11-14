package com.wahoo.burrows.morgan;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;



@Route("rules")
public class RulesView extends VerticalLayout {

    public RulesView(){

        Label rulesLabel = new Label("rules, etc.");

        Button backButton = new Button("Got it!");
        backButton.addClickListener(event -> backButton.getUI().ifPresent(ui -> ui.navigate("")));

        add(rulesLabel, backButton);
    }

}
