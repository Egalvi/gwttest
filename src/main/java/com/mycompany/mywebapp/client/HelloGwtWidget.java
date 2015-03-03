package com.mycompany.mywebapp.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

/**
 * Created by Alekzander on 03.03.2015.
 */
public class HelloGwtWidget extends Composite {
    private static HelloGWTWidgetUiBinder uiBinder = GWT.create(HelloGWTWidgetUiBinder.class);
    @UiField
    TextBox authorTextBox;
    @UiField
    Button addButton;

    @UiHandler("addButton")
    void handleAddButtonClick(ClickEvent clickEvent) {
        Window.alert("addButton clicked");
    }


    public HelloGwtWidget() {
        initWidget(uiBinder.createAndBindUi(this));
    }


    interface HelloGWTWidgetUiBinder extends UiBinder<Widget, HelloGwtWidget> {
    }

}
