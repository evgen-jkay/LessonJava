package learn_java_easy_way.ch07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecretMessagesGUI extends JFrame {
    private JTextField txtKey;
    private JTextArea txtIn;
    private JTextArea txtOut;

    public String encode(String message, int keyVal) {
        String output = "";
        char key = (char) keyVal;

        for (int x = 0; x < message.length(); x++) {
            char input = message.charAt(x);
            if (input >= 'A' && input <= 'Z') {
                input += key;
                if (input > 'Z')
                    input -= 26;
                if (input > 'A')
                    input += 26;
            } else if (input >= 'a' && input <= 'z') {
                input += key;
                if (input > 'z')
                    input -= 26;
                if (input > 'a')
                    input += 26;
            } else if (input >= '0' && input <= '9') {
                input += (keyVal % 10);
                if (input > '9')
                    input -= 10;
                if (input > '0')
                    input += 10;
            }
            output += input;
        }
        return output;
    }

    private SecretMessagesGUI() {
        setTitle("Secret Message App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        txtIn = new JTextArea();
        txtIn.setBounds(10, 11, 564, 140);
        getContentPane().add(txtIn);

        txtOut = new JTextArea();
        txtOut.setBounds(10, 210, 564, 140);
        getContentPane().add(txtOut);

        txtKey = new JTextField();
        txtKey.setBounds(258, 173, 44, 20);
        getContentPane().add(txtKey);

        JLabel lblKey = new JLabel("Key:");
        lblKey.setBounds(202, 176, 46, 14);
        getContentPane().add(lblKey);

        JButton btnEncodeDecode = new JButton("Encode/Decode");
        btnEncodeDecode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String message = txtIn.getText();
                    int key = Integer.parseInt(txtKey.getText());
                    String output = encode(message, key);
                    txtOut.setText(output);
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null,
                            "Please enter a whole number value for the encryption key.");
                    txtKey.requestFocus();
                    txtKey.selectAll();
                }
            }
        });
        btnEncodeDecode.setBounds(312, 172, 144, 23);
        getContentPane().add(btnEncodeDecode);
    }

    public static void main(String[] args) {
        SecretMessagesGUI secretMessagesGUI = new SecretMessagesGUI();
        secretMessagesGUI.setSize(new Dimension(600, 400));
        secretMessagesGUI.setVisible(true);
    }
}
