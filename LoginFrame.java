/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ASUS
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame {
    JTextField tfUsername;
    JPasswordField pfPassword;
    JRadioButton rbLaki, rbPerempuan;
    JButton btnLogin;

    public LoginFrame() {
        setTitle("Login Page");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        
        JLabel lblTitle = new JLabel("Selamat Datang!");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        add(lblTitle, BorderLayout.NORTH);

        
        JPanel panel = new JPanel(new GridLayout(5, 2, 5, 5));

        panel.add(new JLabel("Username"));
        tfUsername = new JTextField();
        panel.add(tfUsername);

        panel.add(new JLabel("Password"));
        pfPassword = new JPasswordField();
        panel.add(pfPassword);

        panel.add(new JLabel("Jenis Kelamin"));
        JPanel genderPanel = new JPanel(new FlowLayout());
        rbLaki = new JRadioButton("Laki-laki");
        rbPerempuan = new JRadioButton("Perempuan");

        ButtonGroup bg = new ButtonGroup();
        bg.add(rbLaki);
        bg.add(rbPerempuan);

        genderPanel.add(rbLaki);
        genderPanel.add(rbPerempuan);

        panel.add(genderPanel);

        add(panel, BorderLayout.CENTER);

        
        btnLogin = new JButton("Login");
        add(btnLogin, BorderLayout.SOUTH);

        
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = tfUsername.getText();
                String password = new String(pfPassword.getPassword());

                if (password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Password tidak boleh kosong!");
                } else {
                    String gender = rbLaki.isSelected() ? "Mr." : "Mrs.";
                    new MainFrame(username, gender);
                    dispose();
                }
            }
        });

        setVisible(true);
    }
}
