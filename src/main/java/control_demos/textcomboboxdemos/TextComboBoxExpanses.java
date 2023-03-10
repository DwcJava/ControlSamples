package control_demos.textcomboboxdemos;

import java.util.HashMap;
import java.util.Map;

import org.dwcj.App;
import org.dwcj.controls.panels.AppPanel;
import org.dwcj.controls.textcombobox.TextComboBox;
import org.dwcj.exceptions.DwcAppInitializeException;



public class TextComboBoxExpanses extends App{

    @Override
    public void run() throws DwcAppInitializeException { 

        AppPanel panel = new AppPanel();
        panel.setStyle("display", "grid");
        panel.setStyle("grid-template-columns", "1fr 1fr 1fr");
        panel.setStyle("padding", "10px");
        panel.setStyle("gap", "50px");
        panel.setStyle("height", "100%");

        Map<Object, String> data = new HashMap<>();
        data.put("Random Data1", "Random Data");
        data.put("Random Data2", "Some Data");
        data.put("Random Data3", "More Data");
        data.put("Random Data4", "Test Data");
        

        TextComboBox tcb1 = new TextComboBox().setExpanse(TextComboBox.Expanse.XSMALL).setAttribute("placeholder", "XSMALL").setStyle("grid-column", "1");
        TextComboBox tcb2 = new TextComboBox().setExpanse(TextComboBox.Expanse.SMALL).setAttribute("placeholder", "SMALL").setStyle("grid-column", "2");
        TextComboBox tcb3 = new TextComboBox().setExpanse(TextComboBox.Expanse.MEDIUM).setAttribute("placeholder", "MEDIUM").setStyle("grid-column", "3");
        TextComboBox tcb4 = new TextComboBox().setExpanse(TextComboBox.Expanse.LARGE).setAttribute("placeholder", "LARGE").setStyle("grid-column", "1");
        TextComboBox tcb5 = new TextComboBox().setExpanse(TextComboBox.Expanse.XLARGE).setAttribute("placeholder", "XLARGE").setStyle("grid-column", "2");

        panel.add(tcb1, tcb2, tcb3, tcb4, tcb5);   
        tcb1.setItems(data); 
        tcb2.setItems(data); 
        tcb3.setItems(data); 
        tcb4.setItems(data); 
        tcb5.setItems(data); 

    }
    
}
    