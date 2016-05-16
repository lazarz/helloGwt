package eu.lazar.hello.client.application.hello;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.uibinder.client.UiBinder;

/**
 * Created by lazar on 16. 5. 2016.
 */
public class Hello {
    interface HelloUiBinder extends UiBinder<DivElement, Hello> {
    }

    private static HelloUiBinder ourUiBinder = GWT.create(HelloUiBinder.class);

    public Hello() {
        DivElement rootElement = ourUiBinder.createAndBindUi(this);
    }
}