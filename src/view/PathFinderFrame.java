package view;

import javax.swing.*;
import java.awt.*;

public class PathFinderFrame extends JFrame {
    public PathFinderFrame() throws HeadlessException {
        super("Pathfinder");
        setSize(1500, 1000);
        add(new FieldPane(35, 25), BorderLayout.CENTER);
        add(new DashboardPanel(), BorderLayout.WEST);
        setVisible(true);
    }
}
