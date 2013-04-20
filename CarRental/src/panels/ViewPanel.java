package panels;
import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class ViewPanel extends JPanel {
	public ViewPanel(){	
		setBorder(BorderFactory.createLineBorder(getBackground(), 15));
		setPreferredSize(new Dimension(800,600));
	}
}
