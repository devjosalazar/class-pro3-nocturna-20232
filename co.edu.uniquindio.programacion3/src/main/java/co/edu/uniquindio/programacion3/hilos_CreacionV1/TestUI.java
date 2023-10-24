package co.edu.uniquindio.programacion3.hilos_CreacionV1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestUI {
    private JButton button1;
    private JPanel panel1;
    private JButton button2;

    public TestUI() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hola mundo");
            }
        });
    }
}
