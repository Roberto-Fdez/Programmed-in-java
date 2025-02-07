package sliderapp;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Slider Example"); // Hago un JFrame para que me mueste la ventana
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200); // Tamaño y anchura
            frame.setLayout(new BorderLayout());

            JPanel panel = new JPanel(); // Creo el JPanel nuevo
            JSlider slider = new JSlider(0, 100, 50); // Valores entre 0 y 100, inicial en 50 y creo el slider
            JLabel label = new JLabel("Valor: 50"); // Valor por defecto de inicio "50"

            slider.addChangeListener(new ChangeListener() { // Creo el nuevo listener
                public void stateChanged(ChangeEvent e) {
                    label.setText("Valor: " + slider.getValue()); // Le digo al label donde se verá el slider que me
                                                                  // coja su valor
                }
            });

            panel.add(slider); // Añado el slider
            panel.add(label); // Añado el label

            frame.add(panel, BorderLayout.CENTER); // Pongo el panel en el centro por estética y comodidad.
            frame.setVisible(true); // Hago visible la ventana
        });
    }
}