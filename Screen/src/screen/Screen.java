package src.screen;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class Screen extends JFrame {
    public Screen() {

        setTitle("Tela");
        setVisible(true);
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);
        JButton jButton = new JButton("Clique aqui");
        jButton.setBounds(100, 200, 250, 70);
        jButton.setFont(new Font("Arial", Font.BOLD, 40));
        jButton.setForeground(new Color(237, 241, 238));
        jButton.setBackground(new Color(9, 10, 9));

        JButton jButton2 = new JButton();
        jButton2.setText("Outro botão");
        jButton2.setBounds(0, 0, 150, 70);
        jButton2.setFont(new Font("Arial", Font.ITALIC, 20));
        jButton2.setForeground(new Color(237, 241, 238));
        jButton2.setBackground(new Color(9, 10, 9));

        add(jButton);
        add(jButton2);

        /* Método utilizando implements ActionListener
         *jButton.addActionListener(this);
         *jButton2.addActionListener(this);
         */
        jButton.addActionListener(this::teste);
        jButton2.addActionListener(this::outroteste);
    }

    /* Método utilizando implements ActionListener
    @Override
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null, "Tudo certo", "Status", JOptionPane.WARNING_MESSAGE);
    }
    */

    private void teste(ActionEvent actionEvent){
        JOptionPane.showMessageDialog(null, "Tudo certo", "Status", JOptionPane.WARNING_MESSAGE);
    }

    private void outroteste(ActionEvent actionEvent){
        JOptionPane.showMessageDialog(null, "Tudo errado", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
