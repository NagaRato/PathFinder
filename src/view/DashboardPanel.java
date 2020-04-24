package view;

import javax.swing.*;
import java.awt.*;

public class DashboardPanel extends JPanel {
    public DashboardPanel() {
        super();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new Label("Pathfinder"));
    }
}
