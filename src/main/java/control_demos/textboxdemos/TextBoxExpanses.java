package control_demos.textboxdemos;

import org.dwcj.App;
import org.dwcj.controls.panels.AppPanel;
import org.dwcj.controls.textbox.TextBox;
import org.dwcj.exceptions.DwcAppInitializeException;



public class TextBoxExpanses extends App{

    @Override
    public void run() throws DwcAppInitializeException { 

        AppPanel panel = new AppPanel();
        panel.setStyle("display", "flex");
        panel.setStyle("padding", "10px");
        panel.setStyle("gap", "50px");
        

        TextBox t1 = new TextBox().setExpanse(TextBox.Expanse.XSMALL).setAttribute("placeholder", "XSMALL");
        TextBox t2 = new TextBox().setExpanse(TextBox.Expanse.SMALL).setAttribute("placeholder", "SMALL");
        TextBox t3 = new TextBox().setExpanse(TextBox.Expanse.MEDIUM).setAttribute("placeholder", "MEDIUM");
        TextBox t4 = new TextBox().setExpanse(TextBox.Expanse.LARGE).setAttribute("placeholder", "LARGE");
        TextBox t5 = new TextBox().setExpanse(TextBox.Expanse.XLARGE).setAttribute("placeholder", "XLARGE");

        panel.add(t1,t2,t3,t4,t5);    

    }
    
}
    