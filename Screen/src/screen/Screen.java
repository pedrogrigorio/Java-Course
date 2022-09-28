package src.screen;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class Screen extends JFrame {

    JTextField num1;
    JTextField num2;
    JLabel title;

    public Screen() {

        setTitle("Tela");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton jButton = new JButton("Soma");
        jButton.setBounds(175, 350, 150, 70);
        jButton.setFont(new Font("Arial", Font.BOLD, 20));
        jButton.setForeground(new Color(237, 241, 238));
        jButton.setBackground(new Color(9, 10, 9));

        JButton jButton2 = new JButton();
        jButton2.setText("Subtração");
        jButton2.setBounds(375, 350, 150, 70);
        jButton2.setFont(new Font("Arial", Font.BOLD, 20));
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
        num1.setBounds(200, 200, 100, 100);
        num1.setFont(new Font("Arial", Font.ITALIC, 40));
        num1.setText("texto");
        
        add(num1);

        num2 = new JTextField("Clique aqui");
        num2.setBounds(400, 200, 100, 100);
        num2.setFont(new Font("Arial", Font.ITALIC, 40));
        num2.setText("texto");

        add(num2);

        JLabel num1Label = new JLabel("Numero 1");
        num1Label.setBounds(220, 301, 90, 50);
        num1Label.setFont(new Font("Arial", Font.PLAIN, 14));

        add(num1Label);

        JLabel num2Label = new JLabel("Numero 2");
        num2Label.setBounds(420, 301, 90, 50);
        num2Label.setFont(new Font("Arial", Font.PLAIN, 14));

        add(num2Label);

        title = new JLabel("CALCULADORA");
        title.setBounds(200, 100, 400, 50);
        title.setFont(new Font("Arial", Font.BOLD, 40));

        add(title);
        setVisible(true);
    }

    /* Método utilizando implements ActionListener
    @Override
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null, "Tudo certo", "Status", JOptionPane.WARNING_MESSAGE);
    }
    */

    private void teste(ActionEvent actionEvent){ 
        Integer numero1 = Integer.parseInt(num1.getText());
        Integer numero2 = Integer.parseInt(num2.getText());

        Integer soma = numero1 + numero2;
        title.setText("O resultado é: " + soma);

        //JOptionPane.showMessageDialog(null, "Resultado da soma: " + soma, "Status", JOptionPane.WARNING_MESSAGE);
    }

    private void outroteste(ActionEvent actionEvent){

        Integer numero1 = Integer.parseInt(num1.getText());
        Integer numero2 = Integer.parseInt(num2.getText());

        Integer sub = numero1 - numero2;
        title.setText("O resultado é: " + sub);
        //JOptionPane.showMessageDialog(null, "Resultado da subtração: " + sub, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
