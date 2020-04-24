package view;

import javax.swing.*;
import java.awt.*;

public class FieldPane extends JPanel {
    public FieldPane(int width, int height) {
        super();
        setLayout(new GridLayout(height, width));
        for (int tile = 0; tile < width*height; tile++) {
            add(new TilePanel());
        }
    }
}
