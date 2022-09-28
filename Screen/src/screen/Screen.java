package src.screen;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class Screen extends JFrame {

    JTextField num1;
    JTextField num2;

    public Screen() {

        setTitle("Tela");
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

        num1 = new JTextField("Clique aqui");
        num1.setBounds(100, 100, 100, 100);
        num1.setFont(new Font("Arial", Font.ITALIC, 40));
        num1.setText("texto");

        num2 = new JTextField("Clique aqui");
        num2.setBounds(200, 100, 100, 100);
        num2.setFont(new Font("Arial", Font.ITALIC, 40));
        num2.setText("texto");

        add(num1);
        add(num2);

        setVisible(true);
    }

    /* Método utilizando implements ActionListener
    @Override
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null, "Tudo certo", "Status", JOptionPane.WARNING_MESSAGE);
    }
    */

    private void teste(ActionEvent actionEvent){
        JOptionPane.showMessageDialog(null, "Aviso!", "Status", JOptionPane.WARNING_MESSAGE);
    }

    private void outroteste(ActionEvent actionEvent){

        Integer numero1 = Integer.parseInt(num1.getText());
        Integer numero2 = Integer.parseInt(num2.getText());

        Integer soma = numero1 + numero2;

        JOptionPane.showMessageDialog(null, "Resultado = " + soma, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
