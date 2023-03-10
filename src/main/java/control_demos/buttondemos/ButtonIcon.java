package control_demos.buttondemos;

import org.dwcj.App;
import org.dwcj.annotations.InlineStyleSheet;
import org.dwcj.controls.button.Button;
import org.dwcj.controls.panels.AppPanel;
import org.dwcj.exceptions.DwcAppInitializeException;

@InlineStyleSheet(value = "css/buttonstyles/icon_styles.css", local = true)

public class ButtonIcon extends App {
    
    @Override
    public void run() throws DwcAppInitializeException { 

        AppPanel panel = new AppPanel();
        panel.addClassName("appPanel");
        
        Button b1 = new Button ("<html><bbj-icon name=\"alien\"></bbj-icon> Icon Left</html>");
        panel.add(b1);
        Button b2= new Button ("<html>Icon Right <bbj-icon name=\"alien\"></bbj-icon></html>");
        panel.add(b2);
        Button b3 = new Button ("<html><bbj-icon name=\"alien\"></bbj-icon></html>");
        panel.add(b3);


    }
    
}
