package src.checkbox;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Screen extends JFrame {

    JCheckBox jCheckBox;

    public Screen() {

        setTitle("JCheckBox");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        jCheckBox = new JCheckBox("Termos de uso");
        jCheckBox.setBounds(10,10,150,150);

        jCheckBox.addActionListener(this::action);

        add(jCheckBox);
        setVisible(true);
    }

    private void action(ActionEvent actionEvent){ 
        if(jCheckBox.isSelected()){
            System.out.println("Termos aceitos.");
        }
        else{
            System.out.println("Termos não aceitos!");
        }
    }

}
