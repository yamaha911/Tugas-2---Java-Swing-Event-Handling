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

public class MainFrame extends JFrame {
    JTextField tfPanjang, tfLebar, tfTinggi;
    JLabel lblLuas, lblKeliling, lblVolume, lblLuasPermukaan;

    public MainFrame(String username, String gender) {
        setTitle("Halaman Utama");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        
        JLabel lblWelcome = new JLabel("Welcome, " + gender + " " + username);
        lblWelcome.setFont(new Font("Arial", Font.BOLD, 16));
        lblWelcome.setHorizontalAlignment(JLabel.CENTER);
        add(lblWelcome, BorderLayout.NORTH);

        
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 5, 5));

        inputPanel.add(new JLabel("Panjang"));
        tfPanjang = new JTextField();
        inputPanel.add(tfPanjang);

        inputPanel.add(new JLabel("Lebar"));
        tfLebar = new JTextField();
        inputPanel.add(tfLebar);

        inputPanel.add(new JLabel("Tinggi"));
        tfTinggi = new JTextField();
        inputPanel.add(tfTinggi);

        add(inputPanel, BorderLayout.CENTER);

        
        JPanel buttonPanel = new JPanel(new FlowLayout());

        JButton btnHitung = new JButton("Hitung");
        JButton btnReset = new JButton("Reset");

        buttonPanel.add(btnHitung);
        buttonPanel.add(btnReset);

        add(buttonPanel, BorderLayout.SOUTH);

        
        JPanel hasilPanel = new JPanel(new GridLayout(4, 2));

        hasilPanel.add(new JLabel("Luas Persegi"));
        lblLuas = new JLabel("-");
        hasilPanel.add(lblLuas);

        hasilPanel.add(new JLabel("Keliling Persegi"));
        lblKeliling = new JLabel("-");
        hasilPanel.add(lblKeliling);

        hasilPanel.add(new JLabel("Volume Balok"));
        lblVolume = new JLabel("-");
        hasilPanel.add(lblVolume);

        hasilPanel.add(new JLabel("Luas Permukaan Balok"));
        lblLuasPermukaan = new JLabel("-");
        hasilPanel.add(lblLuasPermukaan);

        add(hasilPanel, BorderLayout.EAST);

        
        btnHitung.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double p = Double.parseDouble(tfPanjang.getText());
                    double l = Double.parseDouble(tfLebar.getText());
                    double t = Double.parseDouble(tfTinggi.getText());

                    
                    double s = p;

                    
                    double luas = s * s;
                    double keliling = 4 * s;

                    
                    double volume = p * l * t;
                    double luasPermukaan = 2 * (p*l + p*t + l*t);

                    lblLuas.setText(String.valueOf(luas));
                    lblKeliling.setText(String.valueOf(keliling));
                    lblVolume.setText(String.valueOf(volume));
                    lblLuasPermukaan.setText(String.valueOf(luasPermukaan));

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Input harus angka!");
                }
            }
        });

        
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tfPanjang.setText("");
                tfLebar.setText("");
                tfTinggi.setText("");

                lblLuas.setText("-");
                lblKeliling.setText("-");
                lblVolume.setText("-");
                lblLuasPermukaan.setText("-");
            }
        });

        setVisible(true);
    }
}
