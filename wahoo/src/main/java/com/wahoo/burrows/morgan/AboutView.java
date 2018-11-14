package com.wahoo.burrows.morgan;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("about")
public class AboutView extends VerticalLayout {

    public AboutView() {

        Label aboutLabel = new Label("creator info, etc.");

        Button backButton = new Button("Got it!");
        backButton.addClickListener(event -> backButton.getUI().ifPresent(ui -> ui.navigate("")));

        add(aboutLabel, backButton);
    }
}
