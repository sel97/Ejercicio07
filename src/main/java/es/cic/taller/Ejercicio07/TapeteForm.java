package es.cic.taller.Ejercicio07;

import com.vaadin.ui.FormLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class TapeteForm extends FormLayout{
	
	private VerticalLayout layout = new VerticalLayout();
    
	private TextField carta1 = new TextField("Carta 1: ");
    
    private TextField carta2 = new TextField("Carta 2:");
    
    private TextField carta3 = new TextField("Carta 3: ");
    
    private TextField carta4 = new TextField("Carta 4: ");
    
    
    
    
    
private MyUI myUI;
    
    public TapeteForm(MyUI myUI) {
        this.myUI = myUI;
        addComponents(carta1, carta2, carta3, carta4);
}

}
