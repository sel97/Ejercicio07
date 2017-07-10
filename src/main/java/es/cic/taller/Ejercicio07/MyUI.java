package es.cic.taller.Ejercicio07;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {
	
	VerticalLayout layout = new VerticalLayout();
	
    private TapeteForm tapeteForm1 = new TapeteForm(this);
    
    private TapeteForm tapeteForm2 = new TapeteForm(this);
    
    private TapeteForm tapeteForm3 = new TapeteForm(this);
    
    private TapeteForm tapeteForm4 = new TapeteForm(this);

    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	
    	
        
        layout.addComponents(tapeteForm1, tapeteForm2,tapeteForm3,tapeteForm4);
        
        setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
