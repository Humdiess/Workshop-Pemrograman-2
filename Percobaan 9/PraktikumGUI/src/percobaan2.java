import javax.swing.*;
import java.awt.*;

public class percobaan2 extends JFrame {

    private JLabel jLabel1, jLabel2;
    private JCheckBox jCheckBox1, jCheckBox2, jCheckBox3, jCheckBox4;
    private JTextField jTextField1, jTextField2, jTextField3, jTextField4, jTextField5;
    private JButton btnHitung, btnClear;

    public percobaan2() {
        initComponents();
    }

    private void initComponents() {
        // Setup JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Menu Makanan");
        setLayout(new GridLayout(7, 1, 5, 5));
        setSize(400, 350);

        // Label judul
        jLabel1 = new JLabel("MENU MAKANAN", SwingConstants.CENTER);
        jLabel1.setFont(new Font("Ink Free", Font.PLAIN, 24));
        jLabel1.setForeground(new Color(200, 0, 0));

        // Panel tiap menu
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        jCheckBox1 = new JCheckBox("Ayam Malay : 12.000");
        jTextField1 = new JTextField(5);
        jTextField1.setEditable(false);
        p1.add(jCheckBox1);
        p1.add(jTextField1);

        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        jCheckBox2 = new JCheckBox("Cibus : 15.000");
        jTextField2 = new JTextField(5);
        jTextField2.setEditable(false);
        p2.add(jCheckBox2);
        p2.add(jTextField2);

        JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        jCheckBox3 = new JCheckBox("Nasi Krawu : 2.000");
        jTextField3 = new JTextField(5);
        jTextField3.setEditable(false);
        p3.add(jCheckBox3);
        p3.add(jTextField3);

        JPanel p4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        jCheckBox4 = new JCheckBox("Es Joss : 70.000");
        jTextField4 = new JTextField(5);
        jTextField4.setEditable(false);
        p4.add(jCheckBox4);
        p4.add(jTextField4);

        // Panel hitung
        JPanel p5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        jLabel2 = new JLabel("Hitung : ");
        jTextField5 = new JTextField(10);
        jTextField5.setEditable(false);
        btnHitung = new JButton("Hitung");
        btnClear = new JButton("Clear");
        p5.add(jLabel2);
        p5.add(jTextField5);
        p5.add(btnHitung);
        p5.add(btnClear);

        // Tambah ke frame
        add(jLabel1);
        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);

        pack();

        // Event checkbox
        jCheckBox1.addActionListener(e -> {
            if (jCheckBox1.isSelected()) {
                jTextField1.setEditable(true);
                jTextField1.requestFocus();
            } else {
                jTextField1.setEditable(false);
                jTextField1.setText("");
            }
        });

        jCheckBox2.addActionListener(e -> {
            if (jCheckBox2.isSelected()) {
                jTextField2.setEditable(true);
                jTextField2.requestFocus();
            } else {
                jTextField2.setEditable(false);
                jTextField2.setText("");
            }
        });

        jCheckBox3.addActionListener(e -> {
            if (jCheckBox3.isSelected()) {
                jTextField3.setEditable(true);
                jTextField3.requestFocus();
            } else {
                jTextField3.setEditable(false);
                jTextField3.setText("");
            }
        });

        jCheckBox4.addActionListener(e -> {
            if (jCheckBox4.isSelected()) {
                jTextField4.setEditable(true);
                jTextField4.requestFocus();
            } else {
                jTextField4.setEditable(false);
                jTextField4.setText("");
            }
        });

        // Event hitung
        btnHitung.addActionListener(e -> {
            int total = 0;
            try {
                if (jCheckBox1.isSelected()) {
                    String val = jTextField1.getText();
                    if (val.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Jumlah Pesanan Belum Terisi");
                        return;
                    }
                    total += Integer.parseInt(val) * 12000;
                }
                if (jCheckBox2.isSelected()) {
                    String val = jTextField2.getText();
                    if (val.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Jumlah Pesanan Belum Terisi");
                        return;
                    }
                    total += Integer.parseInt(val) * 15000;
                }
                if (jCheckBox3.isSelected()) {
                    String val = jTextField3.getText();
                    if (val.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Jumlah Pesanan Belum Terisi");
                        return;
                    }
                    total += Integer.parseInt(val) * 2000;
                }
                if (jCheckBox4.isSelected()) {
                    String val = jTextField4.getText();
                    if (val.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Jumlah Pesanan Belum Terisi");
                        return;
                    }
                    total += Integer.parseInt(val) * 70000;
                }
                jTextField5.setText("" + total);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Input harus angka!");
            }
        });

        // Event clear
        btnClear.addActionListener(e -> {
            jTextField1.setText(""); jTextField1.setEditable(false);
            jTextField2.setText(""); jTextField2.setEditable(false);
            jTextField3.setText(""); jTextField3.setEditable(false);
            jTextField4.setText(""); jTextField4.setEditable(false);
            jTextField5.setText("");
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new percobaan2().setVisible(true));
    }
}