//Roberto Fernández del Barrio//
//DNI: 43232819H//
//Fecha de finalización de la tarea: 2025-02-06,20:22.//

package prouex6;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class PROUEX6 {
    public static void main(String[] args) {

        // Creo el JPanel en el que estará todo distribuido correctamente
        JPanel panelPrincipal = new JPanel();

        // Creo la ventana en la que se podrá ver todas las operaciones que vayamos ha
        // hacer en la calculadora
        JFrame calculadora = new JFrame("Calculadora hecha con ventanas de Java");
        calculadora.add(panelPrincipal);
        calculadora.setSize(350, 200);
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculadora.setLayout(new GridLayout(2, 4, 7, 2));

        // Creo los text field para que el usuario pueda introducir todos los número que
        // el desee
        JTextField textField1 = new JTextField("");
        JTextField textField2 = new JTextField("");
        calculadora.add(textField1);
        calculadora.add(textField2);

        // Creo el label para mostrar el resultado que saldrá de la operación
        JLabel resultado = new JLabel("");
        calculadora.add(resultado);

        // Creo el botón para hacer la suma de los número introducidos por el usuario
        JButton botonDeSuma = new JButton("+");
        calculadora.add(botonDeSuma);

        // Creo el botón para hacer la resta de los número introducidos por el usuario
        JButton botonDeResta = new JButton("-");
        calculadora.add(botonDeResta);

        // Creo el botón para hacer la multiplicación de los número introducidos por el
        // usuario
        JButton botonDeMultiplicacion = new JButton("×");
        calculadora.add(botonDeMultiplicacion);

        // Creo el botón para hacer la división de los número introducidos por el
        // usuario
        JButton botonDeDivision = new JButton("÷");
        calculadora.add(botonDeDivision);

        // Creo un Listener nuevo para que coja los valores que ha ingresado el usuario
        // para que la calculadora haga su operación
        ActionListener operacion = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Try en el que creo 2 valores de los cuales serán lo que el usuario ingrese
                // para poder realizar más tarde el resultado y mostrarlo en el JLabel creado
                // anteriormente
                try {
                    double valor1 = Double.parseDouble(textField1.getText());
                    double valor2 = Double.parseDouble(textField2.getText());
                    if (e.getSource() == botonDeSuma) {
                        double resultadoSuma = valor1 + valor2;
                        resultado.setText(String.valueOf(resultadoSuma));
                    } else if (e.getSource() == botonDeResta) {
                        double resultadoResta = valor1 - valor2;
                        resultado.setText(String.valueOf(resultadoResta));
                    } else if (e.getSource() == botonDeMultiplicacion) {
                        double resultadoMultiplicacion = valor1 * valor2;
                        resultado.setText(String.valueOf(resultadoMultiplicacion));
                    }
                    // Hago un if para decir que si el valor2 es = a 0 no se puede dividir entre él
                    // mas una división en el cual su divisor es 0, dará un resultado infinito.
                    // Luego continuo con la operación.
                    if (valor2 == 0) {
                        JOptionPane.showMessageDialog(null, "No se puede dividir entre 0", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    } else if (e.getSource() == botonDeDivision) {
                        double resultadoDivision = valor1 / valor2;
                        resultado.setText(String.valueOf(resultadoDivision));
                    }

                    // Mostrará un error en el resultado para que sepa el usuario que no está bien
                    // hecha la operación
                } catch (Exception ew) {
                    JOptionPane.showMessageDialog(null, "Error en la operación", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        };
        // Añado en el botón de cada una de las operaciones el ActionListener de
        // operación y así me pilla las operaciones.
        botonDeDivision.addActionListener(operacion);
        botonDeMultiplicacion.addActionListener(operacion);
        botonDeResta.addActionListener(operacion);
        botonDeSuma.addActionListener(operacion);

        // Pongo los UIManager para que la ventana se vea de una manera u otra pero solo
        // hago uso de 1. (El resto se quedarán comentados para no perderlos).
        try {

            JFrame.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            // UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            // UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            // UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        } catch (Exception e) {
        }

        // Hago la calculadora visible
        calculadora.setVisible(true);
    }
}